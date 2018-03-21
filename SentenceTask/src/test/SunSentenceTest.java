package test;

import main.*;
import org.junit.Before;
import org.junit.Test;

public class SunSentenceTest {
    Sun sun;

    @Before
    public void setUp() {
        Action action = new BecomeVisibleAction(ActionDescription.SEARING_EDGE, OccurringMode.WITHIN_SEC);
        sun = new Sun(action);
    }

    @Test
    public void test() {
        System.out.println(sun.perform());
    }
}
