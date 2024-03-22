import static org.junit.Assert.*;
import org.junit.Test;

public class EulerTotientFunctionTest {

    @Test
    public void testEulersTotient() {
        assertEquals(8, EulerTotientFunction.eulersTotient(15));
        assertEquals(1, EulerTotientFunction.eulersTotient(1));
        assertEquals(1, EulerTotientFunction.eulersTotient(2));
        assertEquals(2, EulerTotientFunction.eulersTotient(3));
        assertEquals(2, EulerTotientFunction.eulersTotient(4));
        assertEquals(4, EulerTotientFunction.eulersTotient(5));
        assertEquals(2, EulerTotientFunction.eulersTotient(6));
        assertEquals(6, EulerTotientFunction.eulersTotient(7));
        assertEquals(4, EulerTotientFunction.eulersTotient(8));
        assertEquals(6, EulerTotientFunction.eulersTotient(9));
        assertEquals(4, EulerTotientFunction.eulersTotient(10));
        assertEquals(10, EulerTotientFunction.eulersTotient(11));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        EulerTotientFunction.eulersTotient(-1);
    }

    @Test
    public void testPrimeFactorization() {
        assertArrayEquals(new Long[]{}, EulerTotientFunction.primeFactorization(1).toArray());
        assertArrayEquals(new Long[]{2L}, EulerTotientFunction.primeFactorization(2).toArray());
        assertArrayEquals(new Long[]{3L}, EulerTotientFunction.primeFactorization(3).toArray());
        assertArrayEquals(new Long[]{2L, 2L}, EulerTotientFunction.primeFactorization(4).toArray());
        assertArrayEquals(new Long[]{5L}, EulerTotientFunction.primeFactorization(5).toArray());
        assertArrayEquals(new Long[]{2L, 3L}, EulerTotientFunction.primeFactorization(6).toArray());
        assertArrayEquals(new Long[]{7L}, EulerTotientFunction.primeFactorization(7).toArray());
        assertArrayEquals(new Long[]{2L, 2L, 2L}, EulerTotientFunction.primeFactorization(8).toArray());
        assertArrayEquals(new Long[]{3L, 3L}, EulerTotientFunction.primeFactorization(9).toArray());
        assertArrayEquals(new Long[]{2L, 5L}, EulerTotientFunction.primeFactorization(10).toArray());
        assertArrayEquals(new Long[]{11L}, EulerTotientFunction.primeFactorization(11).toArray());
    }

    @Test
    public void testPollardRho() {
        assertEquals(2, EulerTotientFunction.pollardRho(4));
        assertEquals(3, EulerTotientFunction.pollardRho(9));
        assertEquals(2, EulerTotientFunction.pollardRho(12));
        assertEquals(5, EulerTotientFunction.pollardRho(15));
        assertEquals(7, EulerTotientFunction.pollardRho(21));
        assertEquals(17, EulerTotientFunction.pollardRho(17));
    }

    @Test
    public void testGcf() {
        assertEquals(3, EulerTotientFunction.gcf(6, 9));
        assertEquals(1, EulerTotientFunction.gcf(7, 9));
        assertEquals(5, EulerTotientFunction.gcf(15, 20));
        assertEquals(6, EulerTotientFunction.gcf(54, 24));
        assertEquals(4, EulerTotientFunction.gcf(36, 16));
    }

    @Test
    public void testIsPrime() {
        assertFalse(EulerTotientFunction.isPrime(0));
        assertFalse(EulerTotientFunction.isPrime(1));
        assertTrue(EulerTotientFunction.isPrime(2));
        assertTrue(EulerTotientFunction.isPrime(3));
        assertFalse(EulerTotientFunction.isPrime(4));
        assertTrue(EulerTotientFunction.isPrime(5));
        assertFalse(EulerTotientFunction.isPrime(6));
        assertTrue(EulerTotientFunction.isPrime(7));
        assertFalse(EulerTotientFunction.isPrime(8));
        assertFalse(EulerTotientFunction.isPrime(9));
        assertFalse(EulerTotientFunction.isPrime(10));
        assertTrue(EulerTotientFunction.isPrime(11));
    }
}