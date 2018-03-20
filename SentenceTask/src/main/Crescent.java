package main;

/**
 * A.k.a. half moon
 */
public class Crescent {
    private CresetType cresetType;

    public Crescent(CresetType cresetType) {
        this.cresetType = cresetType;
    }

    public Crescent() { }

    public void setCresetType(CresetType cresetType) {
        this.cresetType = cresetType;
    }

    @Override
    public String toString() {
        return cresetType.getCresetType() + " crescent";
    }
}

enum CresetType {
    NAROOW("narrow");

    private String cresetType;

    CresetType(String cresetType) {
        this.cresetType = cresetType;
    }

    public String getCresetType() {
        return cresetType;
    }
}
