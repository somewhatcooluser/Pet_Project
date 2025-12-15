/**
 * The Tung class represents a Brainrot character.
 * Tung has a name, health, and energy, and can eat, sleep,
 * and play, which affect these attributes.
 */
public class Tung implements Brainrot {

    // Stores Tung's name
    private String name;

    // Stores Tung's current health
    private int health;

    // Stores Tung's current energy
    private int energy;

    /**
     * Constructs a new Tung with a name and starting energy.
     * Health is initialized to 100.
     *
     * @param name   the name of the Tung
     * @param energy the starting energy value
     */
    public Tung(String name, int energy) {
        this.name = name;
        this.health = 100;
        this.energy = energy;
    }

    /**
     * Represents the action of eating.
     * Eating increases Tung's health.
     */
    public void eat() {
        System.out.println("Tung Yummy");
        health += 5; // Tung gains health when eating
    }

    /**
     * Represents the action of sleeping.
     * Sleeping restores energy.
     */
    public void sleep() {
        System.out.println("zzzz");
        energy += 5; // Tung becomes less drowsy
    }

    /**
     * Represents the action of playing.
     * Playing slightly decreases health and energy.
     */
    public void play() {
        System.out.println("Yay");
        health -= 3;   // Playing reduces health slightly
        energy -= 15;  // Playing uses energy
    }

    /**
     * Returns a string representation of the Tung instance,
     * including its name, health, and energy.
     *
     * @return a string describing Tung's current state
     */
    public String toString() {
        return name + " is at " + health + " hp and has " + energy + " energy.";
    }

    /**
     * Returns Tung's name.
     *
     * @return the name of Tung
     */
    public String getName() {
        return name;
    }

    /**
     * Sets Tung's name.
     *
     * @param name the new name for Tung
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the current health value.
     *
     * @return Tung's health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health value.
     *
     * @param health the new health value
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Returns the current energy value.
     *
     * @return Tung's energy
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Sets the energy value.
     *
     * @param energy the new energy value
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
