/**
 * The Tung class represents a character that implements the Brainrot interface.
 * Tung has attributes such as name, health, and drowsiness, and can perform actions
 * like eating, sleeping, and playing, which affect these attributes.
 */
public class Tung implements Brainrot{
    private String name;
    private int health;
    private int energy;

    /**
     * Constructs a new Tung object with the specified name and initial energy level.
     * The health is initialized to 100.
     *
     * @param name   The name of the Tung character.
     * @param energy The initial energy level of the Tung character.
     */
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
     * Represents the action of sleeping. Sleeping increases Tung's energy by 5.
     */
    public void sleep(){
        System.out.println("zzzz");
        energy +=5; //Tung becomes less drowsy
    }

    /**
     * Represents the action of playing. Playing decreases Tung's health by 3
     * and decreases energy by 15.
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

    /**
 * Gets the name of the Tung instance.
 *
 * @return The name of the Tung instance.
 */
    public String getName() {
        return name;
    }

    /**
 * Sets the name of the Tung instance.
 *
 * @param name The new name to set for the Tung instance.
 */
    public void setName(String name) {
        this.name = name;
    }

    /**
 * Gets the health of the Tung instance.
 *
 * @return The current health of the Tung instance.
 */
    public int getHealth() {
        return health;
    }

    /**
 * Sets the health of the Tung instance.
 *
 * @param health The new health value to set for the Tung instance.
 */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
 * Gets the energy of the Tung instance.
 *
 * @return The current energy of the Tung instance.
 */
    public int getEnergy() {
        return energy;
    }

    /**
 * Sets the energy of the Tung instance.
 *
 * @param energy The new energy value to set for the Tung instance.
 */
    public void setEnergy(int energy) {
        this.energy = energy;
    }
}

