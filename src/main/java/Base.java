import java.util.Scanner;

public class Base {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();
        calculator
                .addCommand("+", new Plus())
                .addCommand("-", new Minus())
                .addCommand("/", new Divide())
                .addCommand("*", new Multiply());
        System.out.println("Добро пожаловать в программу Калькулятор");
        while(true){
            System.out.println("Введите 1 для расчета и 2 для выхода из программы:");
            int i = scanner.nextInt();
            if (i == 1){
                calculator.getFirstArgFromUser();
                calculator.getCommandFromUser();
                calculator.getSecondArgFromUser();
                calculator.printResult();
            }else if (i == 2){
                break;
            }else {
                System.out.println("Введите пожалуйста только 1 или 2!");
            }
        }
    }
}