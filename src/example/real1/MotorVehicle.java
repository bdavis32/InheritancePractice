package example.real1;

/**
 *
 * @author Benjamin
 */
public abstract class MotorVehicle {

    private String engineType;
    private boolean doesFly;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public boolean isDoesFly() {
        return doesFly;
    }

    public void setDoesFly(boolean doesFly) {
        this.doesFly = doesFly;
    }

    public abstract void startVehicle();
}
