package MVPcalc;

public class CalculatorModel {
    private int result;

    public void add(int number1, int number2) {
        result = number1 + number2;
    }
    public void multi(int number1, int number2) {
        result = number1 * number2;
    }
    public void subtract(int number1, int number2) {
        result = number1 - number2;
    }
    public void divide(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed!!!!.");
        }
        else{
            result = number1 / number2;
        }

    }



    public double getResult() {
        return result;
    }
}


