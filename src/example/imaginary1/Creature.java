package example.imaginary1;

/**
 *
 * @author Benjamin
 */
public abstract class Creature {
    private double height;
    private int weight;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public abstract String moveToLocation(String location);
}
