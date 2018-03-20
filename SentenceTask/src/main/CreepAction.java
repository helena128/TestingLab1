package main;

public class CreepAction implements Action {
    private ActionDescription actionDescription;

    public CreepAction(ActionDescription actionDescription) {
        this.actionDescription = actionDescription;
    }

    @Override
    public String getDescription() {
        return " crept up " + actionDescription.toString();
    }
}
