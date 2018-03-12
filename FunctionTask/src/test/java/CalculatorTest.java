package test.java;

import main.java.Calculator;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static java.lang.Math.*;

public class CalculatorTest {

    private static final double EPS = 0.05;

    @Test
    public void testCalcArcCos1() {
        try {
            assertTrue("Test #1", isEqual(-1));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testCalcArcCos2() {
        try {
            assertTrue("Test #2", isEqual(-sqrt(3) / 2));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testCalcArcCos3() {
        try {
            assertTrue("Test #3", isEqual(0));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void testCalcArcCos4() {
        try {
            assertTrue("Test #4", isEqual(1));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private boolean isEqual(double x) {
        Calculator test = new Calculator();
        double originalRes = acos(x);
        double customRes = test.calculateArcCos(x);
        //System.out.println("\n\norigX: " + originalRes + "\ncustom: " + customRes); // debug
        return abs(originalRes - customRes) < EPS;
    }


}
