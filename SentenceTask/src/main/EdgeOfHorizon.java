package main;

public class EdgeOfHorizon {
    private EdgeOfHorizonDesc desc;

    public EdgeOfHorizon(EdgeOfHorizonDesc desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc.toString()  + " edge of horizon";
    }
}