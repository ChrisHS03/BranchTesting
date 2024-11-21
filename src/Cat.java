public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public boolean eatFood(String foodType) {
        return super.eatFood(foodType);
    }

    @Override
    public void mood(boolean b) {
        if (b == true) {
            System.out.println("spinder");
        } else {
            System.out.println("hvæser");
        }
    }
}
