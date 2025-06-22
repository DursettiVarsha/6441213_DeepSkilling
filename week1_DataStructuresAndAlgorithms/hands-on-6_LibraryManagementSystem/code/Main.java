public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Java Programming", "James Gosling"),
            new Book(102, "Clean Code", "Robert C. Martin"),
            new Book(103, "Data Structures", "Mark Allen Weiss"),
            new Book(104, "Design Patterns", "Erich Gamma"),
            new Book(105, "Effective Java", "Joshua Bloch")
        };

        Library library = new Library(books);

        System.out.println("All books in library:");
        library.printAllBooks();

        String searchTitle = "Data Structures";
        System.out.println("\n Searching (Linear) for: " + searchTitle);
        Book found1 = library.linearSearchByTitle(searchTitle);
        System.out.println(found1 != null ? found1 : "Not found.");

        System.out.println("\n Searching (Binary) for: " + searchTitle);
        Book found2 = library.binarySearchByTitle(searchTitle);
        System.out.println(found2 != null ? found2 : "Not found.");
    }
}
