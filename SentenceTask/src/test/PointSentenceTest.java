package test;

import main.*;
import org.junit.Before;
import org.junit.Test;

public class PointSentenceTest {
    Point point;
    Action[] actions;

    @Before
    public void setUp() {
        actions = new Action[2];
        actions[0] = new StabbAction(PlaceDescription.OUT_DARKNESS);

        point = new Point(null, OccurringMode.SUDDEN, LightBrightness.BLINDING);
        point.addAction(new StabbAction(PlaceDescription.OUT_DARKNESS));
        point.addAction(new CreepAction(ActionDescription.BY_DEGREES));
        point.addAction(new SpreadAction(ActionDescription.SIDEWAYS, PlaceDescription.IN_BLADE));
    }

    @Test
    public void test() {
        System.out.println(point.perform());
    }
}
