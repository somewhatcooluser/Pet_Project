/**
 * The Tung class represents a character that implements the Brainrot interface.
 * Tung has attributes such as name, health, and drowsiness, and can perform actions
 * like eating, sleeping, and playing, which affect these attributes.
 */
public class Tung implements Brainrot{
    private String name;
    private int health;
    private int energy;

    public Tung(String name, int energy){
        this.name = name;
        this.health = 100;
        this.energy = energy;
        
    }

    /**
     * Represents the action of eating. Eating increases Tung's health by 5.
     */
    public void eat(){
        System.out.println("Tung Yummy");
        health +=5; //Tung gains health when eating

    }

    /**
     * Represents the action of sleeping. Sleeping decreases Tung's drowsiness by 5.
     */
    public void sleep(){
        System.out.println("zzzz");
        energy +=5; //Tung becomes less drowsy
    }

    /**
     * Represents the action of playing. Playing decreases Tung's health by 3
     * and increases drowsiness by 15.
     */
    public void play(){
        System.out.println("Yay");
        health -=3; //Playing reduces health slightly
        energy -=15; //Playing makes Tung more drowsy
    }

/**
     * Returns a string representation of the Tung instance, including its name,
     * health, and drowsiness levels.
     *
     * @return A string describing the Tung instance.
     */
    public String toString(){
        return name + " is at " + health + " hp and has " + energy + " energy.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Getter and Setter for energy
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}

