package main.java;

import java.util.HashSet;
import java.util.Set;

public class ActionHolder {
    private Set<Action> actions;

    public ActionHolder(Set<Action> actions) {
        this.actions = actions;
    }

    public ActionHolder() { actions = new HashSet<>(); }

    public Set<Action> getActions() {
        return actions;
    }

    public void setActions(Set<Action> actions) {
        this.actions = actions;
    }

    /**
     * Adds action to the list
     * @param act - new Action
     */
    public void update(Action act) {
        actions.add(act);
    }

    public boolean contains(Action act) {
        return actions.contains(act);
    }
}
