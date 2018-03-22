package main;

public class Shaft {
    private ShaftDescription description;
    private Action action;

    public Shaft(ShaftDescription description, Action action) {
        this.description = description;
        this.action = action;
    }

    @Override
    public String toString() {
        return description.toString() + " shafts of color";
    }

    public Shaft(ShaftDescription description) {
        this.description = description;
    }

    public String perform() {
        return toString() + action.getDescription();
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
