package main;

public class StreakAction implements Action {
    private ActionDescription description;

    public StreakAction(ActionDescription description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return " streaked" + description.toString();
    }
}
