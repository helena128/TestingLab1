package main;

import java.util.Objects;

public class SpreadAction implements Action {
    private ActionDescription actionDescription;
    private PlaceDescription placeDescription;
    private CrescentDescription crescentDescription;

    public SpreadAction(ActionDescription actionDescription, PlaceDescription placeDescription, CrescentDescription crescentDescription) {
        this.actionDescription = actionDescription;
        this.placeDescription = placeDescription;
        this.crescentDescription = crescentDescription;
    }

    @Override
    public String getDescription() {
        //this = new Crescent(CrescentDescription.NARROW);
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
