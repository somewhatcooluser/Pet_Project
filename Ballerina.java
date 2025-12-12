public class Ballerina implements Brainrot{
    private String name;
    private int health;
    private int energy;

    public Ballerina(String name, int energy){
        this.name = name;
        this.health = 100;
        this.energy = energy;
        
    }

    public void eat(){
        System.out.println("Ballerina Yummy");
        health += 15;
        energy -= 10;  
    }
    public void sleep(){
        System.out.println("zzzz");
        energy +=20;
    }
    public void play(){
        System.out.println("Yay");
        health -=20;
        energy -=10;
    }


    public String toString(){
        return name + " is at " + health + " hp and has " + energy + " energy.";

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
}
