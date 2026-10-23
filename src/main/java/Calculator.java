public class Calculator {

    public int sum(int x, int y) {
        return x + y;
    }

    @Test
    void subtractPositiveNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    void subtractNegativeNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(-5, calculator.subtract(-10, -5));
    }

    @Test
    void multiplyPositiveNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    void multiplyByZero() {
        Calculator calculator = new Calculator();

        assertEquals(0, calculator.multiply(10, 0));
    }

    @Test
    void multiplyNegativeNumbers() {
        Calculator calculator = new Calculator();

        assertEquals(-20, calculator.multiply(-4, 5));
    }
}