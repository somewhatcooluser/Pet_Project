import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Brainrot world!");
        System.out.println("Type e to open an egg!");
        String input = scanner.nextLine();
        if(input.equals("e")){
            int brainrotChance = random.nextInt((100 - 1 + 1) + 1);
            if(brainrotChance <= 10){
                Tung brainrot = new Tung("Tung", 100)
            }
            else if(brainrotChance <= 35){
                Ballerina brainrot = new Ballerina("Ballerina", 100);
            }
            else if(brainrotChance <= 65){
                Tralaero brainrot = new Tralaero("Tralaero", 100);
            }
            else{
                Odin brainrot = new Odin("Odin", 100);
            }








            System.out.println("Congratulations! You have hatched " + (brainrot.getClass().getSimpleName()) + "!");
        }






}
}
