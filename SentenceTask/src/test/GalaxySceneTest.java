package test;

import main.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GalaxySceneTest {
    Point point;
    Sun sun;
    Shaft shaft;
    GalaxyScene scene;

    List<Action> pointActions;
    Action sunAction, shaftAction;

    @Before
    public void setUp() {
        scene = new GalaxyScene();
    }

    @Test
    public void testObjDescriptions() {
        assertEquals(scene.getPoint().getLight(), new Light(LightBrightness.BLINDING)); // check point light
        assertEquals(scene.getPoint().getMode(), OccurringMode.SUDDEN); // check occurring mode
        assertEquals(scene.getSun().getClass().getSuperclass(), Furnace.class); // check superclass of the sun
        assertEquals(scene.getShaft().getDescription(), ShaftDescription.FIERCE); // check shaft description
    }

    @Test
    public void testObjActions() {
        pointActions = new ArrayList<>();
        pointActions.add(new StabbAction(PlaceDescription.OUT_DARKNESS));
        pointActions.add(new CreepAction(ActionDescription.BY_DEGREES));
        pointActions.add(new SpreadAction(ActionDescription.SIDEWAYS, PlaceDescription.IN_BLADE));

        // check every step
        for (int i = 0; i < pointActions.size(); i++)
            assertEquals(scene.getPoint().getActionList().get(i), pointActions.get(i));

        // check number of actions
        assertTrue(scene.getPoint().getActionList().size() == pointActions.size());

        // check sun action
        sunAction = new BecomeVisibleAction(ActionDescription.SEARING_EDGE, OccurringMode.WITHIN_SEC);
        assertEquals(scene.getSun().getAction(), sunAction);

        // check shaft action
        shaftAction = new StreakAction(ActionDescription.THROUGH_ATMOSPHERE);
        assertEquals(scene.getShaft().getAction(), shaftAction);

    }

    @Test
    public void test() {
        System.out.println(">> Text: ");
        scene.doPerform();
    }
}
