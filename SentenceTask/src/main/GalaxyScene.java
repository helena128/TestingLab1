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

    public GalaxyScene(Point point, Sun sun, Shaft shaft) {
        this.point = point;
        this.sun = sun;
        this.shaft = shaft;
    }

    public void doPerform() {
        System.out.println(point.perform());
        System.out.println(sun.perform());
        System.out.println(shaft.perform());
    }
}
