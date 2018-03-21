package main;

public class Sun extends Furnace {
    private Action action;

    public Sun(Action action) {
        this.action = action;
    }

    public String perform() {
        return toString() + action.getDescription();
    }

    @Override
    public String toString() {
        return "two suns," + super.toString() + ",";
    }
}
