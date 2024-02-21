package OOP;

public class IMain {
    public static void main(String[] args) {
//        interface = a template that can be applied to a class.
//                    similar to inheritance, but specifies what a class has/must do.
//                    classes can apply more than one interface, inheritance is limited to 1 superclass

        IRabbit rabbit = new IRabbit();
        IHawk hawk = new IHawk();
        IFish fish = new IFish();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();


    }
}
