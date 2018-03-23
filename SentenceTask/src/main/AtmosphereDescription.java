package main;

public enum AtmosphereDescription {
    THIN(" thin");

    private String value;

    AtmosphereDescription(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
