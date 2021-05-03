import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        Float first = console.nextFloat();
        System.out.print("Введите дробное число: ");
        Float second = console.nextFloat();
        System.out.printf( "Сумма= %.4f", first + second);
    }
}
