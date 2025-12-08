interface Brainrot {
    public void eat();
    public void sleep();
    public void play();
}
public class Tung implements Brainrot{
    private String name;
    private double health;
    private double drowziness;

    public Tung(String name, double drowziness){
        this.name = name;
        this.health = 100;
        this.drowziness = drowziness;
        
    }

    public void eat(){
        System.out.println("Tung Yummy");
    }
    public void sleep(){
        System.out.println("zzzz");
    }
    public void play(){
        System.out.println("Yay");
    }


    public String toString(){
        return(name + " is at " + health + " hp and is " + drowziness + " asleep.");
    }
}

public class Odin implements Brainrot{
    
}
