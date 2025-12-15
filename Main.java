import java.util.Random;
import java.util.Scanner;

/**
 * The Main class contains the entry point and core logic
 * for the Brainrot game. It manages game flow, user input,
 * Brainrot creation, and the derivative mini-game.
 */
public class Main {

    // Single Scanner used throughout the program
    static Scanner scanner = new Scanner(System.in);

    /**
     * Entry point of the program.
     * Starts the game by hatching a Brainrot and entering the main game loop.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        mainGame(beginning());
    }

    /**
     * Displays the chances of hatching each type of Brainrot.
     */
    public static void displayBrainrotChances() {
        System.out.println("Brainrot Chances:");
        System.out.println("Tung: 10%");
        System.out.println("Ballerina: 25%");
        System.out.println("Tralalero: 30%");
        System.out.println("Odin: 35%");
    }

    /**
     * Determines which Brainrot is hatched based on random chance.
     *
     * @return a randomly generated Brainrot instance
     */
    public static Brainrot brainRotChances() {

        Random random = new Random();

        // Generates a number from 1–100
        int brainrotChance = random.nextInt(100) + 1;

        if (brainrotChance <= 10) {
            return new Tung("Tung", 100);
        } else if (brainrotChance <= 35) {
            return new Ballerina("Ballerina", 100);
        } else if (brainrotChance <= 65) {
            return new Tralalero("Tralaero", 100);
        } else {
            return new Odin("Odin", 100);
        }
    }

    /**
     * Runs the main game loop, allowing the player to interact
     * with their Brainrot until the game ends.
     *
     * @param brainrot the Brainrot character the player is caring for
     */
    public static void mainGame(Brainrot brainrot) {

        boolean game = true;

        while (game && brainrot.getHealth() > 0 && brainrot.getEnergy() > 0) {

            System.out.println("________________");
            System.out.println(brainrot);

            System.out.println("1. Feed brainrot");
            System.out.println("2. Put brainrot to sleep");
            System.out.println("3. Play with brainrot");
            System.out.println("4. End Game");
            System.out.println("5. View Brainrot Chances");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    if (DerivativeGuess(brainrot)) {
                        brainrot.eat();
                    }
                    break;

                case "2":
                    if (DerivativeGuess(brainrot)) {
                        brainrot.sleep();
                    }
                    break;

                case "3":
                    if (DerivativeGuess(brainrot)) {
                        brainrot.play();
                    }
                    break;

                case "4":
                    game = false;
                    System.out.println("Thanks for playing! Goodbye!");
                    break;

                case "5":
                    displayBrainrotChances();
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("________________");

            if (brainrot.getHealth() <= 0 || brainrot.getEnergy() <= 0) {
                System.out.println("R.I.P. " + brainrot.getClass().getSimpleName()
                        + ". Your brainrot has passed away due to lack of care :( .");
            }
        }
    }

    /**
     * Handles the beginning of the game by prompting the user
     * to hatch a Brainrot.
     *
     * @return the newly hatched Brainrot
     */
    public static Brainrot beginning() {

        System.out.println("Welcome to Brainrot world!");
        System.out.println("Press enter to open an egg!");
        scanner.nextLine();

        Brainrot brainrot = brainRotChances();

        System.out.println("Congratulations! You have hatched "
                + brainrot.getClass().getSimpleName() + "!");

        return brainrot;
    }

    /**
     * Runs a derivative quiz that determines whether the Brainrot
     * can safely perform an action.
     *
     * @param brainrot the Brainrot whose health may be affected
     * @return true if the user answers correctly, false otherwise
     */
    public static boolean DerivativeGuess(Brainrot brainrot) {

        System.out.println("________________");

        int coefficient = (int) (Math.random() * 9) + 1;
        int power = (int) (Math.random() * 9);

        String variable = "x";
        String equation;
        String newEquation;

        if (power == 0) {
            equation = String.valueOf(coefficient);
        } else if (power == 1) {
            equation = coefficient + variable;
        } else {
            equation = coefficient + variable + "^" + power;
        }

        if (power == 0) {
            newEquation = "0";
        } else if (power == 1) {
            newEquation = String.valueOf(coefficient);
        } else {
            newEquation = (coefficient * power) + variable + "^" + (power - 1);
        }

        System.out.println("Derivative Quiz! Save your brainrot by answering correctly!");
        System.out.print("What is the derivative for " + equation + "? ");

        String guess = scanner.nextLine().replace(" ", "");

        if (guess.equals(newEquation)) {
            System.out.println("Correct!!!");
            System.out.println("Your brainrot is saved!");
            System.out.println("________________");
            return true;
        }

        System.out.println("Wrong! The correct answer is " + newEquation + ".");
        System.out.println(brainrot.getClass().getSimpleName() + " has lost 30 hp :(");

        brainrot.setHealth(Math.max(0, brainrot.getHealth() - 30));

        System.out.println("________________");
        return false;
    }
}