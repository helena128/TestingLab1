package main;

import main.util.ActionManager;
import main.util.IObserver;
import main.util.ISubject;

import java.util.ArrayList;
import java.util.List;

public class Shaft implements ISubject {
    private ShaftDescription description;
    private Action action;

    private List<IObserver> observers = new ArrayList<>();

    public Shaft(ShaftDescription description, Action action) {
        this.description = description;
        this.action = action;
        observers = new ArrayList<>();
    }

    @Override
    public String toString() {
        return description.toString() + " shafts of color";
    }

    public Shaft(ShaftDescription description) {
        this.description = description;
    }

    public String perform() {
        notifyObservers();
        return toString() + action.getDescription();
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public ShaftDescription getDescription() {
        return description;
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
        if (observers == null || observers.size() == 0) return;
        for (IObserver o : observers) {
            o.update(new ActionManager(this, action));
        }
    }

}
