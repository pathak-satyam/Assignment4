public class CarnivorousMammal extends Mammal {
    private String preferredPrey;

    public CarnivorousMammal(String name, String habitat, boolean hasFur, String preferredPrey) {
        super(name, habitat, hasFur);
        this.preferredPrey = preferredPrey;
    }

    public String getPreferredPrey() {
        return preferredPrey;
    }

    public void setPreferredPrey(String preferredPrey) {
        this.preferredPrey = preferredPrey;
    }

    public String toString() {
        return "CarnivorousMammal " + super.toString() + " [preferredPrey=" + preferredPrey + "]";
    }
}
