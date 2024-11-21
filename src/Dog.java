public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public boolean eatFood(String foodType) {
        return super.eatFood(foodType);
    }
}
