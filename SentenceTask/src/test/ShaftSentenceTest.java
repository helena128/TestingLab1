package test;

import main.*;
import org.junit.Before;
import org.junit.Test;

public class ShaftSentenceTest {
    Shaft shaft;
    Action action;

    @Before
    public void setUp() {
        action = new StreakAction(ActionDescription.THROUGH_ATMOSPHERE);
        shaft = new Shaft(ShaftDescription.FIERCE, action);
    }

    @Test
    public void test() {
        System.out.println(shaft.perform());
    }
}
