import java.util.*;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Linear search to find books by title
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search to find books by title (assuming the list is sorted by title)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);
            int comparison = midBook.getTitle().compareToIgnoreCase(title);
            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "Rich Dad Poor Dad", " Robert Kiyosaki and Sharon Lechter"));
        library.addBook(new Book(2, "The 5AM Club ", "George Orwell"));
        library.addBook(new Book(3, "Ikigai", "Francesc Miralles and Hector Garcia"));

        // Linear search
        System.out.println("Linear Search For The 5AM Club");
        Book book = library.linearSearchByTitle("The 5AM Club");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }

        // Binary search (assuming the list is sorted by title)
        System.out.println("\nBinary Search For 'The 5AM Club':");
        book = library.binarySearchByTitle("The 5AM Club");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }
}
