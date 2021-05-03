import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 1(чтобы запустить калькулятор) или 2(чтобы запустить поиск макс. элемента в массиве): ");
        Integer number = console.nextInt();
        if (number.equals(1)){
            System.out.println("Запускаем калькулятор.");
            calculator();
        }
        if (number.equals(2)){
            System.out.println("Запускаем поиск самого длинного слова");
            findMax();
        }
    }

    private static void calculator() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        Float first = console.nextFloat();
        System.out.print("Введите символ операции (+,-,/,*): ");
        String operation = console.next();
        System.out.print("Введите дробное число: ");
        Float second = console.nextFloat();
        if (operation.equals("+")) {
            System.out.printf("%.4f + %.4f = %.4f", first, second, first + second);
        }
        if (operation.equals("-")) {
            System.out.printf("%.4f - %.4f = %.4f", first, second, first - second);
        }
        if (operation.equals("*")) {
            System.out.printf("%.4f * %.4f = %.4f", first, second, first * second);
        }
        if (operation.equals("/")) {
            System.out.printf("%.4f / %.4f = %.4f", first, second, first / second);
        }
    }
    private static void findMax(){
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество слов в массиве: ");
        Integer n = console.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите слово " + (i+1) + ":" );
            arr[i] = console.next();
        }
        Integer max = -1;
        String maxWord = " ";
        for (int i = 0; i < n; i++) {
           String word = arr[i];
            if (word.length() > max) {
                max = word.length();
                maxWord = word;

            }
        }
        System.out.println("Самое длинное слово в массиве: " + maxWord);
    }
}
