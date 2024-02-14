public class OverloadedMethod {
    public static void main(String[] args) {
//      overloaded methods = methods that share the same name but have different parameters
//                          method name + parameters = method signatur

        int x = add(1, 4);
        double y = add(1.5, 2.5);

        System.out.println(x);
        System.out.println(y);
    }

    static int add(int a) {
        System.out.println("Method #1");

        return a;
    }

    static int add(int a, int b) {
        System.out.println("Method #2");

        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Methods #3");

        return a + b + c;
    }

    static double add(double a) {
        System.out.println("Methods #4");

        return a;
    }

    static double add(double a, double b) {
        System.out.println("Methods #5");

        return a + b;
    }
}
