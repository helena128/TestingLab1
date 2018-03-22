package main;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Light)) return false;
        Light light = (Light) o;
        return brightness == light.brightness;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brightness);
    }
}
