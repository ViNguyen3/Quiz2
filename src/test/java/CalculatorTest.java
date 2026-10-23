import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void sumPositiveNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(7, calculator.sum(3, 4));
    }

    @Test
    void sumNegativeNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(-7, calculator.sum(-3, -4));
    }

    @Test
    void sumWithZero() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.sum(5, 0));
    }
}