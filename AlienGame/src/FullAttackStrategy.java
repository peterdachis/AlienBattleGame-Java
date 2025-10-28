import java.util.ArrayList;
import java.util.List;

public class FullAttackStrategy implements AttackStrategy {
    @Override
    public void attack(Warrior warrior, AlienArmy alienArmy) {
        List<String> allAliens = new ArrayList<>(alienArmy.getAliens());
        alienArmy.notifyObservers(allAliens);

        int damage = allAliens.size() * (10 - warrior.getVisibility());
        warrior.reducePower(damage);

        System.out.println("AlienArmy performs FULL ATTACK with " + allAliens.size() + " aliens!");
        System.out.println("Warrior receives " + damage + " damage.");
    }
}
