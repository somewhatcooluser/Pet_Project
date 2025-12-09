import java.util.Random;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
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

        }
        System.out.println("Congratulations! You have hatched " + (brainrot.getClass().getSimpleName()) + "!");

}
public static void displayBrainrotChances(){
    System.out.println("Brainrot Chances:");
    System.out.println("Tung: 10%");
    System.out.println("Ballerina: 25%");
    System.out.println("Tralalero: 30%");
    System.out.println("Odin: 35%");
}
}

