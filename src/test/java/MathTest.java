
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathTest {
    private Math math;
    @BeforeEach
    void setup() {
        this.math = new Math();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    public void whenPerformAddOperationThenReturnCorrectResult() {
        double num1 = 2;
        double num2 = 2;
        double result = math.add(num1, num2);
        assertEquals(4, result, "Actual result do not match to expected result!");
    }

    @Test
    public void whenPerformSubtractOperationThenReturnCorrectResult() {
        double num1 = 4;
        double num2 = 2;
        double result = math.subtract(num1, num2);
        assertEquals(2, result, "Actual result do not match to expected result!");
    }

    @Test
    public void whenPerformMultiplyOperationThenReturnCorrectResult() {
        double num1 = 3;
        double num2 = 3;
        double result = math.multiply(num1, num2);
        assertEquals(9, result, "Actual result do not match to expected result!");
    }

    @Test
    public void whenPerformDivideOperationThenReturnCorrectResult() {
        double num1 = 9;
        double num2 = 3;
        double result = math.divide(num1, num2);
        assertEquals(3, result, "Actual result do not match to expected result!");
    }

    @Test
    public void whenDivideByZeroThrowExceptionWithASpecificMessage() {
        String message = "You can not divide bu zero";
        double num1 = 9;
        double num2 = 0;
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> math.divide(num1, num2));
        assertEquals(message, exception.getMessage());
    }

    @Test
    public void whenPerformPowOperationThenReturnCorrectResult() {
        double num = 3;
        double result = math.pow(num);
        assertEquals(9, result);
    }

}
