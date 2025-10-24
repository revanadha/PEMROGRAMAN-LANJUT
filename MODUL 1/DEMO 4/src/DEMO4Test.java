import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DEMO4Test {

    @Test
    public void testFindMin_PositiveNumbers() {
        // Skenario 1: input positif
        assertEquals(1, DEMO4.findMin(1, 2, 3));
    }

    @Test
    public void testFindMin_NegativeNumbers() {
        // Skenario 2: input negatif
        assertEquals(-3, DEMO4.findMin(-1, -2, -3));
    }

    @Test
    public void testFindMin_WithZeros() {
        // Skenario 3: ada nol
        assertEquals(0, DEMO4.findMin(0, 0,1));
    }

}