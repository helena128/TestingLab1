package main;

import java.util.ArrayList;
import java.util.List;

public class Point {
    private List<Action> actionList; // list of actions
    private OccurringMode mode; // sudden

    // set blinding light
    private Light light;

    private Action tmpAction;

    public Point(List<Action> actionList, OccurringMode mode, LightBrightness brightness) {
        this.actionList = actionList;
        this.mode = mode;
        this.light = new Light(brightness);

        this.tmpAction = null;
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

                // init object
                if (i % 2 == 1) builder.append("it");
                else if (i != 0) builder.append(" the point ");

                // add action
                builder.append(tmpAction.getDescription());

                builder.append('\n');
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
