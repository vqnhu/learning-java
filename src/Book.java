//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Book {

    String title;
    String author;
    int numberOfPages;

    public Book(String bookTitle, String bookAuthor, int bookPages) {
        title = bookTitle;
        author = bookAuthor;
        numberOfPages = bookPages;
    }

    public static void main(String[] args) {
        Book myBook1 = new Book("Bukkene Bruse", "Nhu", 30);
        Book myBook2 = new Book("Star Wars", "Filip", 300);

        System.out.println(myBook1.title);
        System.out.println((myBook2.title));

    }
}