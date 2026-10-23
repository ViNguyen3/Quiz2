import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateCheckerTest {

    @Test
    void januaryHas31Days() {
        DateChecker checker = new DateChecker();

        assertTrue(
                checker.has31Days(Month.JANUARY),
                "January should have 31 days"
        );
    }
}