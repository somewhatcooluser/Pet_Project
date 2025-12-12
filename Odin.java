public class Odin implements Brainrot{
    private String name;
    private int health;
    private int energy;

    public Odin(String name, int energy) {
        this.name = name;
        this.health = 100;
        this.energy = energy;
    }

    public void eat() {
        System.out.println("Odin devours his meal!");
        health += 10; // Odin gains health when eating
    }

    public void sleep() {
        System.out.println("Odin takes a power nap.");
        energy += 10; // Odin becomes less drowsy
    }

    public void play() {
        System.out.println("Odin trains for battle!");
        health -= 5; // Playing reduces health slightly
        energy -= 10; // Playing makes Odin more drowsy
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for health
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    // Getter and Setter for energy
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String toString() {
        return name + " is at " + health + " hp and has " + energy + " energy.";
    }
}

