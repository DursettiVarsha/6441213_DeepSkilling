import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    // Linear Search by Title
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary Search by Title (requires sorted array)
    public Book binarySearchByTitle(String title) {
        // Must be sorted first
        Arrays.sort(books, Comparator.comparing(Book::getTitle, String.CASE_INSENSITIVE_ORDER));

        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(title);

            if (cmp == 0) return books[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    // Print all books
    public void printAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
