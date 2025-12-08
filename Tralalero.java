public class Tralalero implements Brainrot{
    private String name;
    private double health;
    private double sleepiness;

    public Tralalero(String name, double sleepiness){
        this.name = name;
        this.health = 150;
        this.sleepiness = sleepiness;
    }

    public void eat(){
        System.out.println("Yum Tralalero");
        health += 20;
    }

    public void sleep(){
        System.out.println("zzzzzzz");
        sleepiness -= 50;
        health += 50;
    }

    public void play(){
        System.out.println("Yay Tralalero");
        health += 10;
        sleepiness += 30;
    }


    public String toString(){
        return name + " is at " + health + " hp and is " + sleepiness + " pts tired";
    }
}