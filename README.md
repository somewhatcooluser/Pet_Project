
# 🧠 Brainrot World

## 📌 Project Overview

**Brainrot World** is a Java console-based virtual pet game where players hatch and care for a randomly generated “Brainrot” character. Each Brainrot has unique stats and behaviors that affect its **health** and **energy** over time. The player must manage these attributes carefully to keep their Brainrot alive.

To add an educational twist, most actions are gated behind a **calculus-based derivative mini-game**. Answering correctly allows the Brainrot to safely perform actions, while incorrect answers result in health loss.

---

## 🎮 Gameplay Features

### 🥚 Brainrot Hatching

* At the start of the game, the player opens an egg.
* A Brainrot is randomly selected based on predefined probabilities.

### 📊 Brainrot Types & Chances

| Brainrot  | Chance |
| --------- | ------ |
| Tung      | 10%    |
| Ballerina | 25%    |
| Tralalero | 30%    |
| Odin      | 35%    |

Each Brainrot type has different stat changes when eating, sleeping, or playing.

---

## 🧬 Brainrot Characters

All Brainrot characters implement the `Brainrot` interface, ensuring consistent behavior across all types.

### 🔹 Tung

* Balanced beginner Brainrot
* Small health and energy gains
* Higher energy loss when playing

### 🔹 Ballerina

* Fragile but efficient
* Gains more health from eating
* Loses more health when playing

### 🔹 Tralalero

* High starting health (150 HP)
* Risk-reward playstyle
* Strong eating benefits but heavy energy loss when playing

### 🔹 Odin

* Durable and efficient
* Low health loss during play
* Moderate energy recovery

---

## 🧠 Brainrot Interface

All Brainrot types must implement the following behaviors:

* `eat()`
* `sleep()`
* `play()`
* `getHealth()`
* `getEnergy()`
* `getName()`
* Setters for health, energy, and name

This ensures polymorphism and allows the game to treat all Brainrot types uniformly.

---

## 🧮 Derivative Quiz (Educational Feature)

Before most actions, players must complete a **Derivative Guess mini-game**.

### How It Works:

* A random polynomial of the form `ax^n` is generated
* The player must input the correct derivative
* Correct answer → Action is performed
* Incorrect answer → Brainrot loses **30 HP**

### Example:

```
What is the derivative of 3x^4?
Correct answer: 12x^3
```

This mechanic encourages learning while adding risk and strategy to gameplay.

---

## ☠️ Game Over Conditions

The game ends when:

* Health reaches **0**
* Energy reaches **0**
* Player manually quits

A death message is displayed if the Brainrot dies due to neglect or incorrect answers.

---

## 🛠️ Technical Highlights

* Written entirely in **Java**
* Uses:

  * Interfaces for clean OOP design
  * Polymorphism for Brainrot behaviors
  * `Random` for chance-based outcomes
  * `Scanner` for user input
* Includes full **Javadoc documentation**
* Console-based UI for simplicity and clarity

---

## 👥 Collaborators

This project was developed collaboratively by:

* **Raymond**
* **Bryce**
* **Aiden**
* **Nam**
* **Ethan** — *DerivativeGuess mini-game*
* **ChatGPT** — *Debugging, documentation, and structure assistance*

---

## 🚀 How to Run

1. Ensure you have **Java JDK 8+** installed
2. Compile all `.java` files:

   ```
   javac *.java
   ```
3. Run the program:

   ```
   java Main
   ```

---

## 📈 Future Improvements

Potential enhancements include:

* GUI version (JavaFX or Swing)
* Difficulty scaling for derivative problems
* Saving/loading Brainrot progress
* Stat caps and balancing
* More Brainrot types
* Expanded math topics beyond derivatives

---

## 📝 Final Notes

**Brainrot World** blends object-oriented programming concepts with educational problem-solving. It demonstrates clean design, teamwork, and creative integration of learning mechanics into gameplay.

🎉 *Thanks for playing — take good care of your Brainrot!*
