import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.provider.EnumSource;

public class DateCheckerTest {

    @Test
    void januaryHas31Days() {
        DateChecker checker = new DateChecker();

        assertTrue(
                checker.has31Days(Month.JANUARY),
                "January should have 31 days"
        );
    }

    @Test
    void aprilDoesNotHave31Days() {
        DateChecker checker = new DateChecker();

        assertFalse(
                checker.has31Days(Month.APRIL),
                "April should not have 31 days"
        );
    }

    @ParameterizedTest
    @EnumSource(
            value = Month.class,
            names = {
                    "JANUARY",
                    "MARCH",
                    "MAY",
                    "JULY",
                    "AUGUST",
                    "OCTOBER",
                    "DECEMBER"
            }
    )
    void monthsWith31DaysReturnTrue(Month month) {
        DateChecker checker = new DateChecker();

        assertTrue(
                checker.has31Days(month),
                month + " should have 31 days"
        );
    }


    @Test
    void februaryDoesNotHave31Days() {
        DateChecker checker = new DateChecker();

        assertFalse(
                checker.has31Days(Month.FEBRUARY),
                "February should not have 31 days"
        );
    }

    @Test
    void nullMonthThrowsException() {
        DateChecker checker = new DateChecker();

        assertThrows(
                IllegalArgumentException.class,
                () -> checker.has31Days(null)
        );
    }
}