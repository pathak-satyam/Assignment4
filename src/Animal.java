public class Animal {
    private String name;
    private String habitat;
    public String Animal(String name,String habitat){
        this.name=name;
        this.habitat=habitat;
    }
    public String getName(){
        return name;
}
    public void setName(String name){
        this.name=name;

}
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String toString() {
        return "Animal [name=" + name + ", habitat=" + habitat + "]";
    }
}
