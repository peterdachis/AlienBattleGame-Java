import java.util.ArrayList;
import java.util.List;

public class Satellite implements AlienArmyObserver {
    private List<String> observedAliens = new ArrayList<>();

    @Override
    public void update(List<String> attackingAliens) {
        int half = attackingAliens.size() / 2;
        if (half < 1 && !attackingAliens.isEmpty()) {
            half = 1;
        }
        observedAliens.clear();
        for (int i = 0; i < half; i++) {
            observedAliens.add(attackingAliens.get(i));
        }
    }

    public List<String> getObservedAliens() {
        return new ArrayList<>(observedAliens);
    }
}
