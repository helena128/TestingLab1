package main;

public enum Place {
    OUT_DARKNESS("Out of the utter darkness ");

    private final String value;

    Place(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}