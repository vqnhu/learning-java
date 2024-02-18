package OOP;

public class HumanMain {
    public static void main(String[] args) {
        Human human1 = new Human("Lisa", 25, 65.0);
        Human human2 = new Human("Oda", 28, 60.2);

        human1.eat();
        human2.drink();
    }
}
