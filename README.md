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

## 🎯 Key Features

### Observation Systems
- **Satellite**: Tracks half of the attacking aliens
- **Telescope**: Tracks all attacking aliens
- **Visibility**: Improves with each Warrior attack, reducing incoming damage

### Attack Strategies
- **FullAttackStrategy**: All aliens attack at once
- **PartialAttackStrategy**: Custom number of aliens attack

### Game Mechanics
- Turn-based combat system
- Real-time status tracking
- Strategic decision making for alien attacks
- Progressive difficulty as visibility changes

## 🏃‍♂️ How to Run

### Prerequisites
- Java JDK 8 or higher
- Git (optional)

### Running the Game
1. **Clone the repository**:
   ```bash
   git clone <your-repository-url>
   cd AlienGame
