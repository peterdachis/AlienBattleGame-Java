import java.util.Scanner;

public class BattleGame {
    private Warrior warrior;
    private AlienArmy alienArmy;
    private Satellite satellite;
    private Telescope telescope;
    private Scanner scanner;
    private boolean warriorsTurn;

    public BattleGame(int warriorPower, int alienCount) {
        satellite = new Satellite();
        telescope = new Telescope();
        warrior = new Warrior(warriorPower, satellite, telescope);
        alienArmy = new AlienArmy(alienCount);
        alienArmy.addObserver(satellite);
        alienArmy.addObserver(telescope);
        scanner = new Scanner(System.in);
        warriorsTurn = true;
    }

    public void startGame() {
        System.out.println("=== BATTLE BEGINS ===");
        System.out.println("Warrior vs AlienArmy (" + alienArmy.getAliens().size() + " aliens)");
        System.out.println("---------------------");

        while (!warrior.isDefeated() && !alienArmy.isDefeated()) {
            displayStatus();

            if (warriorsTurn) {
                warrior.attack(alienArmy);
            } else {
                alienAttackPhase();
            }

            warriorsTurn = !warriorsTurn;
            System.out.println("---------------------");
        }

        displayFinalResult();
    }

    private void alienAttackPhase() {
        System.out.println("\nAlienArmy's turn to attack!");
        System.out.println("Choose attack strategy:");
        System.out.println("1. Full Attack");
        System.out.println("2. Partial Attack");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        while (choice < 1 || choice > 2) {
            System.out.print("Invalid choice. Enter 1 or 2: ");
            choice = scanner.nextInt();
        }

        if (choice == 1) {
            alienArmy.setAttackStrategy(new FullAttackStrategy());
        } else {
            System.out.print("Enter number of aliens to attack (1-" + alienArmy.getAliens().size() + "): ");
            int count = scanner.nextInt();
            int max = alienArmy.getAliens().size();
            while (count < 1 || count > max) {
                System.out.print("Invalid number. Enter 1-" + max + ": ");
                count = scanner.nextInt();
            }
            alienArmy.setAttackStrategy(new PartialAttackStrategy(count));
        }

        alienArmy.attack(warrior);
    }

    private void displayStatus() {
        warrior.displayStatus();
        alienArmy.displayStatus();
    }

    private void displayFinalResult() {
        System.out.println("\n=== BATTLE ENDS ===");
        if (warrior.isDefeated()) {
            System.out.println("AlienArmy WINS! The Warrior has been defeated.");
        } else {
            System.out.println("Warrior WINS! All aliens have been destroyed.");
        }
    }

    public static void main(String[] args) {
        BattleGame game = new BattleGame(100, 20);
        game.startGame();
    }
}
