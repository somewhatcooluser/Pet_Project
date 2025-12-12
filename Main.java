import java.util.Random;
import java.util.Scanner;
import java.net.URL;
import javax.imageio.ImageIO;

public class Main{


    public static void main(String[] args) {
        mainGame(beginning());
    }

























public static void displayBrainrotChances(){
    System.out.println("Brainrot Chances:");
    System.out.println("Tung: 10%");
    System.out.println("Ballerina: 25%");
    System.out.println("Tralalero: 30%");
    System.out.println("Odin: 35%");
}


public static Brainrot brainRotChances(){
            Brainrot brainrot = null;
            Random random = new Random();
        int brainrotChance = random.nextInt((100 - 1 + 1) + 1);
            if(brainrotChance <= 10){
                return brainrot = new Tung("Tung", 100);
            }
            else if(brainrotChance <= 35){
                return brainrot = new Ballerina("Ballerina", 100);
            }
            else if(brainrotChance <= 65){
                return brainrot = new Tralalero("Tralaero", 100);
            }
            else{
                return brainrot = new Odin("Odin", 100);
            }
}
public static void mainGame(Brainrot brainrot){
    boolean game = true;
    Scanner scanner = new Scanner(System.in);
    while( game == true && brainrot.getHealth() >= 0 && brainrot.getEnergy() >= 0){
        
    System.out.println("________________");
    System.out.println(brainrot);
    System.out.println("1. Feed brainrot");

    System.out.println("2. Put brainrot to sleep");

    System.out.println("3. Play with brainrot");

    System.out.println("4. End Game");

    System.out.println("5. View Brainrot Chances");

    String choice = scanner.nextLine();
        if(choice.equals("4")){
            game = false;
            System.out.println("Thanks for playing! Goodbye!");
        }
        else if(choice.equals("1")){
            brainrot.eat();
        }
        else if(choice.equals("2")){
            brainrot.sleep();
        }
        else if(choice.equals("3")){
            brainrot.play();
        }
        else{
            System.out.println("Invalid Option");
        }
           
        
        System.out.println("________________");
        
        if( brainrot.getHealth() <= 0 && brainrot.getEnergy() <= 0){
            System.out.println("R.I.P. " + brainrot.getClass() + ". Your brainrot has passed away due to lack of care :( .");
        }
        

}
}
 public static Brainrot beginning(){
    Scanner scanner = new Scanner(System.in);
    Brainrot brainrot = null;
        System.out.println("Welcome to Brainrot world!");
        System.out.println("Type e to open an egg!");
        String input = scanner.nextLine();
        if(input.equals("e")){
            brainrot = brainRotChances();
        }
        System.out.println("Congratulations! You have hatched " + (brainrot.getClass().getSimpleName()) + "!");
        return brainrot;
 }   

}
