# 🎮 Alien Game - Warrior vs Alien Army Battle in Java

A Java-based turn-based strategy game where a powerful Warrior battles against an Alien Army using advanced observation systems and strategic attacks.

#🚀 How to Play
Game Setup
Warrior: Starts with 100 power and 5 visibility

Alien Army: Starts with 20 aliens

Objective: Defeat all aliens before the Warrior runs out of power

Game Flow
The game alternates turns between the Warrior and the Alien Army:

#🛡️ Warrior's Turn
The Warrior automatically attacks using observation data from:

Satellite: Observes half of the attacking aliens

Telescope: Observes all attacking aliens

After each attack, the Warrior's visibility increases by 2 (up to maximum 10)

#👽 Alien Army's Turn
You choose the attack strategy:

Full Attack - All aliens attack simultaneously

Partial Attack - Select how many aliens attack (1 to remaining aliens)

Damage System
Alien Damage: Number of attacking aliens × (10 - Warrior's visibility)

Warrior Visibility: Affects defense (higher visibility = less damage)

Warrior Power: Decreases with each alien attack

#🎯 Key Features
Observation Systems
Satellite: Tracks half of the attacking aliens

Telescope: Tracks all attacking aliens

Visibility: Improves with each Warrior attack, reducing incoming damage

Attack Strategies
FullAttackStrategy: All aliens attack at once

PartialAttackStrategy: Custom number of aliens attack

Game Mechanics
Turn-based combat system

Real-time status tracking

Strategic decision making for alien attacks

Progressive difficulty as visibility changes

#🏃‍♂️ How to Run
Prerequisites
Java JDK 8 or higher

Git (optional)

Running the Game
Clone the repository:

bash
git clone <your-repository-url>
cd AlienGame
Compile and run:

bash
javac src/*.java
java -cp src BattleGame
Or run directly from your IDE by executing the BattleGame.java file.

#🎮 Game Controls
During Alien Army's turn, you'll be prompted to:

Choose attack type: Enter 1 for Full Attack or 2 for Partial Attack

Select aliens (if Partial Attack): Enter the number of aliens to attack

#📊 Status Display
The game shows real-time information:

text
Warrior - Power: 100, Visibility: 5
AlienArmy - Remaining aliens: 20
#🏆 Winning Conditions
Warrior Wins: When all aliens are destroyed

Alien Army Wins: When Warrior's power reaches 0 or below

#🛠️ Technical Details
Main Classes
BattleGame: Main game controller

Warrior: Player character with power and visibility

AlienArmy: Enemy forces with observer pattern

Satellite/Telescope: Observation systems

AttackStrategy: Interface for different attack types

Design Patterns Used
Observer Pattern: For tracking alien movements

Strategy Pattern: For different attack types

Command Pattern: For game actions

#💡 Tips for Success
Balance Visibility: Higher visibility reduces damage but requires multiple attacks

Strategic Alien Attacks: Use Partial Attack when Warrior has high visibility

Monitor Power: Keep track of your remaining power to plan attacks
