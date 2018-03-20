package main;

public enum LightBrightness {
    BLINDING("blinding"), UNSPECIFIED("");

    private String value;

    LightBrightness(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}