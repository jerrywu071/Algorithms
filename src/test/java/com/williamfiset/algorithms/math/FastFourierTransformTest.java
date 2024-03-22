import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FastFourierTransformTest {

    @Test
    void testMultiply() {
        // Test case 1
        long[] polynomial1 = {1, 5, 3, 2};
        long[] polynomial2 = {0, 0, 6, 2, 5};
        long[] expectedResult = {0, 0, 6, 32, 33, 43, 19, 10};
        assertArrayEquals(expectedResult, FastFourierTransform.multiply(polynomial1, polynomial2));

        // Test case 2: Multiplying by zero polynomial
        long[] zeroPolynomial = {0};
        assertArrayEquals(zeroPolynomial, FastFourierTransform.multiply(polynomial1, zeroPolynomial));
        assertArrayEquals(zeroPolynomial, FastFourierTransform.multiply(zeroPolynomial, polynomial2));

        // Test case 3: Large polynomials
        long[] largePolynomial1 = {Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE};
        long[] largePolynomial2 = {Long.MAX_VALUE, Long.MAX_VALUE, Long.MAX_VALUE};
        long[] largeResult = FastFourierTransform.multiply(largePolynomial1, largePolynomial2);
        assertNotNull(largeResult);

        // Test case 4: Negative coefficients
        long[] polynomial3 = {1, -5, 3, -2};
        long[] polynomial4 = {0, 0, -6, 2, -5};
        long[] expectedResult2 = {0, 0, 4300210171L, 22, 22, 8, 6, 10};
        assertArrayEquals(expectedResult2, FastFourierTransform.multiply(polynomial3, polynomial4));
    }

    @Test
    void testTransform() {
        // Test case 1
        long[] input = {1, 2, 3, 4};
        long[] expectedOutput = {4, 3, 2, 1};
        long[] transformed = FastFourierTransform.transform(input, 2, true);
        assertArrayEquals(expectedOutput, transformed);

        // Test case 2: Inverse transform
        long[] transformedInput = {4, 3, 2, 1};
        long[] original = FastFourierTransform.transform(transformedInput, 2, false);
        assertArrayEquals(input, original);

        // Test case 3: Empty input
        long[] emptyInput = {};
        long[] emptyOutput = FastFourierTransform.transform(emptyInput, 0, true);
        assertArrayEquals(emptyInput, emptyOutput);

        // Test case 4: Single element
        long[] singleInput = {5};
        long[] singleOutput = FastFourierTransform.transform(singleInput, 0, true);
        assertArrayEquals(singleInput, singleOutput);
    }

    @Test
    void testMult() {
        // Test case 1: Positive multiplication
        long result1 = FastFourierTransform.mult(123, 456);
        assertEquals(56088, result1);

        // Test case 2: Negative multiplication
        long result2 = FastFourierTransform.mult(-123, 456);
        assertEquals(14064, result2);

        // Test case 3: Large multiplication
        long result3 = FastFourierTransform.mult(1234567890123456L, 9876543210987654L);
        assertEquals(3712035802103478L, result3);
    }
}