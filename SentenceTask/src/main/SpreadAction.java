package main;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpreadAction)) return false;
        SpreadAction that = (SpreadAction) o;
        return actionDescription == that.actionDescription &&
                placeDescription == that.placeDescription;
    }

    @Override
    public int hashCode() {

        return Objects.hash(actionDescription, placeDescription);
    }
}
