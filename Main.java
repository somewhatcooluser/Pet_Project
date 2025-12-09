import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        boolean game = true;
        Brainrot brainrot = null;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Brainrot world!");
        System.out.println("Type e to open an egg!");
        String input = scanner.nextLine();
        if(input.equals("e")){
            int brainrotChance = random.nextInt((100 - 1 + 1) + 1);
            if(brainrotChance <= 10){
                brainrot = new Tung("Tung", 100);
            }
            else if(brainrotChance <= 35){
                brainrot = new Ballerina("Ballerina", 100);
            }
            else if(brainrotChance <= 65){
                brainrot = new Tralalero("Tralaero", 100);
            }
            else{
                brainrot = new Odin("Odin", 100);
            }








            System.out.println("Congratulations! You have hatched " + (brainrot.getClass().getSimpleName()) + "!");
        }
        while( game == true){
        System.out.println("________________");
        System.out.println(brainrot);
        System.out.println("1. Feed brainrot");
        
        System.out.println("2. Put brainrot to sleep");
        
        System.out.println("3. Play with brainrot");
        
        System.out.println("4. End Game");
        
        String choice = scanner.nextLine();
        if(choice.equals("4")){
            game = false;
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
        System.out.println("________________");
        }
        





}
}
