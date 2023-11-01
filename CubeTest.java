import static org.junit.Assert.*;
import org.junit.Test;

public class CubeTest {
    @Test
    public void testCubePositiveNumber() {
        assertEquals(27, NumberCalculator.cube(3));
    }

    @Test
    public void testCubeZero() {
        assertEquals(0, NumberCalculator.cube(0));
    }

    @Test
    public void testCubeNegativeNumber() {
        assertEquals(-64, NumberCalculator.cube(-4));
    }
}