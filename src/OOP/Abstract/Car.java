package OOP.Abstract;

public class Car extends Vehicle {


    @Override
    void go() {
        System.out.println("The driver is driving the car");
    }

    @Override
    void stop() {
        System.out.println("The driver just stopped the car");
    }

}
