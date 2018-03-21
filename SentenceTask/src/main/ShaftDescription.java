package main;

public enum ShaftDescription {
    FIERCE("fierce");
    private final String value;

    ShaftDescription(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
