package OOP;

public class IFish implements InterfacePredator, InterfacePrey {
    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("The fish cant flee");
    }

}
