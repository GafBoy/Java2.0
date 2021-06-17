public class Calculator {
    private final String operation;
    private final Float first;
    private final Float second;

    public Calculator(Float first, String operation, Float second) {
        this.operation = operation;
        this.first = first;
        this.second = second;
    }

    public Float calc() {
        Float result = null;
        switch (operation) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second == 0) {
                    throw new ArithmeticException("Делить на ноль нельзя!");
                }
                result = first / second;
                break;
            default:
                throw new RuntimeException("Введенная вами операция '"+ operation +"' отсутствует");
        }
        return result;
    }
}