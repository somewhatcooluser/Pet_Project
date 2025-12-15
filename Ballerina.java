/**
 * The Ballerina class represents a Brainrot character
 * with a name, health, and energy.
 * It defines how a Ballerina eats, sleeps, and plays.
 */
public class Ballerina implements Brainrot {

    // Stores the name of the Ballerina
    private String name;

    // Stores the current health value
    private int health;

    // Stores the current energy value
    private int energy;

    /**
     * Constructs a new Ballerina with a name and starting energy.
     * Health is initialized to 100.
     *
     * @param name   the name of the Ballerina
     * @param energy the starting energy value
     */
    public Ballerina(String name, int energy) {
        this.name = name;
        this.health = 100;
        this.energy = energy;
    }

    /**
     * Simulates the Ballerina eating.
     * Eating increases health but decreases energy.
     */
    public void eat() {
        System.out.println("Ballerina Yummy");
        health += 15;
        energy -= 10;
    }

    /**
     * Simulates the Ballerina sleeping.
     * Sleeping restores energy.
     */
    public void sleep() {
        System.out.println("zzzz");
        energy += 20;
    }

    /**
     * Simulates the Ballerina playing.
     * Playing decreases both health and energy.
     */
    public void play() {
        System.out.println("Yay");
        health -= 20;
        energy -= 10;
    }

    /**
     * Returns a string representation of the Ballerina.
     *
     * @return a string describing the Ballerina's current state
     */
    public String toString() {
        return name + " is at " + health + " hp and has " + energy + " energy.";
    }

    /**
     * Returns the name of the Ballerina.
     *
     * @return the Ballerina's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Ballerina.
     *
     * @param name the new name of the Ballerina
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the current health value.
     *
     * @return the Ballerina's health
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
     * @return the Ballerina's energy
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
