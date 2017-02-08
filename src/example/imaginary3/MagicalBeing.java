package example.imaginary3;

/**
 *
 * @author Benjamin
 */
public abstract class MagicalBeing {
    private String powers;
    private String name;


    public String getPowers() {
        return powers;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void usePowers();
}
