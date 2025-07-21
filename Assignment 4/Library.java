import java.util.ArrayList;

public class Library {
    // Add the missing implementation to this class

    private String address;
    private ArrayList<Book> books;


    public Library(String libraryAddress) {
        address = libraryAddress;
        books = new ArrayList<>();
    }

    public static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(address);
    }

    public void printAvailableBooks() {
        if (books.size() == 0) {
            System.out.println("No book in catalog");
            return;
        }

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            if (!book.isBorrowed()) {
                System.out.println(book.getTitle());
            }
        }
    }

    public Book findBook(String bookName) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (bookName.equals(book.getTitle())) {
                return book;
            }
        }

        return null;
    }

    public void addBook(Book book) {
        String bookName = book.getTitle();
        if (findBook(bookName) != null) {
            System.out.println(bookName + " has already existed");
            return;
        }

        books.add(book);
    }

    public void borrowBook(String bookName) {
        Book book = findBook(bookName);
        if (book == null) {
            System.out.println("Sorry, this book is not in our catalog.");
            return;
        }

        if (book.isBorrowed()) {
            System.out.println("Sorry, this book is already borrowed.");
            return;
        }

        System.out.println("You successfully borrowed " + bookName);
        book.rented();

        // for (int i = 0; i < books.size(); i++) {
        //     Book book = books.get(i);
        //     if (bookName.equals(book.getTitle())) {
        //         if (book.isBorrowed()) {
        //             System.out.println("Sorry, this book is already borrowed.");
        //         } else {
        //             System.out.println("You successfully borrowed " + bookName);
        //             book.rented();
        //         }
        //         return;
        //     }
        // }
    }

    public void returnBook(String bookName) {
        Book book = findBook(bookName);
        if (book == null) {
            System.out.println("Sorry, this book is not in our catalog.");
            return;
        }

        if (!book.isBorrowed()) {
            System.out.println("Sorry, this book is already returned.");
            return;
        }

        System.out.println("You successfully returned " + bookName);
        book.returned();

        // for (int i = 0; i < books.size(); i++) {
        //     Book book = books.get(i);
        //     if (bookName.equals(book.getTitle())) {
        //         if (book.isBorrowed()) {
        //             System.out.println("You successfully returned " + bookName);
        //             book.returned();
        //         } else {
        //             System.out.println("Sorry, this book is already return.");
        //         }
        //         return;
        //     }
        // }
    }

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
} 