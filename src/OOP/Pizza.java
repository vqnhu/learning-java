package OOP;

public class Pizza {

    //    overloaded constructors = multiple constructors within a class with the same name,
//                              but have different parameters
//                              name + parameter = signature

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
