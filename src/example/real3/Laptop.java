package example.real3;

/**
 *
 * @author Benjamin
 */
public class Laptop extends Computer{
    private boolean isPortable;
    private String os;

    public boolean isIsPortable() {
        return isPortable;
    }

    public void setIsPortable(boolean isPortable) {
        this.isPortable = isPortable;
    }

    @Override
    public String getOs() {
        return os;
    }

    @Override
    public void setOs(String os) {
        this.os = os;
    }
    
    @Override
    public String performTask(String task) {
        return("Performing task of: " + task);
    }
}
