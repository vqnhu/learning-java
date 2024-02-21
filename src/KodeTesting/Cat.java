package KodeTesting;

public class Cat extends Animal {
    public Cat(String name, int age, String speak, String eat) {
        super(name, age, speak, eat);
    }

    void scratch() {
        System.out.println("The cat " + getName() + " likes to scratch the couch *meow meow*" + "\n");
    }
}
