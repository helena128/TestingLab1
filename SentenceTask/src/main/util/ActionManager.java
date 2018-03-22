package main.util;

import main.Action;

import java.util.Objects;

public class ActionManager {
    private ISubject subject;
    private Action action;

    public ActionManager(ISubject subject, Action action) {
        this.subject = subject;
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ActionManager)) return false;
        ActionManager that = (ActionManager) o;
        return Objects.equals(subject, that.subject) &&
                Objects.equals(action, that.action);
    }

    @Override
    public int hashCode() {

        return Objects.hash(subject, action);
    }

    @Override
    public String toString() {
        return "ActionManager{" +
                "subject=" + subject +
                ", action=" + action +
                '}';
    }
}
