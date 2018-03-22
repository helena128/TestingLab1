package test;

import main.*;
import main.util.ActionManager;
import main.util.IObserver;
import main.util.ISubject;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GalaxySceneTest {
    private GalaxyScene scene;

    private List<Action> pointActions;
    private Action sunAction, shaftAction;

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
    public void testText() {
        System.out.println(">> Text: ");
        scene.doPerform();
    }

    @Test
    public void testActionSequence() {
        for (ActionManager a : scene.getActions()) {
            System.out.println(a.toString());
        }
    }

    @Test
    public void testActionSequenceWithObjects() {
        List<ActionManager> actionManagerList = new ArrayList<>();
        actionManagerList.add(new ActionManager(new Point(OccurringMode.SUDDEN, new Light(LightBrightness.BLINDING)),
                new StabbAction(PlaceDescription.OUT_DARKNESS)));
        actionManagerList.add(new ActionManager(new Point(OccurringMode.SUDDEN, new Light(LightBrightness.BLINDING)),
                new CreepAction(ActionDescription.BY_DEGREES)));
        actionManagerList.add(new ActionManager(new Point(OccurringMode.SUDDEN, new Light(LightBrightness.BLINDING)),
                new SpreadAction(ActionDescription.SIDEWAYS, PlaceDescription.IN_BLADE)));
        actionManagerList.add(new ActionManager(new Sun(), new BecomeVisibleAction(ActionDescription.SEARING_EDGE,
                OccurringMode.WITHIN_SEC)));
        actionManagerList.add(new ActionManager(new Shaft(ShaftDescription.FIERCE),
                new StreakAction(ActionDescription.THROUGH_ATMOSPHERE)));

        scene.doPerform();

        // check number of actions performed
        assertEquals(actionManagerList.size(), scene.getActions().size());

        for (int i = 0; i < scene.getActions().size(); i++) {
            ISubject subject = scene.getActions().get(i).getSubject();
            Action action = scene.getActions().get(i).getAction();

            // check classes
            assertEquals(subject.getClass(), actionManagerList.get(i).getSubject().getClass());
            assertEquals(action.getClass(), scene.getActions().get(i).getAction().getClass());

            // check everything else
            assertTrue(action.getDescription().equals(scene.getActions().get(i).getAction().getDescription()));
            assertTrue(subject.describe().equals(scene.getActions().get(i).getSubject().describe()));
        }
    }
}
