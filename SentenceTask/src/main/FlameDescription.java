package main;

public enum FlameDescription {
    WHITE("white");

    private String value;

    FlameDescription(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
