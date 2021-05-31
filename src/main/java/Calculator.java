import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    private final Scanner scanner = new Scanner(System.in);
    private final Map<String, Command> commands = new HashMap<>();
    private Float firstArg;
    private Float secondArg;
    private Command currentCommand;

    public Calculator addCommand(String operation, Command command){
        this.commands.put(operation, command);
        return this;
    }

    public void getFirstArgFromUser(){
        System.out.println("Введите число:");
        this.firstArg = this.scanner.nextFloat();
    }

    public void getSecondArgFromUser(){
        System.out.println("Введите число:");
        this.secondArg = this.scanner.nextFloat();
    }

    public void getCommandFromUser(){
        System.out.println("Введите одну из следующих команд: "+ this.commands.keySet());
        this.currentCommand =  this.commands.get(this.scanner.next());
    }

    public void printResult(){
        System.out.printf("Результат: %.3f", this.getResultAndClear());
        System.out.println();
    }

    public Float getResultAndClear(){
        Float res = currentCommand.apply(this.firstArg, this.secondArg);
        this.currentCommand = null;
        this.firstArg = null;
        this.secondArg = null;
        return res;
    };

}

