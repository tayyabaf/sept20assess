package assessmentsept20;

public class Lion extends Feline{
    public Lion(String name, String color) {
        super(name, color);
    }


    @Override
    public void getEyeDescription() {
        System.out.println("eyes are fierce");
    }

}
