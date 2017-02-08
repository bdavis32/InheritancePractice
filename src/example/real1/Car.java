package example.real1;

/**
 *
 * @author Benjamin
 */
public class Car extends GroundVehicle {
    private String make;
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    @Override
    public void startVehicle() {
        System.out.println("Moving...");
    }
}
