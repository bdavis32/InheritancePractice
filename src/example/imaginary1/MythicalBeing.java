package example.imaginary1;

/**
 *
 * @author Benjamin
 */
public class MythicalBeing extends Creature {

    private String legend;
    private boolean hasPowers;

    public String getLegend() {
        return legend;
    }

    public void setLegend(String legend) {
        this.legend = legend;
    }

    public boolean isHasPowers() {
        return hasPowers;
    }

    public void setHasPowers(boolean hasPowers) {
        this.hasPowers = hasPowers;
    }

    @Override
    public String moveToLocation(String location) {
        return ("Moving to " + location);
    }
}
