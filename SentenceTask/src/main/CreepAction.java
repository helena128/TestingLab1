package main;

public class CreepAction {
    private ActionDescription actionDescription;

    public CreepAction(ActionDescription actionDescription) {
        this.actionDescription = actionDescription;
    }

    @Override
    public String toString() {
        return " crept up " + actionDescription.toString();
    }
}
