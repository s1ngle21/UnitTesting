

public class Math implements MathOperations{

    @Override
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("You can not divide bu zero");
        }
        return num1 / num2;
    }

    @Override
    public double pow(double num) {
        return num * num;
    }
}
