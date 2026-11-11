
import java.util.ArrayList;

public class App {


    static ArrayList<String> books = new ArrayList<>();

    public static void main(String[] args) {

        books.add("Java Basics");
        books.add("Clean Code");
        books.add("Flutter Guide");

        System.out.println("Library Books:");
        for (String book : books) {
            System.out.println(book);
        }
        searchBook("Java Basics");
        searchBook("Python");
    }
    public static void searchBook(String title) {

    for (String book : books) {

        if (book.equalsIgnoreCase(title)) {
            System.out.println("Book found: " + book);
            return;
        }
    }

    System.out.println("Book not found!");
}

}
