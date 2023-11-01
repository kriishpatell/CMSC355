import static org.junit.Assert.*;
import org.junit.Test;

public class SquareTest {
    @Test
    public void testSquarePositiveNumber() {
        assertEquals(9, NumberCalculator.square(3));
    }

    @Test
    public void testSquareZero() {
        assertEquals(0, NumberCalculator.square(0));
    }

    @Test
    public void testSquareNegativeNumber() {
        assertEquals(16, NumberCalculator.square(-4));
    }
}