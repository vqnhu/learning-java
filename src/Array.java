public class Array {
    public static void main(String[] args) {
        // array = used to store multiple values in a single variable

        String[] cars = new String[4];

        cars[0] = "Nio";
        cars[1] = "Tesla";
        cars[2] = "BMW";
        cars[3] = "Toyota";


        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
