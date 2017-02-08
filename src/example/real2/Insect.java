package example.real2;

/**
 *
 * @author Benjamin
 */
public class Insect extends Animal{
    private double length;
    private int noOfLegs;

    @Override
    public int getNoOfLegs() {
        return noOfLegs;
    }

    @Override
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public String moveToPoint(String location) {
        return ("Moving to " + location);
    }
    
}
