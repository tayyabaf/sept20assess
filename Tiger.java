package assessmentsept20;

public class Tiger extends Feline{
    public Tiger(String name, String color) {
        super(name, color);
    }

    @Override
    public void getEyeDescription() {
        System.out.println("eyes are beautiful");
    }
}
