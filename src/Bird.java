public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, String habitat, boolean canFly) {
        super(name, habitat);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String toString() {
        return "Bird " + super.toString() + " [canFly=" + canFly + "]";
    }
}
