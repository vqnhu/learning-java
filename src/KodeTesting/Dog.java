package KodeTesting;

public class Dog extends Animal {
    public Dog(String name, int age, String speak, String eat) {
        super(name, age, speak, eat);
    }

    @Override
    void speak() {
        System.out.println(getName() + " barks like " + getSpeak() + "\n");
    }
}
