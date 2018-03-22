package main;


/**
 * The main class where everything happens:
 *
 * Out of the utter blackness stabbed a sudden point of blinding light.
 * It crept up by slight degrees and spread sideways in a thin crescent blade,
 * and within seconds two suns were visible, furnaces of light, searing the black edge
 * of the horizon with white fire.
 * Fierce shafts of colour streaked through the thin atmosphere beneath them
 *
 * Tough task, heh
 */
public class GalaxyScene {
    private Point point;
    private Sun sun;
    private Shaft shaft;

    public GalaxyScene() {
        prepareObjects();
        initObjWithActions();
    }

    private void prepareObjects() {
        point = new Point(OccurringMode.SUDDEN, new Light(LightBrightness.BLINDING));
        sun = new Sun();
        shaft = new Shaft(ShaftDescription.FIERCE);
    }

    private void initObjWithActions() {
        point.addAction(new StabbAction(PlaceDescription.OUT_DARKNESS));
        point.addAction(new CreepAction(ActionDescription.BY_DEGREES));
        point.addAction(new SpreadAction(ActionDescription.SIDEWAYS, PlaceDescription.IN_BLADE));
        sun.setAction(new BecomeVisibleAction(ActionDescription.SEARING_EDGE, OccurringMode.WITHIN_SEC));
        shaft.setAction(new StreakAction(ActionDescription.THROUGH_ATMOSPHERE));
    }


    public void doPerform() {
        System.out.println(point.perform());
        System.out.println(sun.perform());
        System.out.println(shaft.perform());
    }

    public Point getPoint() {
        return point;
    }

    public Sun getSun() {
        return sun;
    }

    public Shaft getShaft() {
        return shaft;
    }
}
