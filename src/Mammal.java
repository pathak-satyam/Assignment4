public class Mammal extends Animal{
    private boolean hasFur;
    public Mammal(String name, String habitat, boolean hasFur) {
        super(name, habitat);
        this.hasFur = hasFur;
    }

    public boolean hasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String toString() {
        return "Mammal " + super.toString() + " [hasFur=" + hasFur + "]";
    }
}
