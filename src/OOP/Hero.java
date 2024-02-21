package OOP;

public class Hero {
    String name;
    int age;

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return this.name + "\n" + this.age + "\n";
    }
}
