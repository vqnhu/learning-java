package KodeTesting;

public class Animal {
    private String name;
    private int age;
    private String speak;
    private String eat;


    public Animal(String name, int age, String speak, String eat) {
        this.name = name;
        this.age = age;
        this.speak = speak;
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpeak() {
        return speak;
    }

    public String getEat() {
        return eat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }


    void speak() {
        System.out.println(name + " make sound like " + speak + "\n");
    }

    void about() {
        System.out.println(name + " is " + age + " years old, and likes to eat " + eat + "\n");
    }
}
