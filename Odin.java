public class Odin implements Brainrot{
    private String name;
    private int health;
    private double drowziness;

    public Odin(String name, double drowziness) {
        this.name = name;
        this.health = 100;
        this.drowziness = drowziness;
    }

    public void eat() {
        System.out.println("Odin devours his meal!");
        health += 10; // Odin gains health when eating
    }

    public void sleep() {
        System.out.println("Odin takes a power nap.");
        drowziness -= 10; // Odin becomes less drowsy
    }

    public void play() {
        System.out.println("Odin trains for battle!");
        health -= 5; // Playing reduces health slightly
        drowziness += 5; // Playing makes Odin more drowsy
    }

    public String toString() {
        return name + " is at " + health + " hp and is " + drowziness + " asleep.";
    }
}

