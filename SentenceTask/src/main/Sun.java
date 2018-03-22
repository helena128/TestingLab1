package main;

import main.util.ActionManager;
import main.util.IObserver;
import main.util.ISubject;

import java.util.ArrayList;
import java.util.List;

public class Sun extends Furnace implements ISubject {
    private Action action;
    private List<IObserver> observers;

    public Sun(Action action) {
        this.action = action;
    }

    public Sun() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : observers) {
            o.update(new ActionManager(this, action));
        }
    }

    public String perform() {
        if (action == null) throw new NullPointerException("Sun action is not initialized");
        notifyObservers();
        return toString() + action.getDescription();
    }

    @Override
    public String toString() {
        return " two suns," + super.toString() + ",";
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Action getAction() {
        return action;
    }
}
