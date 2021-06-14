import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsReader {
    private String fileName;
    private String delimiter;

    public WordsReader(String fileName, String delimiter) {
        this.fileName = fileName;
        this.delimiter = delimiter;
    }

    public List<String> getAllWordsFromFile(){
        InputStream wordsStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(this.fileName);
        String s = readFromInputStream(wordsStream);
        String[] split = s.split(this.delimiter);
        return new ArrayList<>(Arrays.asList(split));
    }

    private String readFromInputStream(InputStream inputStream) {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultStringBuilder.toString();
    }
}