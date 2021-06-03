/*
 * Сделал как вы попросили
 * Примечание: Не очень понимаю почему такую реализацию можно назвать "ООП"?
 * На мой взгляд это можно заменить просто методом "calc" - и ничего не поменяется.
 *
 * */
public class Calculator {
    private final String operation;
    private final Float first;
    private final Float second;

    public Calculator(Float first, String operation, Float second) {
        this.operation = operation;
        this.first = first;
        this.second = second;
    }

    public Float calc(){
        Float result = null;
        if (operation.equals("+")) {
            result = first + second;
        }
        if (operation.equals("-")) {
            result = first - second;
        }
        if (operation.equals("*")) {
            result = first * second;
        }
        if (operation.equals("/")) {
            result = first / second;
        }
        return result;
    }
}