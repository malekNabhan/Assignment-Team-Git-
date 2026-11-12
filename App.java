
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
        
        removeBook("Clean Code");
        removeBook("Python");
        searchBook("Java ");
        searchBook("Clean");

System.out.println("Books after deletion:");
for (String book : books) {
    System.out.println(book);
}
    }
    public static void searchBook(String title) {

    String searchTitle = title.trim().toLowerCase();

    for (String book : books) {

        if (book.toLowerCase().contains(searchTitle)) {
            System.out.println("Book found: " + book);
            return;
        }
    }

    System.out.println("Book not found!");
}

public static void removeBook(String title) {

    if (books.removeIf(book -> book.equalsIgnoreCase(title))) {
        System.out.println("Book removed: " + title);
    } else {
        System.out.println("Book not found!");
    }
}


}
