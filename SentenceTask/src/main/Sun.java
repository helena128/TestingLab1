package main;

import main.util.ActionManager;
import main.util.IObserver;
import main.util.ISubject;

import java.util.ArrayList;
import java.util.List;

public class Sun extends Furnace implements ISubject {
    private Action action;
    private List<IObserver> observers;
    private EdgeOfHorizon edgeOfHorizon;

    public Sun(Action action) {
        this.action = action;
    }

    public Sun(EdgeOfHorizonDesc desc) {
        observers = new ArrayList<>();
        edgeOfHorizon = new EdgeOfHorizon(desc);
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
            //System.out.println(Sun.class);
        }
    }

    public String perform() {
        if (action == null) throw new NullPointerException("Sun action is not initialized");
        notifyObservers();
        return toString() + action.getDescription();
    }

    @Override
    public String toString() {
        burn(new Flame(FlameDescription.WHITE));
        return " sun," + super.toString() + "," ;
    }

    private void burn(Flame flame) {
        System.out.println(">> Removing edge");
        System.out.println(" with "  + flame.toString());
        edgeOfHorizon = null;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Action getAction() {
        return action;
    }

    @Override
    public String describe(){
        return toString();
    }
}
