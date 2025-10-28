import java.util.ArrayList;
import java.util.List;

public class AlienArmy {
    private List<String> aliens;
    private List<AlienArmyObserver> observers = new ArrayList<>();
    private AttackStrategy attackStrategy;

    public AlienArmy(int alienCount) {
        aliens = new ArrayList<>();
        for (int i = 1; i <= alienCount; i++) {
            aliens.add("Alien-" + i);
        }
    }

    public void addObserver(AlienArmyObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(List<String> attackingAliens) {
        for (AlienArmyObserver observer : observers) {
            observer.update(attackingAliens);
        }
    }

    public void setAttackStrategy(AttackStrategy strategy) {
        this.attackStrategy = strategy;
    }

    public void attack(Warrior warrior) {
        if (attackStrategy != null) {
            attackStrategy.attack(warrior, this);
        }
    }

    public int destroyAliens(List<String> aliensToDestroy) {
        int count = 0;
        for (String alien : aliensToDestroy) {
            if (aliens.remove(alien)) {
                count++;
            }
        }
        return count;
    }

    public List<String> getAliens() {
        return new ArrayList<>(aliens);
    }

    public boolean isDefeated() {
        return aliens.isEmpty();
    }

    public void displayStatus() {
        System.out.println("AlienArmy - Remaining aliens: " + aliens.size());
    }
}
