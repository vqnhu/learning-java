package KodeTesting;

public class JavaProgramMovie {
    public static void main(String[] args) {
//
//        Movie one = new Movie();
//        one.title = "Avatar";
//        one.genre = "Fantasy";
//        one.rating = 5;
//
//        Movie two = new Movie();
//        two.title = "Spider Man";
//        two.genre = "Action";
//        two.rating = 4;
//
//        Movie three = new Movie();
//        three.title = "Askepott";
//        three.genre = "Romance";
//        three.rating = 3;
//
//        System.out.println("Title: " + one.title);
//        System.out.println("Genre: " + one.genre);
//        System.out.println("Rating: " + one.rating);
//
//        System.out.println("\n");
//
//        System.out.println("Title: " + two.title);
//        System.out.println("Genre: " + two.genre);
//        System.out.println("Rating: " + two.rating);
//
//        System.out.println("\n");
//
//        System.out.println("Title: " + three.title);
//        System.out.println("Genre: " + three.genre);
//        System.out.println("Rating: " + three.rating);

        Movie one = new Movie("Avatar", "Fantasy", 5);
        Movie two = new Movie("Spider Man", "Action", 4);
        Movie three = new Movie("Askepott", "Romance", 3);

        printMovie(one);
        printMovie(two);
        printMovie(three);

    }

    public static void printMovie(Movie Movie) {
        System.out.println("Title: " + Movie.title);
        System.out.println("Title: " + Movie.genre);
        System.out.println("Title: " + Movie.rating);
        System.out.println();
    }
}
