package example.real1;

/**
 *
 * @author Benjamin
 */
public class GroundVehicle extends MotorVehicle {
    private int noOfWheels;
    private boolean hasMotor;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public boolean isHasMotor() {
        return hasMotor;
    }

    public void setHasMotor(boolean hasMotor) {
        this.hasMotor = hasMotor;
    }
    
    @Override
    public void startVehicle() {
        if (isDoesFly()) {
            System.out.println("Leaving landing pad/runway...");
        }
        System.out.println("Moving...");
    }
}
