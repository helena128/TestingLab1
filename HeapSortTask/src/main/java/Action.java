package main.java;

public class Action {
    private Integer number1; // first number we check
    private Integer number2; // second number we check
    private ActionType act; // actions with numbers (swap or none)

    public Action(int number1, int number2, ActionType act) {
        this.number1 = number1;
        this.number2 = number2;
        this.act = act;
    }

    public Action() { }

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

    public ActionType getAct() {
        return act;
    }

    public void setAct(ActionType act) {
        this.act = act;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Action)) return false;
        Action that = (Action) o;
        int x1 = number1;
        int x2 = number2;
        int y1 = that.number1;
        int y2 = that.number2;
        return (x1 == y1 || x1 == y2) &&
                (x2 == y2 || x2 == y1) &&
                act == that.act;
    }

    @Override
    public int hashCode() {
        return 31 * act.hashCode() + 7 * number1.hashCode() + number2.hashCode();
    }
}
