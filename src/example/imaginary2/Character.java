package example.imaginary2;

/**
 *
 * @author Benjamin
 */
public abstract class Character {
    private String name;
    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public abstract String moveToLocation(String location);
    
}
