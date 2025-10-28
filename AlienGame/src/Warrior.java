import java.util.List;

public class Warrior {
    private int power;
    private int visibility;
    private Satellite satellite;
    private Telescope telescope;

    public Warrior(int power, Satellite satellite, Telescope telescope) {
        this.power = power;
        this.visibility = 5;
        this.satellite = satellite;
        this.telescope = telescope;
    }

    public void attack(AlienArmy alienArmy) {
        System.out.println("\nWarrior attacks!");

        List<String> satelliteAliens = satellite.getObservedAliens();
        List<String> telescopeAliens = telescope.getObservedAliens();

        int destroyedBySatellite = alienArmy.destroyAliens(satelliteAliens);
        int destroyedByTelescope = alienArmy.destroyAliens(telescopeAliens);

        System.out.println("Warrior destroys " + destroyedBySatellite + " aliens observed by satellite.");
        System.out.println("Warrior destroys " + destroyedByTelescope + " aliens observed by telescope.");

        visibility = Math.min(10, visibility + 2);
        System.out.println("Warrior's visibility increases to " + visibility);
    }

    public void reducePower(int amount) {
        power -= amount;
        visibility = Math.max(0, visibility - 1);
    }

    public int getPower() {
        return power;
    }

    public int getVisibility() {
        return visibility;
    }

    public boolean isDefeated() {
        return power <= 0;
    }

    public void displayStatus() {
        System.out.println("Warrior - Power: " + power + ", Visibility: " + visibility);
    }
}
