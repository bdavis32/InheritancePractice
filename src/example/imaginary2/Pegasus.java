package example.imaginary2;

/**
 *
 * @author Benjamin
 */
public class Pegasus extends MythicalBeing{
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
    public String moveToLocation(String location){
        return ("Flying to " + location);
    }
    
}
