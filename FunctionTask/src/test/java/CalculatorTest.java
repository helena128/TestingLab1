package test.java;

import main.java.Calculator;
import org.junit.Test;

import static junit.framework.Assert.*;
import static java.lang.Math.*;

public class CalculatorTest {

    private static final double EPS = 0.05;

    @Test
    public void testCalcArcCos1() {
        try {
            assertTrue("Test #1", isEqual(-1)); // TODO: fails
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
        System.out.println("\n\norigX: " + originalRes + "\ncustom: " + customRes);
        return abs(originalRes - customRes) < EPS;
    }

    // Testing other features
    // TODO: divide into classes
    /*
    @Test
    public void testCalculateMembers0() {
        Calculator test = new Calculator();
        assertTrue("Test 0", (test.calculateMember(0).doubleValue() == 1));
    }

    @Test
    public void testCalculateMembers1() {
        Calculator test = new Calculator();
        assertTrue("Test 1", (test.calculateMember(1).doubleValue() == 1 / 6));
    }

    @Test
    public void testCalculateMembers2() {
        Calculator test = new Calculator();
        assertTrue("Test 2", (test.calculateMember(2).doubleValue() == 3 / 40));
    }

    @Test
    public void testCalculateMembers3() {
        Calculator test = new Calculator();
        assertTrue("Test 3", (test.calculateMember(3).doubleValue() == 5 / 112));
    }

    @Test
    public void testCalculateMembers4() {
        Calculator test = new Calculator();
        assertTrue("Test 4", (test.calculateMember(4).doubleValue() == 35 / 1152));
    }
    */
}
