import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * Single-file Library Management System (core Java)
 * Compile: javac LibraryManagementSystem.java
 * Run:     java LibraryManagementSystem
 */
public class LibraryManagementSystem {

    // ---------- Data models ----------
    static class Book implements Serializable {
        private static final long serialVersionUID = 1L;
        String id;
        String title;
        String author;
        int copies; // number of available copies

        Book(String id, String title, String author, int copies) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.copies = copies;
        }

        @Override
        public String toString() {
            return String.format("[%s] %s by %s (copies: %d)", id, title, author, copies);
        }
    }

    static class Member implements Serializable {
        private static final long serialVersionUID = 1L;
        String id;
        String name;
        String email;

        Member(String id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        @Override
        public String toString() {
            return String.format("[%s] %s (%s)", id, name, email);
        }
    }

    static class IssueRecord implements Serializable {
        private static final long serialVersionUID = 1L;
        String bookId;
        String memberId;
        LocalDate issueDate;
        LocalDate dueDate;

        IssueRecord(String bookId, String memberId, LocalDate issueDate, LocalDate dueDate) {
            this.bookId = bookId;
            this.memberId = memberId;
            this.issueDate = issueDate;
            this.dueDate = dueDate;
        }

        @Override
        public String toString() {
            return String.format("Book:%s -> Member:%s | Issued:%s | Due:%s",
                    bookId, memberId, issueDate, dueDate);
        }
    }

    // ---------- Storage ----------
    static Map<String, Book> books = new HashMap<>();
    static Map<String, Member> members = new HashMap<>();
    // key = bookId, value = IssueRecord (one active issue per book in this simple model)
    static Map<String, IssueRecord> issues = new HashMap<>();

    // ---------- Files ----------
    static final String BOOKS_FILE = "books.dat";
    static final String MEMBERS_FILE = "members.dat";
    static final String ISSUES_FILE = "issues.dat";

    // ---------- Utilities ----------
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        loadAll();
        seedSampleIfEmpty(); // optional: seeds sample data when empty
        mainMenu();
        saveAll();
        System.out.println("Exiting. Data saved.");
    }

    static void mainMenu() {
        int choice;
        do {
            System.out.println("\n=== LIBRARY MANAGEMENT ===");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Search Book");
            System.out.println("4. Add Member");
            System.out.println("5. List Members");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. List Issued Books");
            System.out.println("9. Save Data");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = readInt();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> listBooks();
                case 3 -> searchBookMenu();
                case 4 -> addMember();
                case 5 -> listMembers();
                case 6 -> issueBook();
                case 7 -> returnBook();
                case 8 -> listIssuedBooks();
                case 9 -> { saveAll(); System.out.println("Data saved."); }
                case 0 -> {}
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    // ---------- CRUD operations ----------
    static void addBook() {
        System.out.println("\n--- Add Book ---");
        System.out.print("Book ID (unique): ");
        String id = sc.next().trim();
        sc.nextLine();
        if (books.containsKey(id)) {
            System.out.println("Book ID already exists.");
            return;
        }
        System.out.print("Title: ");
        String title = sc.nextLine().trim();
        System.out.print("Author: ");
        String author = sc.nextLine().trim();
        System.out.print("Copies: ");
        int copies = readInt();
        books.put(id, new Book(id, title, author, copies));
        System.out.println("Book added.");
    }

    static void listBooks() {
        System.out.println("\n--- Books ---");
        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }
        books.values().forEach(System.out::println);
    }

    static void searchBookMenu() {
        System.out.println("\nSearch by: 1) ID  2) Title  3) Author");
        System.out.print("Choice: ");
        int c = readInt();
        sc.nextLine();
        switch (c) {
            case 1 -> {
                System.out.print("Enter Book ID: ");
                String id = sc.nextLine().trim();
                Book b = books.get(id);
                System.out.println(b == null ? "Not found." : b);
            }
            case 2 -> {
                System.out.print("Enter title keyword: ");
                String kw = sc.nextLine().trim().toLowerCase();
                books.values().stream()
                        .filter(b -> b.title.toLowerCase().contains(kw))
                        .forEach(System.out::println);
            }
            case 3 -> {
                System.out.print("Enter author keyword: ");
                String kw = sc.nextLine().trim().toLowerCase();
                books.values().stream()
                        .filter(b -> b.author.toLowerCase().contains(kw))
                        .forEach(System.out::println);
            }
            default -> System.out.println("Invalid choice.");
        }
    }

    static void addMember() {
        System.out.println("\n--- Add Member ---");
        System.out.print("Member ID (unique): ");
        String id = sc.next().trim();
        sc.nextLine();
        if (members.containsKey(id)) {
            System.out.println("Member ID exists.");
            return;
        }
        System.out.print("Name: ");
        String name = sc.nextLine().trim();
        System.out.print("Email: ");
        String email = sc.nextLine().trim();
        members.put(id, new Member(id, name, email));
        System.out.println("Member added.");
    }

    static void listMembers() {
        System.out.println("\n--- Members ---");
        if (members.isEmpty()) {
            System.out.println("No members.");
            return;
        }
        members.values().forEach(System.out::println);
    }

    static void issueBook() {
        System.out.println("\n--- Issue Book ---");
        System.out.print("Book ID: ");
        String bookId = sc.next().trim();
        if (!books.containsKey(bookId)) {
            System.out.println("Book not found.");
            return;
        }
        Book book = books.get(bookId);
        if (book.copies <= 0) {
            System.out.println("No copies available.");
            return;
        }
        System.out.print("Member ID: ");
        String memberId = sc.next().trim();
        if (!members.containsKey(memberId)) {
            System.out.println("Member not found.");
            return;
        }
        if (issues.containsKey(bookId)) {
            System.out.println("This book is already issued to someone.");
            return;
        }
        LocalDate issueDate = LocalDate.now();
        LocalDate dueDate = issueDate.plusDays(14); // 2 week default
        IssueRecord rec = new IssueRecord(bookId, memberId, issueDate, dueDate);
        issues.put(bookId, rec);
        book.copies -= 1;
        System.out.println("Issued. Due date: " + dueDate);
    }

    static void returnBook() {
        System.out.println("\n--- Return Book ---");
        System.out.print("Book ID: ");
        String bookId = sc.next().trim();
        IssueRecord rec = issues.get(bookId);
        if (rec == null) {
            System.out.println("No active issue found for this book.");
            return;
        }
        LocalDate returned = LocalDate.now();
        long lateDays = ChronoUnit.DAYS.between(rec.dueDate, returned);
        double fine = 0;
        if (lateDays > 0) {
            fine = lateDays * 5.0; // Rs.5 per day (example)
        }
        // increase copies
        Book b = books.get(bookId);
        if (b != null) b.copies += 1;
        issues.remove(bookId);
        System.out.printf("Returned on %s. Late days: %d. Fine: %.2f\n", returned, Math.max(0, lateDays), fine);
    }

    static void listIssuedBooks() {
        System.out.println("\n--- Issued Books ---");
        if (issues.isEmpty()) {
            System.out.println("No issued books.");
            return;
        }
        issues.values().forEach(rec -> {
            Book b = books.get(rec.bookId);
            Member m = members.get(rec.memberId);
            System.out.printf("%s -> %s | Issued: %s | Due: %s\n",
                    (b == null ? rec.bookId : b.title),
                    (m == null ? rec.memberId : m.name),
                    rec.issueDate, rec.dueDate);
        });
    }

    // ---------- Persistence ----------
    @SuppressWarnings("unchecked")
    static <T> Map<String, T> loadMap(String filename) {
        File f = new File(filename);
        if (!f.exists()) return new HashMap<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            Object obj = ois.readObject();
            if (obj instanceof Map) {
                return (Map<String, T>) obj;
            }
        } catch (Exception e) {
            System.err.println("Failed to load " + filename + ": " + e.getMessage());
        }
        return new HashMap<>();
    }

    static void saveMap(String filename, Object map) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(map);
        } catch (Exception e) {
            System.err.println("Failed to save " + filename + ": " + e.getMessage());
        }
    }

    static void loadAll() {
        books = loadMap(BOOKS_FILE);
        members = loadMap(MEMBERS_FILE);
        issues = loadMap(ISSUES_FILE);
    }

    static void saveAll() {
        saveMap(BOOKS_FILE, books);
        saveMap(MEMBERS_FILE, members);
        saveMap(ISSUES_FILE, issues);
    }

    // ---------- Helpers ----------
    static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.next().trim());
            } catch (Exception e) {
                System.out.print("Enter valid number: ");
            }
        }
    }

    static void seedSampleIfEmpty() {
        // optional demo data to try quickly
        if (books.isEmpty() && members.isEmpty()) {
            books.put("B001", new Book("B001", "Clean Code", "Robert C. Martin", 3));
            books.put("B002", new Book("B002", "Effective Java", "Joshua Bloch", 2));
            members.put("M001", new Member("M001", "Alice", "alice@example.com"));
            members.put("M002", new Member("M002", "Bob", "bob@example.com"));
            System.out.println("Sample data created. (You can remove seedSampleIfEmpty())");
        }
    }
}
