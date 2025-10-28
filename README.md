# 🎮 Alien Game - Warrior vs Alien Army Battle

A Java-based turn-based strategy game where a powerful Warrior battles against an Alien Army using advanced observation systems and strategic attacks.

## 🚀 How to Play

### Game Setup
- **Warrior**: Starts with 100 power and 5 visibility
- **Alien Army**: Starts with 20 aliens
- **Objective**: Defeat all aliens before the Warrior runs out of power

### Game Flow
The game alternates turns between the Warrior and the Alien Army:

#### 🛡️ Warrior's Turn
- The Warrior automatically attacks using observation data from:
  - **Satellite**: Observes half of the attacking aliens
  - **Telescope**: Observes all attacking aliens
- After each attack, the Warrior's visibility increases by 2 (up to maximum 10)

#### 👽 Alien Army's Turn
You choose the attack strategy:
1. **Full Attack** - All aliens attack simultaneously
2. **Partial Attack** - Select how many aliens attack (1 to remaining aliens)

### Damage System
- **Alien Damage**: `Number of attacking aliens × (10 - Warrior's visibility)`
- **Warrior Visibility**: Affects defense (higher visibility = less damage)
- **Warrior Power**: Decreases with each alien attack

## 🏃‍♂️ How to Run

### Prerequisites
- Java JDK 8 or higher


# Compile all Java files
javac src/*.java

# Run the game
java -cp src BattleGame

🎮 Game Controls
During Alien Army's turn:

Enter 1 for Full Attack

Enter 2 for Partial Attack, then enter number of aliens

📊 Status Display
text
Warrior - Power: 100, Visibility: 5
AlienArmy - Remaining aliens: 20
🏆 Winning Conditions
Warrior Wins: All aliens destroyed

Alien Army Wins: Warrior power ≤ 0

🛠️ Project Structure
text
AlienGame/
├── src/
│   ├── BattleGame.java
│   ├── Warrior.java
│   ├── AlienArmy.java
│   ├── Satellite.java
│   ├── Telescope.java
│   ├── AlienArmyObserver.java
│   ├── AttackStrategy.java
│   ├── FullAttackStrategy.java
│   └── PartialAttackStrategy.java
└── README.md
💡 Tips
Higher visibility = less damage

Use Partial Attack when visibility is high

Monitor your power level

🐛 Troubleshooting
bash
# Check Java installation
java -version
javac -version

# If "command not found", install Java JDK
