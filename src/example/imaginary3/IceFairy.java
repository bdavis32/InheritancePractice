package example.imaginary3;

/**
 *
 * @author Benjamin
 */
public class IceFairy extends MagicalBeing {
    private String name;
    private String powers;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPowers() {
        return powers;
    }

    @Override
    public void setPowers(String powers) {
        this.powers = powers;
    }
    
    @Override
    public void usePowers() {
       
    }
    
}
