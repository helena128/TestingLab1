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

    public String perform() {
        return toString() + action.getDescription();
    }
}
