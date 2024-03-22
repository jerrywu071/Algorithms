import org.junit.Test;
import static org.junit.Assert.*;

public class ExtendedEuclideanAlgorithmTest {

    @Test
    public void testEgcdWithPositiveNumbers() {
        long a = 48;
        long b = 18;
        long[] result = ExtendedEuclideanAlgorithm.egcd(a, b);
        assertEquals(6, result[0]); // GCD of 48 and 18 is 6
        assertEquals(-1, a * result[1] + b * result[2]); // ax + by = gcd(a, b)
    }

    @Test
    public void testEgcdWithNegativeNumbers() {
        long a = -48;
        long b = 18;
        long[] result = ExtendedEuclideanAlgorithm.egcd(a, b);
        assertEquals(6, result[0]); // GCD of -48 and 18 is 6
        assertEquals(-1, a * result[1] + b * result[2]); // ax + by = gcd(a, b)
    }

    @Test
    public void testEgcdWithZero() {
        long a = 48;
        long b = 0;
        long[] result = ExtendedEuclideanAlgorithm.egcd(a, b);
        assertEquals(a, result[0]); // GCD of 48 and 0 is 48
        assertEquals(1, result[1]); // x = 1
        assertEquals(0, result[2]); // y = 0
    }

    @Test
    public void testEgcdWithLargeNumbers() {
        long a = 123456789;
        long b = 987654321;
        long[] result = ExtendedEuclideanAlgorithm.egcd(a, b);
        assertEquals(9, result[0]); // GCD of 123456789 and 987654321 is 9
        assertEquals(-43985138, a * result[1] + b * result[2]); // ax + by = gcd(a, b)
    }
}