package OOP;

public class VehicleMain {
    public static void main(String[] args) {
        //    inheritance = the process where one class acquires,
        //                  the attributes and methods of another

        VehicleCar car = new VehicleCar();

        car.go();

        VehicleBicycle bicycle = new VehicleBicycle();
        bicycle.stop();

        System.out.println(car.speed);
        System.out.println(bicycle.speed);

        System.out.println(car.wheels);
        System.out.println(bicycle.pedals);
    }
}


