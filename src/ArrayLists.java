import java.util.ArrayList;

public class ArrayLists<S> {
    public static void main(String[] args) {
        // ArrayList = a resizable array.
        //              Elements can be added and removed after compilation phase
        //              store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza!!!");
        food.add("sushi!!!");
        food.add("hotdog!!!");

//        food.set(0, "hamburger"); // endrer innholdet i AarrayList
//        food.remove(2); // Fjerner innholdet

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }


    }
}
