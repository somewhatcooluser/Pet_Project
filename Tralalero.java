public class Tralalero implements Brainrot{
    private String name;
    private double health;
    private double energy;

    public Tralalero(String name, double energy){
        this.name = name;
        this.health = 150;
        this.energy = energy;
    }

    public void eat(){
        System.out.println("Yum Tralalero");
        health += 20;
    }

    public void sleep(){
        System.out.println("zzzzzzz");
        energy += 50;
        health += 50;
    }

    public void play(){
        System.out.println("Yay Tralalero");
        health += 10;
        energy -= 30;
    }


    public String toString(){
        return name + " is at " + health + " hp and is " + energy + " pts tired";
    }
}
