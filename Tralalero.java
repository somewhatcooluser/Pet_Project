/**
 * The Tralalero class represents a Brainrot character with a name,
 * health, and energy level.
 * It provides methods to eat, sleep, and play, which affect
 * the character's health and energy.
 */
public class Tralalero implements Brainrot {

    // Stores the name of the Tralalero
    private String name;

    // Stores the current health value
    private int health;

    // Stores the current energy value
    private int energy;

    /**
     * Constructs a new Tralalero with the given name and starting energy.
     * Health is initialized to 150.
     *
     * @param name   the name of the Tralalero
     * @param energy the starting energy value
     */
    public Tralalero(String name, int energy) {
        this.name = name;
        this.health = 150;
        this.energy = energy;
    }

    /**
     * Simulates the Tralalero eating.
     * Eating increases the Tralalero's health.
     */
    public void eat() {
        System.out.println("Yum Tralalero");
        health += 20;
    }

    /**
     * Simulates the Tralalero sleeping.
     * Sleeping restores energy but slightly decreases health.
     */
    public void sleep() {
        System.out.println("zzzzzzz");
        energy += 15;
        health -= 10;
    }

    /**
     * Simulates the Tralalero playing.
     * Playing decreases both health and energy.
     */
    public void play() {
        System.out.println("Yay Tralalero");
        health -= 10;
        energy -= 30;
    }

    /**
     * Returns a string representation of the Tralalero,
     * including its name, health, and energy.
     *
     * @return a string describing the Tralalero's current state
     */
    public String toString() {
        return name + " is at " + health + " hp and has " + energy + " energy.";
    }

    /**
     * Returns the name of the Tralalero.
     *
     * @return the Tralalero's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Tralalero.
     *
     * @param name the new name for the Tralalero
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the current health value.
     *
     * @return the Tralalero's health
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
     * @return the Tralalero's energy
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
