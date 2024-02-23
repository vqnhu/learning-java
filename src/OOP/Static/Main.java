package OOP.Static;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Filip");
        Friend friend2 = new Friend("Emily");
        Friend friend3 = new Friend("Yoda");
        Friend friend4 = new Friend("Louis");

//        System.out.println(Friend.numberOfFriends);

        Friend.displayFriends();
    }
}
