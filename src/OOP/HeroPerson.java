package OOP;

public class HeroPerson extends Hero {
    String power;

    public HeroPerson(String name, int age, String power) {
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return super.toString() + this.power;
    }
}
