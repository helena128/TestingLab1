package main;

public class StabbAction implements Action {
    private PlaceDescription actionPlaceDescription;

    public StabbAction(PlaceDescription actionPlaceDescription) {
        this.actionPlaceDescription = actionPlaceDescription;
    }

    @Override
    public String getDescription() {
        return " stabbed " + actionPlaceDescription.toString();
    }
}
