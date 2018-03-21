package main;

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
}
