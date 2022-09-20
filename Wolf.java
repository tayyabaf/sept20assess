package assessmentsept20;

public class Wolf extends Canine{
    public Wolf(String name, String color) {
        super(name, color);
    }

    @Override
    public void getEyeDescription() {
        System.out.println("eyes are big and dark");
    }
}
