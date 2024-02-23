package OOP.SuperClass;

public class Person extends Hero {
    String power;

    public Person(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return super.toString() + this.power;
    }
}
