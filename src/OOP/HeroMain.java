package OOP;

public class HeroMain {
    public static void main(String[] args) {
//        super =  keyword refers to the superclass (parent) pf an object
//                 very similar to the "this" keyword

        HeroPerson hero1 = new HeroPerson("Batman", 35, "Shadow");
        HeroPerson hero2 = new HeroPerson("Superman", 300, "Super strong");

        System.out.println(hero1.toString());
        System.out.println();
        System.out.println(hero2.toString());
    }
}
