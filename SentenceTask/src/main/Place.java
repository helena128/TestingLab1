package main;

public enum Place {
    OUT_DARKNESS("out of the utter darkness ");

    private final String value;

    Place(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}