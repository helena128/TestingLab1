package main;

public class Sun extends Furnace {
    private Action action;

    public Sun(Action action) {
        this.action = action;
    }

    public Sun() { }

    public String perform() {
        if (action == null) throw new NullPointerException("Sun action is not initialized");
        return toString() + action.getDescription();
    }

    @Override
    public String toString() {
        return "two suns," + super.toString() + ",";
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Action getAction() {
        return action;
    }
}
