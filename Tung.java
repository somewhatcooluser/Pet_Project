/**
 * The Tung class represents a character that implements the Brainrot interface.
 * Tung has attributes such as name, health, and drowsiness, and can perform actions
 * like eating, sleeping, and playing, which affect these attributes.
 */
interface Brainrot {
    public void eat();
    public void sleep();
    public void play();
}
public class Tung implements Brainrot{
    private String name;
    private double health;
    private double drowziness;

    /**
     * Constructs a new Tung instance with the specified name and initial drowsiness level.
     * The health is initialized to 100.
     *
     * @param name       The name of the Tung instance.
     * @param drowziness The initial drowsiness level of Tung.
     */
    public Tung(String name, double drowziness){
        this.name = name;
        this.health = 100;
        this.drowziness = drowziness;
        
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
        drowziness -=5; //Tung becomes less drowsy
    }

    /**
     * Represents the action of playing. Playing decreases Tung's health by 3
     * and increases drowsiness by 15.
     */
    public void play(){
        System.out.println("Yay");
        health -=3; //Playing reduces health slightly
        drowziness +=15; //Playing makes Tung more drowsy
    }

/**
     * Returns a string representation of the Tung instance, including its name,
     * health, and drowsiness levels.
     *
     * @return A string describing the Tung instance.
     */
    public String toString(){
        return(name + " is at " + health + " hp and is " + drowziness + " asleep.");
    }
}

