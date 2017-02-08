package example.real2;

/**
 *
 * @author Benjamin
 */
public class Arthropod extends Insect{
    private String name;
    private boolean isAlive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    public String moveToLocation(String location){
        return ("Moving to " + location);
    }
}
