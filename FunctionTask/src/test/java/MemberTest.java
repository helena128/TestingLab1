package test.java;

import main.java.Calculator;
import org.junit.Test;
import static junit.framework.Assert.assertTrue;

/**
 * Test numbers to multiply by
 */
public class MemberTest {
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
}
