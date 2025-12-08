public class Ballerina implements Brainrot{
    private String name;
    private double health;
    private double drowziness;

    public Ballerina(String name, double drowziness){
        this.name = name;
        this.health = 100;
        this.drowziness = drowziness;
        
    }

    public void eat(){
        System.out.println("Ballerina Yummy");
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
