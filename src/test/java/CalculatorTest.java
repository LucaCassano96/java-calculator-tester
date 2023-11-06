import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    Random random = new Random();

    @Test
    @DisplayName("Test Add with Random Numbers")
    public void testAddWithRandomNumbers() {
        float num1 = random.nextFloat() * 100;
        float num2 = random.nextFloat() * 100;
        double result = calculator.add(num1, num2);

        assertEquals(num1 + num2, result, 0.001);
    }

    @Test
    @DisplayName("Test Subtract with Random Numbers")
    public void testSubtractWithRandomNumbers() {
        float num1 = random.nextFloat() * 100;
        float num2 = random.nextFloat() * 100;
        float result = calculator.subtract(num1, num2);

        assertEquals(num1 - num2, result, 0.001);
    }

    @Test
    @DisplayName("Test Multiply with Random Numbers")
    public void testMultiplyWithRandomNumbers() {
        float num1 = random.nextFloat() * 100;
        float num2 = random.nextFloat() * 100;
        float result = calculator.multiply(num1, num2);

        assertEquals(num1 * num2, result, 0.001);
    }

    @Test
    @DisplayName("Test Divide with Random Numbers")
    public void testDivideWithRandomNumbers() {
        float num1 = random.nextFloat() * 100;
        float num2 = random.nextFloat() * 100;
        if (num2 != 0) {
            float result = calculator.divide(num1, num2);
            assertEquals(num1 / num2, result, 0.001);
        }
    }
}