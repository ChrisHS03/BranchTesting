public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public boolean eatFood(String foodType) {
        return super.eatFood(foodType);
    }

    @Override
    public void mood(boolean b) {
        if (b == true) {
            System.out.println("logrer");
        } else {
            System.out.println("knurrer");
        }
    }
}
