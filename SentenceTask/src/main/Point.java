package main;

import main.util.ActionManager;
import main.util.IObserver;
import main.util.ISubject;

import java.util.ArrayList;
import java.util.List;

public class Point implements ISubject {
    private List<Action> actionList; // list of actions
    private OccurringMode mode; // sudden

    // set blinding light
    private Light light;

    List<IObserver> observers;

    private Action tmpAction;

    public Point(List<Action> actionList, OccurringMode mode, LightBrightness brightness) {
        this.actionList = actionList;
        this.mode = mode;
        this.light = new Light(brightness);

        this.tmpAction = null;

        this.observers = new ArrayList<>();
    }


    public Point(OccurringMode mode, Light light) {
        this.mode = mode;
        this.light = light;
        this.observers = new ArrayList<>();
    }

    public void setActionList(List<Action> actionList) {
        this.actionList = actionList;
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
            o.update(new ActionManager(this, tmpAction));
        }
    }



    @Override
    public String toString() {
        return "A " + mode.getValue() + " point ";
    }

    public void addAction(Action act) {
        if (actionList == null)
            actionList = new ArrayList<>();

        actionList.add(act);
    }

    public String perform() {
        StringBuilder builder = new StringBuilder();
        builder.append("A ").append(mode.getValue()).append(" point ").append(light.toString());

        if (actionList != null) {
            for (int i = 0; i < actionList.size(); i++) {
                tmpAction = actionList.get(i);
                notifyObservers();

                // add action
                builder.append(tmpAction.getDescription());

                if (i < actionList.size() - 1) builder.append(',');
                builder.append("\n");
            }
        }
        return builder.toString();
    }

    public List<Action> getActionList() {
        return actionList;
    }

    public OccurringMode getMode() {
        return mode;
    }

    public Light getLight() {
        return light;
    }
}
