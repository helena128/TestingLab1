package main;

import java.util.Objects;

public class BecomeVisibleAction implements Action {
    private ActionDescription actionDescription;
    private OccurringMode mode;

    public BecomeVisibleAction(ActionDescription actionDescription, OccurringMode mode) {
        this.actionDescription = actionDescription;
        this.mode = mode;
    }

    @Override
    public String getDescription() {
        return mode.getValue() + " were visible," + actionDescription.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BecomeVisibleAction)) return false;
        BecomeVisibleAction that = (BecomeVisibleAction) o;
        return actionDescription == that.actionDescription &&
                mode == that.mode;
    }

    @Override
    public int hashCode() {

        return Objects.hash(actionDescription, mode);
    }
}
