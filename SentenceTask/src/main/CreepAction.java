package main;

import java.util.Objects;

public class CreepAction implements Action {
    private ActionDescription actionDescription;

    public CreepAction(ActionDescription actionDescription) {
        this.actionDescription = actionDescription;
    }

    @Override
    public String getDescription() {
        return " crept up " + actionDescription.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreepAction)) return false;
        CreepAction that = (CreepAction) o;
        return actionDescription == that.actionDescription;
    }

    @Override
    public int hashCode() {

        return Objects.hash(actionDescription);
    }
}
