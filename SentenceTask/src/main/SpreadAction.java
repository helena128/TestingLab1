package main;

public class SpreadAction implements Action {
    private ActionDescription actionDescription;
    private PlaceDescription placeDescription;

    public SpreadAction(ActionDescription actionDescription, PlaceDescription placeDescription) {
        this.actionDescription = actionDescription;
        this.placeDescription = placeDescription;
    }

    @Override
    public String getDescription() {
        return " spread " + actionDescription.toString() + " " + placeDescription;
    }
}
