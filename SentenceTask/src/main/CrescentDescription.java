package main;

public enum CrescentDescription {
    NARROW(" narrow");

    private String value;

    CrescentDescription(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
