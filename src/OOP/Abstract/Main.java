package OOP.Abstract;

public class Main {
    public static void main(String[] args) {
        //        abstract - abstract classes cannot be instantiated, but they can have a subclass
        //                   abstract methods are declared without an implementation

        //        I Java brukes abstrakte klasser når du har en klasse som fungerer som et generelt rammeverk,
        //        men ikke kan instansieres direkte. I stedet må du opprette underklasser som utvider den abstrakte klassen
        //        og implementerer dens abstrakte metoder.

        //        AbstractVehicle vehicle = new AbstractVehicle(); - abstrakyt klasse kan ikke bli instansiert
        Car car = new Car();


        car.go();
        car.stop();

    }
}
