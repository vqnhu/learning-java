package OOP;

public class CarMain {
    public static void main(String[] args) {
        CarGarage garage = new CarGarage();

        Car car1 = new Car("Tesla");
        Car car2 = new Car("BMW");

        garage.park(car1);
        garage.park(car2);
    }
}
