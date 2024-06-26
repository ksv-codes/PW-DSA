import java.util.*;

// Define a Book class
class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }
}

// Define a Patron class
class Patron {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    public Patron(int id, String name) {
        this.id = id;
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.borrow();
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.returnBook();
    }
}

// Main Library class
public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void displayBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getId() + ": " + book.getTitle() + " by " + book.getAuthor());
            }
        }
        System.out.println();
    }

    public void displayPatrons() {
        System.out.println("Patrons:");
        for (Patron patron : patrons) {
            System.out.println(patron.getId() + ": " + patron.getName());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book(1, "Java Programming", "John Doe"));
        library.addBook(new Book(2, "Python for Beginners", "Jane Smith"));
        library.addBook(new Book(3, "Data Structures and Algorithms", "Alice Johnson"));

        // Adding patrons to the library
        library.addPatron(new Patron(1, "Michael"));
        library.addPatron(new Patron(2, "Emily"));

        // Example borrowing scenario
        Patron michael = library.patrons.get(0);
        Book javaBook = library.books.get(0);

        System.out.println("Library System Simulation\n");

        // Display available books
        library.displayBooks();

        // Michael borrows a book
        System.out.println("Michael borrows the book: " + javaBook.getTitle());
        michael.borrowBook(javaBook);

        // Display updated list of books
        library.displayBooks();

        // Display list of patrons
        library.displayPatrons();

        // Michael returns the book
        System.out.println("Michael returns the book: " + javaBook.getTitle());
        michael.returnBook(javaBook);

        // Display updated list of books
        library.displayBooks();
    }
}

