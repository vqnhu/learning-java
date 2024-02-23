package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
//        polymorphism = greek word for poly-"many", morph-"form"
//                       The ability of an object to identify as more than one type

//        In this case eks. car identify as a car but also as a vehicle.
//        Vehicle can also identify as an Object with a few changes in the code.

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for (Vehicle x : racers) {
            x.go();
        }
    }
}
