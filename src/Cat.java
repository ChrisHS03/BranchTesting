public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public boolean eatFood(String foodType) {
        return super.eatFood(foodType);
    }
}
