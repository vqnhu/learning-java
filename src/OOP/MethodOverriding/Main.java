package OOP.MethodOverriding;

public class Main {
    //    method overriding = Declaring a method in sub class,
//                        which is already present in parent class.
//                        done so that a child class can give its iwn implementation
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak();
        dog.speak();
    }

}
