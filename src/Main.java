public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
        dog.eatFood("Beef");
        cat.eatFood("Fish");
        dog.mood(true);
        cat.mood(false);
    }
}
