package main;

public class Light {
    private LightBrightness brightness;

    public Light() {  }

    public Light(LightBrightness brightness) {
        this.brightness = brightness;
    }

    public LightBrightness getBrightness() {
        return brightness;
    }

    public void setBrightness(LightBrightness brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return " of " + brightness.toString() + " light";
    }
}
