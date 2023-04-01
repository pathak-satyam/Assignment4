public class Reptiles extends Animal{
    private boolean hasScales;

    public Reptiles(String name, String habitat, boolean hasScales) {
        super(name, habitat);
        this.hasScales = hasScales;
    }

    public boolean hasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

    public String toString() {
        return "Reptiles " + super.toString() + " [hasScales=" + hasScales + "]";
    }
}
