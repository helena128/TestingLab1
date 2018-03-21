package main;

public enum ActionDescription {
    BY_DEGREES(" by slight degrees"),
    SIDEWAYS(" sideways"),
    SEARING_EDGE(" searing the black edge of the horizon with white fire");

    private final String value;

    ActionDescription(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
