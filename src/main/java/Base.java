import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); // Создаем объект для считывания данных с консоли.
        System.out.print("Введите дробное число: "); // Выводим на консоль сообщение.
        Float first = console.nextFloat(); // Считываем введенное пользователем число.
        System.out.print("Введите дробное число: ");
        Float second = console.nextFloat();
        System.out.printf( "Сумма= %.4f", add(first, second)); // Выводим результат с помощью форматирования.
    }

    /*
     * Метод для сложения двух чисел с плавающей запятой
     * @param first - первый аргумент
     * @param second - второй аргумент
    * */
    public static Float add (Float first, Float second){
        return first+second;
    }
}