package example.real2;

/**
 *
 * @author Benjamin
 */
public abstract class Animal {
    private double length;
    private int noOfLegs;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
    
    public abstract String moveToPoint(String location);
}
