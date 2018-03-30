package test.java;

import main.java.Calculator;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;

/**
 * Test numbers to multiply by
 */
public class CoefficientTest {
    @Test
    public void testCalculateCoefficients0() {
        Calculator test = new Calculator();
        assertTrue("Test 0", (test.calculateCoefficient(0).doubleValue() == 1));
    }

    @Test
    public void testCalculateCoefficients1() {
        Calculator test = new Calculator();
        assertTrue("Test 1", (test.calculateCoefficient(1).doubleValue() == 1 / 6));
    }

    @Test
    public void testCalculateCoefficients2() {
        Calculator test = new Calculator();
        assertTrue("Test 2", (test.calculateCoefficient(2).doubleValue() == 3 / 40));
    }

    @Test
    public void testCalculateCoefficients3() {
        Calculator test = new Calculator();
        assertTrue("Test 3", (test.calculateCoefficient(3).doubleValue() == 5 / 112));
    }

    @Test
    public void testCalculateCoefficients4() {
        Calculator test = new Calculator();
        assertTrue("Test 4", (test.calculateCoefficient(4).doubleValue() == 35 / 1152));
    }
}
