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
        assertEquals(test.calculateArcCos(-1), acos(-1), EPS); //x=-1
    }

    @Test
    public void testCalcArcCos2() {
        assertEquals(test.calculateArcCos(0), acos(0), EPS); //x=0
    }

    @Test
    public void testCalcArcCos3() {
        assertEquals(acos(1), test.calculateArcCos(1), EPS); //x=1
    }

    @Test
    public void testCalcArcCos4() {
        assertEquals(test.calculateArcCos(-0.5), acos(-0.5), EPS); //-1<x<0
    }

    @Test
    public void testCalcArcCos5() {
        assertEquals(test.calculateArcCos(-sqrt(3) / 2), acos(-sqrt(3) / 2), EPS); //-1<x<0
    }

    @Test
    public void testCalcArcCos6() {
        assertEquals(test.calculateArcCos(sqrt(3) / 2), acos(sqrt(3) / 2), EPS); //0<x<1
    }

    @Test
    public void testCalcArcCos7() {
        assertEquals(test.calculateArcCos(-0.5), acos(-0.5), EPS); //0<x<1
    }

    @Test
    public void testCalcArcCos8() {
        try {
            assertEquals(test.calculateArcCos(-2), acos(-2), EPS); //x<-1
        }
        catch(IllegalArgumentException e){}
    }

    @Test
    public void testCalcArcCos9() {
        try {
            assertEquals(test.calculateArcCos(-3), acos(-3), EPS); //x<-1

        }
        catch(IllegalArgumentException e){}
    }

    @Test
    public void testCalcArcCos10() {
        try {
            assertEquals(test.calculateArcCos(3), acos(3), EPS); //x>1
        }
        catch(IllegalArgumentException e){}
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalcArcCos11() {
     assertEquals(test.calculateArcCos(2), acos(2), EPS); //x>1
    }


}
