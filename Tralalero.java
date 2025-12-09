/**
 * The Tralalero class represents a character with a name, health, and sleepiness level.
 * It provides methods to perform actions such as eating, sleeping, and playing,
 * which affect the character's health and sleepiness.
 */
public class Tralalero implements Brainrot{
    private String name;
    private double health;
    private double sleepiness;

    /**
     * Constructs a new Tralalero object with the specified name and initial sleepiness level.
     * The health is initialized to 150.
     *
     * @param name       The name of the Tralalero.
     * @param sleepiness The initial sleepiness level of the Tralalero.
     */
    public Tralalero(String name, double sleepiness){
        this.name = name;
        this.health = 150;
        this.sleepiness = sleepiness;
    }

    /**
     * Simulates the Tralalero eating, which increases its health by 20.
     */
    public void eat(){
        System.out.println("Yum Tralalero");
        health += 20;
    }

    /**
     * Simulates the Tralalero sleeping, which decreases its sleepiness by 50
     * and increases its health by 50.
     */
    public void sleep(){
        System.out.println("zzzzzzz");
        sleepiness -= 50;
        health += 50;
    }

    /**
     * Simulates the Tralalero playing, which increases its health by 10
     * and increases its sleepiness by 30.
     */
    public void play(){
        System.out.println("Yay Tralalero");
        health += 10;
        sleepiness += 30;
    }

/**
     * Returns a string representation of the Tralalero, including its name,
     * health, and sleepiness level.
     *
     * @return A string describing the Tralalero's current state.
     */
    public String toString(){
        return name + " is at " + health + " hp and is " + sleepiness + " pts tired";
    }
}