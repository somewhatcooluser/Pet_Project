/**
 * The Tralalero class represents a character with a name, health, and sleepiness level.
 * It provides methods to perform actions such as eating, sleeping, and playing,
 * which affect the character's health and sleepiness.
 */
public class Tralalero implements Brainrot{
    private String name;
    private double health;
    private double energy;

    public Tralalero(String name, double energy){
        this.name = name;
        this.health = 150;
        this.energy = energy;
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
        energy += 20;
        health += 10;
    }

    /**
     * Simulates the Tralalero playing, which increases its health by 10
     * and increases its sleepiness by 30.
     */
    public void play(){
        System.out.println("Yay Tralalero");
        health -= 10;
        energy -= 30;
    }

/**
     * Returns a string representation of the Tralalero, including its name,
     * health, and sleepiness level.
     *
     * @return A string describing the Tralalero's current state.
     */
    public String toString(){
        return name + " is at " + health + " hp and is " + energy + " asleep.";
    }
}
