public class Ballerina implements Brainrot{
    private String name;
    private double health;
    private double energy;

    public Ballerina(String name, double energy){
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
        health -=10;
        energy -=10;
    }


    public String toString(){
        return(name + " is at " + health + " hp and is " + energy + " asleep.");

    }
}
