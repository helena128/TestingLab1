package main.java;

import java.util.Objects;

/**
 * Class with two numbers for handling swap actions
 */
public class Pair {
    private int val1, val2;

    public Pair(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair pair = (Pair) o;
        return (val1 == pair.val1 || val1 == pair.val2) &&
                (val2 == pair.val2 || val2 == pair.val1);
    }

    @Override
    public int hashCode() {

        return Objects.hash(val1, val2);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "val1=" + val1 +
                ", val2=" + val2 +
                '}';
    }
}
