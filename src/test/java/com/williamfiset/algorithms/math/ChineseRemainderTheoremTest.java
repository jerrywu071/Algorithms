import org.junit.Test;
import static org.junit.Assert.*;

public class ChineseRemainderTheoremTest {

    @Test
    public void testEliminateCoefficient() {
        long c = 5;
        long a = 3;
        long m = 7;
        long[] result = ChineseRemainderTheorem.eliminateCoefficient(c, a, m);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(6, result[0]);
        assertEquals(7, result[1]);
    }

    @Test
    public void testReduce() {
        long[] a = {3, 5};
        long[] m = {7, 13};
        long[][] result = ChineseRemainderTheorem.reduce(a, m);
        assertNotNull(result);
        assertEquals(2, result[0].length);
        assertEquals(2, result[1].length);
        assertArrayEquals(new long[]{3, 5}, result[0]);
        assertArrayEquals(new long[]{7, 13}, result[1]);
    }

    @Test
    public void testCrt() {
        long[] a = {2, 3};
        long[] m = {3, 5};
        long[] result = ChineseRemainderTheorem.crt(a, m);
        assertNotNull(result);
        assertEquals(2, result.length);
        assertEquals(8, result[0]);
        assertEquals(15, result[1]);
    }

    @Test
    public void testPrimeFactorization() {
        long n = 56;
        assertArrayEquals(new long[]{2, 2, 2, 7}, ChineseRemainderTheorem.primeFactorization(n).toArray());
    }

    @Test
    public void testPollardRho() {
        long n = 45;
        assertEquals(5, ChineseRemainderTheorem.pollardRho(n));
    }

    @Test
    public void testEgcd() {
        long a = 30;
        long b = 18;
        long[] result = ChineseRemainderTheorem.egcd(a, b);
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals(6, result[0]);
        assertEquals(-1, result[1]);
        assertEquals(2, result[2]);
    }

    @Test
    public void testGcf() {
        long a = 24;
        long b = 36;
        assertEquals(12, ChineseRemainderTheorem.gcf(a, b));
    }

    @Test
    public void testIsPrime() {
        assertFalse(ChineseRemainderTheorem.isPrime(1));
        assertTrue(ChineseRemainderTheorem.isPrime(2));
        assertTrue(ChineseRemainderTheorem.isPrime(3));
        assertFalse(ChineseRemainderTheorem.isPrime(4));
        assertTrue(ChineseRemainderTheorem.isPrime(5));
        assertFalse(ChineseRemainderTheorem.isPrime(6));
        assertTrue(ChineseRemainderTheorem.isPrime(7));
        assertFalse(ChineseRemainderTheorem.isPrime(8));
        assertFalse(ChineseRemainderTheorem.isPrime(9));
        assertFalse(ChineseRemainderTheorem.isPrime(10));
    }
}