package main;

public class Crescent {
    private CrescentDescription description;

    public Crescent(CrescentDescription description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description.toString() + " crescent";
    }
}
