package main.java;

import java.util.Objects;

public class ActionHolder {
    private int number1;
    private int number2;
    private Action act;

    public ActionHolder(int number1, int number2, Action act) {
        this.number1 = number1;
        this.number2 = number2;
        this.act = act;
    }

    public ActionHolder() { }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public Action getAct() {
        return act;
    }

    public void setAct(Action act) {
        this.act = act;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ActionHolder)) return false;
        ActionHolder that = (ActionHolder) o;
        return number1 == that.number1 &&
                number2 == that.number2 &&
                act == that.act;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1, number2, act);
    }
}
