package main;

public enum EdgeOfHorizonDesc {
    BLACK("black");

    private String value;

    EdgeOfHorizonDesc(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }
}
