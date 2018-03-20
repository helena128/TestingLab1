package main;

public class Spot {
    private SpotBrightness brightness;

    public Spot(SpotBrightness brightness) {
        this.brightness = brightness;
    }

    public Spot() { }

    public void setBrightness(SpotBrightness spotBrightness) {
        this.brightness = spotBrightness;
    }

    @Override
    public String toString() {
        return brightness.getBrightnessValue() + "spot";
    }
}

enum SpotBrightness {
    BLINDING("Blinding");

    private String brightnessValue;
    SpotBrightness(String brightnessValue) {
        this.brightnessValue = brightnessValue;
    }

    String getBrightnessValue() { return this.brightnessValue; }
}
