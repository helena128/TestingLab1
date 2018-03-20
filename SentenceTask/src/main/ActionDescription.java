package main;

public enum ActionDescription {
    BY_DEGREES("by slight degrees");

    private final String value;

    ActionDescription(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
