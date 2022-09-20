package assessmentsept20;

public class Dog extends Canine implements Pet{
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void priceOfPet() {
        System.out.println("Dogs are $20 each");
    }

    @Override
    public void getEyeDescription() {
        System.out.println("eyes are big and can be diff colors");
    }
}
