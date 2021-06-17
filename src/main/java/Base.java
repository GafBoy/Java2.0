import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите 1 для расчета или 2 для выхода из программы");
                int i = scanner.nextInt();
                if (i == 2) {
                    System.out.println("До свидания!");
                    break;
                } else if (i == 1) {
                    System.out.println("Введите первое число:");
                    float first = scanner.nextFloat();
                    System.out.println("Введите операцию: (+, -, *, /)");
                    String operation = scanner.next();
                    System.out.println("Введите второе число:");
                    float second = scanner.nextFloat();
                    Float result = new Calculator(first, operation, second).calc();
                    System.out.printf("Результат: %.4f\n", result);
                } else {
                    System.out.println("Вводите только 1 или 2 пожалуйста!");
                }
            }catch (ArithmeticException ex){
                System.out.println(ex.getMessage());
            }catch (RuntimeException ex){
                System.out.print("Произошла ошибка связанная с введенными значениями:");
                System.out.println("'"+ ex.getMessage() + "'");
                System.out.println("Пожалуйста вводите только допустимые значения\n");
                scanner.nextLine();
            }
        }
    }
}