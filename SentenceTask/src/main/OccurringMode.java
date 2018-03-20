package main;

public enum OccurringMode {
    SUDDEN("sudden");

    private String value;

    OccurringMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}