package test;

import main.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class PointSentenceTest {
    Point point;
    Action[] actions;

    @Before
    public void setUp() {
        actions = new Action[2];
        actions[0] = new StabbAction(Place.OUT_DARKNESS);

        point = new Point(null, OccurringMode.SUDDEN, LightBrightness.BLINDING);
        point.addAction(new StabbAction(Place.OUT_DARKNESS));
    }

    @Test
    public void test() {
        System.out.println(point.perform());
    }
}
