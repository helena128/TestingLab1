package main;

public enum PlaceDescription {
    OUT_DARKNESS("out of the utter darkness "),
    IN_BLADE("in a thin crescent blade");

    private final String value;

    PlaceDescription(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}