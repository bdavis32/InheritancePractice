package example.real3;

/**
 *
 * @author Benjamin
 */
public class Computer extends ElectronicDevice{
    private String os;
    private String type;

    @Override
    public String getOs() {
        return os;
    }

    @Override
    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String performTask(String task) {
        return("Performing task of: " + task);
    }
    
}
