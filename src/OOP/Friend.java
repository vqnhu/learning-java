package OOP;

public class Friend {
//    static = modifier, A single copy of a variable/ method is created and shared.
//             The class "owns" the static member

    String name;
    static int numberOfFriends;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
