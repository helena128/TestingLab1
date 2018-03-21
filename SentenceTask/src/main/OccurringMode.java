package main;

public enum OccurringMode {
    SUDDEN("sudden"), UNSPECIFIED(""), WITHIN_SEC(" within seconds");

    private String value;

    OccurringMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}