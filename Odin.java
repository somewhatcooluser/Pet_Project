/**
 * The Odin class represents a character with a name, health, and energy level.
 * It provides methods to simulate actions such as eating, sleeping, and playing,
 * which affect the character's health and energy.
 */
public class Odin implements Brainrot{
    private String name;
    private int health;
    private int energy;

    /**
     * Constructs a new Odin object with the specified name and initial energy level.
     * The health is initialized to 100.
     *
     * @param name   The name of the Odin character.
     * @param energy The initial energy level of the Odin character.
     */
    public Odin(String name, int energy) {
        this.name = name;
        this.health = 100;
        this.energy = energy;
    }

    /**
     * Simulates Odin eating. Eating increases health by 10.
     */
    public void eat() {
        System.out.println("Odin devours his meal!");
        health += 10; // Odin gains health when eating
    }

    /**
     * Simulates Odin sleeping. Sleeping increases energy by 10.
     */
    public void sleep() {
        System.out.println("Odin takes a power nap.");
        energy += 10; // Odin becomes less drowsy
    }

    /**
     * Simulates Odin playing. Playing decreases health by 5
     * and decreases energy by 10.
     */
    public void play() {
        System.out.println("Odin trains for battle!");
        health -= 5; // Playing reduces health slightly
        energy -= 10; // Playing makes Odin more drowsy
    }

    
    /**
     * Gets the name of the Odin character.
     *
     * @return The name of the Odin character.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Odin character.
     *
     * @param name The new name to set for the Odin character.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the health of the Odin character.
     *
     * @return The current health of the Odin character.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health of the Odin character.
     *
     * @param health The new health value to set for the Odin character.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets the energy of the Odin character.
     *
     * @return The current energy of the Odin character.
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Sets the energy of the Odin character.
     *
     * @param energy The new energy value to set for the Odin character.
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    /**
     * Returns a string representation of the Odin character, including its name,
     * health, and energy levels.
     *
     * @return A string describing the Odin character's current state.
     */
    public String toString() {
        return name + " is at " + health + " hp and has " + energy + " energy.";
    }
}

