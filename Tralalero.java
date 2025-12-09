public class Tralalero implements Brainrot{
    private String name;
    private double health;
    private double drowziness;

    public Tralalero(String name, double drowziness){
        this.name = name;
        this.health = 150;
        this.drowziness = drowziness;
    }

    public void eat(){
        System.out.println("Yum Tralalero");
        health += 20;
    }

    public void sleep(){
        System.out.println("zzzzzzz");
        drowziness -= 20;
        health += 10;
    }

    public void play(){
        System.out.println("Yay Tralalero");
        health -= 10;
        drowziness += 30;
    }


    public String toString(){
        return name + " is at " + health + " hp and is " + drowziness + " asleep.";
    }
}
