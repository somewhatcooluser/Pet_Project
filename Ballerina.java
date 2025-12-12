/**
 * The Ballerina class represents a character with a name, health, and energy level.
 * It provides methods to simulate actions such as eating, sleeping, and playing,
 * which affect the character's health and energy.
 */
public class Ballerina implements Brainrot{
    private String name;
    private int health;
    private int energy;

    /**
     * Constructs a new Ballerina object with the specified name and initial energy level.
     * The health is initialized to 100.
     *
     * @param name   The name of the Ballerina character.
     * @param energy The initial energy level of the Ballerina character.
     */
    public Ballerina(String name, int energy){
        this.name = name;
        this.health = 100;
        this.energy = energy;
        
    }

     /**
     * Simulates the Ballerina eating. Eating increases health by 15
     * but decreases energy by 10.
     */
    public void eat(){
        System.out.println("Ballerina Yummy");
        health += 15;
        energy -= 10;  
    }

    /**
     * Simulates the Ballerina sleeping. Sleeping increases energy by 20.
     */
    public void sleep(){
        System.out.println("zzzz");
        energy +=20;
    }

    /**
     * Simulates the Ballerina playing. Playing decreases health by 20
     * and decreases energy by 10.
     */
    public void play(){
        System.out.println("Yay");
        health -=20;
        energy -=10;
    }

/**
     * Returns a string representation of the Ballerina, including her name,
     * health, and energy level.
     *
     * @return A string describing the Ballerina's current state.
     */
    public String toString(){
        return name + " is at " + health + " hp and has " + energy + " energy.";

    }

    /**
     * Gets the name of the Ballerina.
     *
     * @return The name of the Ballerina.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Ballerina.
     *
     * @param name The new name to set for the Ballerina.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the health of the Ballerina.
     *
     * @return The current health of the Ballerina.
     */
    public int getHealth() {
        return health;
    }

     /**
     * Sets the health of the Ballerina.
     *
     * @param health The new health value to set for the Ballerina.
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets the energy of the Ballerina.
     *
     * @return The current energy of the Ballerina.
     */
    public int getEnergy() {
        return energy;
    }

    /**
     * Sets the energy of the Ballerina.
     *
     * @param health The new energy value to set for the Ballerina.
     */
    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
