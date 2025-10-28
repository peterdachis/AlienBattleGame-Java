import java.util.ArrayList;
import java.util.List;

public class Telescope implements AlienArmyObserver {
    private List<String> observedAliens = new ArrayList<>();

    @Override
    public void update(List<String> attackingAliens) {
        observedAliens.clear();
        observedAliens.addAll(attackingAliens);
    }

    public List<String> getObservedAliens() {
        return new ArrayList<>(observedAliens);
    }
}
