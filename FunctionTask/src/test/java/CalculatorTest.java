package test.java;

import main.java.Calculator;
import org.junit.Test;
import static junit.framework.Assert.*;
import static java.lang.Math.*;

public class CalculatorTest {

    @Test
    public void testCalcArcCos1() {
        try {
            assertTrue("Test #1", isEqual(0));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private boolean isEqual(double x) {
        Calculator test = new Calculator();
        double originalRes = acos(x);
        double customRes = test.calculateArcCos(x);
        return abs(originalRes - customRes) < Calculator.EPS;
    }
}
