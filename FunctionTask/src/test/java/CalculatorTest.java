package test.java;

import main.java.Calculator;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static java.lang.Math.acos;
import static java.lang.Math.sqrt;

public class CalculatorTest {

    private static final double EPS = 0.05;

    private static Calculator test;

    @BeforeClass
    public static void setUp() {
        test = new Calculator();
    }

    @Test
    public void testCalcArcCos1() {
        test = new Calculator();
        assertEquals(test.calculateArcCos(-1), acos(-1), EPS);
    }

    @Test
    public void testCalcArcCos2() {
        assertEquals(test.calculateArcCos(-sqrt(3) / 2), acos(-sqrt(3) / 2), EPS);
    }

    @Test
    public void testCalcArcCos3() {
        assertEquals(acos(0), test.calculateArcCos(0), EPS);
    }

    @Test
    public void testCalcArcCos4() {
        assertEquals(test.calculateArcCos(1.0), acos(1.0), EPS);
    }


}
