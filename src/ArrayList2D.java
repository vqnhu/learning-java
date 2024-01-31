import java.util.ArrayList;
import java.util.*;

public class ArrayList2D {
    public static void main(String[] args) {

        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("bread");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> productList = new ArrayList<>();
        productList.add("tomatoes");
        productList.add("apple");
        productList.add("orange");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("coffee");
        drinksList.add("juice");

        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinksList);

        System.out.println(groceryList.get(2).get(1)); // den første get sier hvilket tabell og den andre sier hvilket plass på array
    }
}
