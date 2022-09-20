package assessmentsept20;

public class Hippo extends Animal{


    public Hippo(String name, String color) {
        super(name, color);


    }


    @Override
    public void getEyeDescription() {
        System.out.println("eyes are small");
    }
}
