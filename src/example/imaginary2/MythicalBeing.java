package example.imaginary2;

/**
 *
 * @author Benjamin
 */
public class MythicalBeing extends Character{
    private String name;
    private String species;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public void setSpecies(String species) {
        this.species = species;
    }
    
    @Override
    public String moveToLocation(String location) {
        return ("Moving to " + location); 
    }
    
}
