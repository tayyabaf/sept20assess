package assessmentsept20;

public class Cat extends Feline implements Pet{
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void priceOfPet() {
        System.out.println("Each cat is $30");
    }

    @Override
    public void getEyeDescription() {
        System.out.println("eyes are light and pointed");
    }
}
