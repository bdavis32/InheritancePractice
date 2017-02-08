package example.imaginary1;

/**
 *
 * @author Benjamin
 */
public class Bigfoot extends MythicalBeing {

    private double height;
    private int weight;

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String moveToLocation(String location) {
        return ("Moving to " + location);
    }
}
