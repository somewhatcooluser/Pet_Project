import java.util.Random;
import java.util.Scanner;
import java.net.URL;
import javax.imageio.ImageIO;

public class Main{

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Calls the beginning() method and passes its result to mainGame() to start the game
        mainGame(beginning());
    }
























// Method to display the chances of hatching each type of Brainrot
public static void displayBrainrotChances(){
    // Print the title for the chances
    System.out.println("Brainrot Chances:");
    // Print the chance of hatching a Tung
    System.out.println("Tung: 10%");
    // Print the chance of hatching a Ballerina
    System.out.println("Ballerina: 25%");
    // Print the chance of hatching a Tralalero
    System.out.println("Tralalero: 30%");
    // Print the chance of hatching an Odin
    System.out.println("Odin: 35%");
}

// Method to determine which Brainrot is hatched based on random chance
public static Brainrot brainRotChances(){
    // Declare a Brainrot variable to store the result
            Brainrot brainrot = null;
        // Create a Random object to generate random numbers
            Random random = new Random();
        // Generate a random number between 1 and 100 to determine the type of Brainrot
        int brainrotChance = random.nextInt((100 - 1 + 1) + 1);
         // Check if the random number falls within the range for hatching a Tung
            if(brainrotChance <= 10){
                return brainrot = new Tung("Tung", 100);
            }
        // Check if the random number falls within the range for hatching a Ballerina
            else if(brainrotChance <= 35){
                return brainrot = new Ballerina("Ballerina", 100);
            }
        // Check if the random number falls within the range for hatching a Tralalero
            else if(brainrotChance <= 65){
                return brainrot = new Tralalero("Tralaero", 100);
            }
        // If the random number is greater than 65, hatch an Odin
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
            DerivativeGuess(brainrot);
            brainrot.eat();
        }
        else if(choice.equals("2")){
            DerivativeGuess(brainrot);
            brainrot.sleep();
        }
        else if(choice.equals("3")){
            DerivativeGuess(brainrot);
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
    // Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);
    // Declare a Brainrot variable to store the hatched Brainrot
    Brainrot brainrot = null;
    
    // Print welcome message and instructions
    System.out.println("Welcome to Brainrot world!");
    System.out.println("Type e to open an egg!");
    
    // Get user input
    String input = scanner.nextLine();
    
    // Check if the user typed "e" to open an egg
    if(input.equals("e")){
        // Call brainRotChances() to determine which Brainrot is hatched
        brainrot = brainRotChances();
    }
    
    // Print a message congratulating the user on hatching a Brainrot
    System.out.println("Congratulations! You have hatched " + (brainrot.getClass().getSimpleName()) + "!");
    
    // Return the hatched Brainrot
    return brainrot;
}   


 public static boolean DerivativeGuess(Brainrot brainrot){
    // creating variables
    System.out.println("________________");
    Scanner input = new Scanner(System.in);
    int coefficent;
    int power;
    String variable = "x";
    int newCoefficent;
    int newPower;
    String equation;
    String newEquation;
    // creating a random coefficent
    coefficent = (int)(Math.random()*(10));
    // creating a radnom power
    power = (int)(Math.random()*(10));
    newCoefficent = power * coefficent;
    newPower = power - 1;
    //making the new equation
    if(power == 0){
        equation = String.valueOf(coefficent);
    }
    else if(power == 1){
        equation = coefficent + variable;
    }
    else{
        equation = coefficent + variable + "^" + power;
    }
    if(power == 0){
        newEquation = "0";
    }
    else if(power == 1){
        newEquation = String.valueOf(coefficent);
    }
    else{
        newEquation = newCoefficent + variable + "^" + newPower;
    }
    // loop for the users guesses 
    System.out.println("Derivative Quiz! Save your brainrot by answering correctly!");
    System.out.print("What is the derivative for " + equation + "? ");
    String guess = input.nextLine();
    if(guess.equals(newEquation)){
        System.out.println("Correct!!!");
        System.out.println("Your brainrot is saved!");
        System.out.println("________________");
        return true;
    
}
System.out.println("Wrong! The correct answer is " + newEquation + " " + brainrot.getClass().getSimpleName() + " has loss 30 hp :(");
brainrot.setHealth(brainrot.getHealth() - 30);
System.out.println("________________");
return false;
}
}
