package main;

public class StabbAction implements Action {
    private Place actionPlace;

    public StabbAction(Place actionPlace) {
        this.actionPlace = actionPlace;
    }

    @Override
    public String getDescription() {
        return actionPlace + " stabbed ";
    }
}
