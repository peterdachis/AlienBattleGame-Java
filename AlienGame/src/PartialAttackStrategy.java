import java.util.ArrayList;
import java.util.List;

public class PartialAttackStrategy implements AttackStrategy {
    private int attackingAliensCount;

    public PartialAttackStrategy(int count) {
        this.attackingAliensCount = count;
    }

    @Override
    public void attack(Warrior warrior, AlienArmy alienArmy) {
        List<String> attackingAliens = new ArrayList<>();
        List<String> allAliens = alienArmy.getAliens();

        int actualCount = Math.min(attackingAliensCount, allAliens.size());
        for (int i = 0; i < actualCount; i++) {
            attackingAliens.add(allAliens.get(i));
        }

        alienArmy.notifyObservers(attackingAliens);

        int damage = attackingAliens.size() * (10 - warrior.getVisibility());
        warrior.reducePower(damage);

        System.out.println("AlienArmy performs PARTIAL ATTACK with " + attackingAliens.size() + " aliens!");
        System.out.println("Warrior receives " + damage + " damage.");
    }
}
