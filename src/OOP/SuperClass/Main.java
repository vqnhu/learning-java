package OOP.SuperClass;

public class Main {
    public static void main(String[] args) {
//        super =  keyword refers to the superclass (parent) pf an object
//                 very similar to the "this" keyword

        Person hero1 = new Person("Batman", 35, "Shadow");
        Person hero2 = new Person("Superman", 300, "Super strong");

        System.out.println(hero1.toString());
        System.out.println();
        System.out.println(hero2.toString());
    }
}
