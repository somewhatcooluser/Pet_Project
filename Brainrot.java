// Interface that defines the common behaviors and properties
// that every Brainrot type (Tung, Ballerina, Tralaero, Odin, etc.) must have
interface Brainrot {

    // Method that defines how the brainrot eats
    // Implementing classes will decide how eating affects health and energy
    public void eat();

    // Method that defines how the brainrot sleeps
    // Implementing classes will decide how sleeping restores energy or health
    public void sleep();

    // Method that defines how the brainrot plays
    // Implementing classes will decide how playing affects energy and health
    public void play();

    // Returns the current health value of the brainrot
    public int getHealth();

    // Returns the current energy value of the brainrot
    public int getEnergy();

    // Returns the name of the brainrot
    public String getName();

    // Sets the brainrot's health to a new value
    // Used when the brainrot gains or loses health
    public void setHealth(int health);

    // Sets the brainrot's energy to a new value
    // Used when the brainrot gains or loses energy
    public void setEnergy(int energy);

    // Sets the brainrot's name
    // Allows renaming or assigning the name at creation
    public void setName(String name);
}
