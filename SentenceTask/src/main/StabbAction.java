package main;

import java.util.Objects;

public class StabbAction implements Action {
    private PlaceDescription actionPlaceDescription;

    public StabbAction(PlaceDescription actionPlaceDescription) {
        this.actionPlaceDescription = actionPlaceDescription;
    }

    @Override
    public String getDescription() {
        return " stabbed " + actionPlaceDescription.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StabbAction)) return false;
        StabbAction that = (StabbAction) o;
        return actionPlaceDescription == that.actionPlaceDescription;
    }

    @Override
    public int hashCode() {

        return Objects.hash(actionPlaceDescription);
    }
}
