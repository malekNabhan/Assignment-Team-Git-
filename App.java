
import java.util.ArrayList;

public class App {

    static ArrayList<String> books = new ArrayList<>();

    public static void main(String[] args) {
        print_banner();

        print_banner();
        System.out.println("Main branch update");

        addBook("Java Programming");
        addBook("Python Basics");

        listBooks();

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

    public static void addBook(String title) {

        if (title == null || title.trim().isEmpty()) {
            System.out.println("Book title cannot be empty! Edit Edit");
            return;
        }

        books.add(title.trim());

        System.out.println("Book added: " + title);
    }

    public static void listBooks() {

        System.out.println("Library Books:");

        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }

        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void removeBook(String title) {

        if (books.removeIf(book -> book.equalsIgnoreCase(title))) {
            System.out.println("Book removed: " + title);
        } else {
            System.out.println("Book not found!");
        }
    }
    public static void print_banner() {
    System.out.println("------------------------------");
    System.out.println("       JAVA BOOK LIBRARY      ");
    System.out.println("------------------------------");
}

}
