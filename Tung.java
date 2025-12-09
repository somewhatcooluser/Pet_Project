interface Brainrot {
    public void eat();
    public void sleep();
    public void play();
}
public class Tung implements Brainrot{
    private String name;
    private double health;
    private double energy;

    public Tung(String name, double energy){
        this.name = name;
        this.health = 100;
        this.energy = energy;
        
    }

    public void eat(){
        System.out.println("Tung Yummy");
        health +=5; //Tung gains health when eating

    }
    public void sleep(){
        System.out.println("zzzz");
        energy +=5; //Tung becomes less drowsy
    }
    public void play(){
        System.out.println("Yay");
        health -=3; //Playing reduces health slightly
        energy -=15; //Playing makes Tung more drowsy
    }


    public String toString(){
        return(name + " is at " + health + " hp and is " + energy + " asleep.");
    }
}

