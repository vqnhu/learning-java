import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {

//        for-each = traversing technique to iterate through the element in an array/collextion
//                   less step, more readable
//                   less flexible

//        String[] animals = {"cat", "dog", "rat", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for (String i : animals) {
            System.out.println(i);
        }
    }
}
