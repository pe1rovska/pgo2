public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Readers ---");
        Reader reader1 = new Reader("Anna", "Petrovska", "2368637");
        reader1.printData();

        System.out.println("\n--- Task 3: Testing Library ---");
        Library myLibrary = new Library(5);

        myLibrary.addBook(new Book("The Witcher", "Andrzej Sapkowski", 300, true));
        myLibrary.addBook(new Book("Solaris", "Stanisław Lem", 200, true));

        myLibrary.printAvailableBooks();

        System.out.println("Total books in library: " + myLibrary.countAvailableBooks());
    }
}