import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> allWordsFromFile = new WordsReader("26_04.txt", " ").getAllWordsFromFile();
        Map<String, Integer> wordsCount = new TreeMap<>(); //отсортирует слова по алфавиту и сохранит их порядок
        int max = 1;
        Set<String> theMostRepeatedWords = new HashSet<>();
        for (String word : allWordsFromFile) {
            if (!word.equals("")){
                String lowerCase = word.toLowerCase().replace("\n", "");
                if (wordsCount.containsKey(lowerCase)){
                    Integer count = wordsCount.get(lowerCase);
                    wordsCount.put(lowerCase, count + 1);
                    if (max < (count + 1)){
                        max = count + 1;
                    }
                }else {
                    wordsCount.put(lowerCase, 1);
                }
            }
        }
        for (String key : wordsCount.keySet()) {
            System.out.println("Слово '" + key + "' встречалось " + wordsCount.get(key) + " раз");
            if (wordsCount.get(key).equals(max)){
                theMostRepeatedWords.add(key);
            }
        }

        if (theMostRepeatedWords.size() == 0){
            System.out.println("Наиболее повторяющихся слов нет");
        }else {
            System.out.println("Самые часто встречающиеся слова: " + String.join(",",theMostRepeatedWords));
            System.out.println("Они встретились '" + max + "' раз");
        }
        System.out.println("Общее количество слов: " + wordsCount.keySet().size());
    }


}