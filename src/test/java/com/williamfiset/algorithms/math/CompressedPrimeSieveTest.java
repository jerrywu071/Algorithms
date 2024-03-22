import static org.junit.Assert.*;
import org.junit.Test;

public class CompressedPrimeSieveTest {

    @Test
    public void testIsPrime() {
        long[] sieve = CompressedPrimeSieve.primeSieve(100);
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 2));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 3));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 5));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 7));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 11));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 13));
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 1));
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 4));
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 6));
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 8));
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 9));
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 10));
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 15));
    }

    @Test
    public void testPrimeSieve() {
        long[] sieve = CompressedPrimeSieve.primeSieve(100);
        assertEquals(0, sieve[0]); // 1 is not prime
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 1));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 2));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 3));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 5));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 7));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 11));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 13));
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 15));
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 20));
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 25));
    }

    @Test
    public void testEdgeCases() {
        long[] sieve = CompressedPrimeSieve.primeSieve(1);
        assertEquals(0, sieve.length);
        
        sieve = CompressedPrimeSieve.primeSieve(2);
        assertEquals(1, sieve.length);
        assertEquals(1, sieve[0]); // 1 is not prime
        assertFalse(CompressedPrimeSieve.isPrime(sieve, 1));
        assertTrue(CompressedPrimeSieve.isPrime(sieve, 2));
    }
}