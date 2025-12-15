/**
 * The Odin class represents a powerful Brainrot character
 * with a name, health, and energy.
 * It defines Odin's unique behavior when eating, sleeping, and playing.
 */
public class Odin implements Brainrot {

    // Stores Odin's name
    private String name;

    // Stores Odin's current health
    private int health;

    // Stores Odin's current energy
    private int energy;

    /**
     * Constructs a new Odin with a name and starting energy.
     * Health is initialized to 100.
     *
     * @param name   the name of Odin
     * @param energy the starting energy value
     */
    public Odin(String name, int energy) {
        this.name = name;
        this.health = 100;
        this.energy = energy;
    }

    /**
     * Simulates Odin eating.
     * Eating increases health.
     */
    public void eat() {
        System.out.println("Odin devours his meal!");
        health += 10;
    }

    /**
     * Simulates Odin sleeping.
     * Sleeping restores energy.
     */
    public void sleep() {
        System.out.println("Odin takes a power nap.");
        energy += 10;
    }

    /**
     * Simulates Odin playing.
     * Playing slightly decreases health and energy.
     */
    public void play() {
        System.out.println("Odin trains for battle!");
        health -= 5;
        energy -= 10;
    }

    /**
     * Returns Odin's name.
     *
     * @return the name of Odin
     */
    public String getName() {
        return name;
    }

    /**
     * Sets Odin's name.
     *
     * @param name the new name for Odin
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the current health value.
     *
     * @return Odin's health
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
     * @return Odin's energy
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

    /**
     * Returns a string representation of Odin.
     *
     * @return a string describing Odin's current state
     */
    public String toString() {
        return name + " is at " + health + " hp and has " + energy + " energy.";
    }
}
