package example.real3;

/**
 *
 * @author Benjamin
 */
public abstract class ElectronicDevice {
    private String type;
    private String os;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    public abstract String performTask(String task);
}
