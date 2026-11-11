import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Library Tracker - Search Module ===");
        // دالة البحث
        searchBook("Clean Code");
        // دالة الحذف
        removeBook("Clean code");
    }

    // دالة البحث عن كتاب بالاسم
    public static boolean searchBook(String searchTitle) {
        System.out.println("Searching for book: " + searchTitle);
        
        try {
            File file = new File("books.json");
            Scanner scanner = new Scanner(file);
            boolean found = false;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.toLowerCase().contains(searchTitle.toLowerCase())) {
                    found = true;
                    break;
                }
            }
            scanner.close();

            if (found) {
                System.out.println("Result: Book '" + searchTitle + "' is available!");
                return true;
            } else {
                System.out.println("Result: Book '" + searchTitle + "' not found.");
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error reading books.json: " + e.getMessage());
            return false;
        }
    }
    public static boolean removeBook(String targetTitle) {
        System.out.println("Initiating removal for: " + targetTitle);
        try {
            java.io.File file = new java.io.File("books.json");
            if (!file.exists()) {
                System.out.println("Error: File not found.");
                return false;
            }
            System.out.println("Checking database for " + targetTitle + "...");
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    
}