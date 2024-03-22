import org.junit.Test;
import static org.junit.Assert.*;

public class EulerTotientFunctionWithSieveTest {

    @Test
    public void testTotientForPrimeNumber() {
        assertEquals(1, EulerTotientFunctionWithSieve.totient(2));
        assertEquals(2, EulerTotientFunctionWithSieve.totient(3));
        assertEquals(4, EulerTotientFunctionWithSieve.totient(5));
        assertEquals(6, EulerTotientFunctionWithSieve.totient(7));
        assertEquals(10, EulerTotientFunctionWithSieve.totient(11));
        assertEquals(12, EulerTotientFunctionWithSieve.totient(13));
    }

    @Test
    public void testTotientForCompositeNumber() {
        assertEquals(4, EulerTotientFunctionWithSieve.totient(6));
        assertEquals(8, EulerTotientFunctionWithSieve.totient(12));
        assertEquals(20, EulerTotientFunctionWithSieve.totient(21));
        assertEquals(60, EulerTotientFunctionWithSieve.totient(63));
        assertEquals(480, EulerTotientFunctionWithSieve.totient(1000));
    }

    @Test
    public void testTotientForEdgeCases() {
        assertEquals(1, EulerTotientFunctionWithSieve.totient(1));
        assertEquals(0, EulerTotientFunctionWithSieve.totient(0));
        assertEquals(0, EulerTotientFunctionWithSieve.totient(-1));
        assertEquals(0, EulerTotientFunctionWithSieve.totient(-100));
        assertEquals(8, EulerTotientFunctionWithSieve.totient(15));
        assertEquals(0, EulerTotientFunctionWithSieve.totient(1000001));
    }
}