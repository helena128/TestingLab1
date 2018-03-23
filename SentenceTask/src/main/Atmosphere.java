package main;

public class Atmosphere {
    private ActionDescription description;

    public Atmosphere(ActionDescription description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Atmosphere{" +
                "description=" + description.toString() +
                '}';
    }
}
