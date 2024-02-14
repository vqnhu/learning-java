public class Method {
    public static void main(String[] args) {
//        method = a block of code that is executed whenever it is called upon

        String name = "Nhu";
        int age = 30;
        hello(name, age);

    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("Du er " + age + " år");
    }


}
