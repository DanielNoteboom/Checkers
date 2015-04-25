package Positions;

/**
 * Created by danielnoteboom on 4/25/15.
 */
public class EmptyPosition implements Space {
    private boolean isValid;

    public EmptyPosition(boolean isValid) {
        this.isValid = isValid;
    }
    public boolean isValid() {
        return isValid;
    }
}
