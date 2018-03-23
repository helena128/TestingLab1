package main;

public class Flame {
    private FlameDescription description;

    public Flame(FlameDescription description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description.toString() + " flame";
    }
}
