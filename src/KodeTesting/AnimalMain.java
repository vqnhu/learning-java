package KodeTesting;

public class AnimalMain {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Yoda", 4, "*voff voff*", "chicken");
        Fish fish1 = new Fish("Boble", 1, "*blubb blubb*", "grass");
        Cat cat1 = new Cat("Nato", 6, "*meow meow*", "birds");

        dog1.about();
        dog1.speak();

        fish1.about();
        fish1.speak();

        cat1.about();
        cat1.speak();
        cat1.scratch();

        cat1.setAge(10);
        System.out.println(cat1.getAge());
        cat1.about();
    }
}
