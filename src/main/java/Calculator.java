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
        try {
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
                if (second == 0){
                    throw new ArithmeticException("Делить на ноль нельзя!");
                }
                result = first / second;
            }
        }catch (ArithmeticException ex){
            throw ex;
        } catch (RuntimeException ex){
            ex.printStackTrace();
        }
        return result;
    }
}