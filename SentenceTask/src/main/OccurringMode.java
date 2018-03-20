package main;

public enum OccurringMode {
    SUDDEN("sudden"), UNSPECIFIED("");

    private String value;

    OccurringMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}