package main;


import main.util.ActionManager;
import main.util.IObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * The main class where everything happens:
 *
 * Out of the utter blackness stabbed a sudden point of blinding light.
 * It crept up by slight degrees and spread sideways in a thin crescent blade,
 * and within seconds two suns were VISIBLE, furnaces of light, searing the black edge
 * of the horizon with white fire.
 * Fierce shafts of colour streaked through the thin atmosphere beneath them
 *
 * Tough task, heh
 */
public class GalaxyScene implements IObserver {
    private Point point;
    private Sun[] suns;
    private Shaft shaft;

    private List<ActionManager> actions;

    public GalaxyScene() {
        prepareObjects();
        initObjWithActions();

        actions = new ArrayList<>();

        initSubjects();
    }

    private void prepareObjects() {
        point = new Point(OccurringMode.SUDDEN, new Light(LightBrightness.BLINDING), CrescentDescription.NARROW);
        suns = new Sun[2];
        suns[0] = new Sun(EdgeOfHorizonDesc.BLACK);
        suns[1] = new Sun(EdgeOfHorizonDesc.BLACK);
        shaft = new Shaft(ShaftDescription.FIERCE);
    }

    private void initObjWithActions() {
        point.addAction(new StabbAction(PlaceDescription.OUT_DARKNESS));
        point.addAction(new CreepAction(ActionDescription.BY_DEGREES));
        point.addAction(new SpreadAction(ActionDescription.SIDEWAYS, PlaceDescription.IN_BLADE, CrescentDescription.NARROW));
        for (int i = 0; i < suns.length; i++)
            suns[i].setAction(new BecomeVisibleAction(ActionDescription.SEARING_EDGE, OccurringMode.WITHIN_SEC));
        shaft.setAction(new StreakAction(ActionDescription.THROUGH_ATMOSPHERE));
    }

    private void initSubjects() {
        point.addObserver(this);
        for (int i = 0; i < suns.length; i++)
            suns[i].addObserver(this);
        shaft.addObserver(this);
    }


    public void doPerform() {
        System.out.println(point.perform());
        long start = System.nanoTime();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(">> waited " + (System.nanoTime() - start));
        for (int i = 0; i < suns.length; i++)
            System.out.println(suns[i].perform());
        System.out.println(shaft.perform());
    }

    public Point getPoint() {
        return point;
    }

    public Sun[] getSun() {
        return suns;
    }

    public Shaft getShaft() {
        return shaft;
    }

    @Override
    public void update(ActionManager manager) {
        actions.add(manager);
        //System.out.println(this.getClass());
        //System.out.println(">> Added, size: " + actions.size());
    }

    public List<ActionManager> getActions() {
        return actions;
    }
}
