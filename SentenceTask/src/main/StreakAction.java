package main;

import java.util.Objects;

public class StreakAction implements Action {
    private ActionDescription description;

    public StreakAction(ActionDescription description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return " streaked" + description.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StreakAction)) return false;
        StreakAction that = (StreakAction) o;
        return description == that.description;
    }

    @Override
    public int hashCode() {

        return Objects.hash(description);
    }
}
