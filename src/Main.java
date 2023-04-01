public class Main {
    public static void main(String[] args) {
        Mammal lion = new Mammal("Lion", "Savannah", true);
        Bird eagle = new Bird("Eagle", "Mountains", true);
        Reptiles snake = new Reptiles("Snake", "Desert", true);
        CarnivorousMammal tiger = new CarnivorousMammal("Tiger", "Jungle", true, "Deer");

        System.out.println(lion);
        System.out.println(eagle);
        System.out.println(snake);
        System.out.println(tiger);
    }
}