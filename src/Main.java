public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Anna", "Petrovska", "2368637");

        Library myLibrary = new Library(5);
        myLibrary.addBook(new Book("The Witcher", "Andrzej Sapkowski", 300, true));
        myLibrary.addBook(new Book("Solaris", "Stanisław Lem", 200, true));

        System.out.println("--- Task 4: Borrowing Process ---");

        myLibrary.borrowBook("The Witcher", reader1);
        myLibrary.printAvailableBooks();

        myLibrary.returnBook("The Witcher", reader1);
        myLibrary.printAvailableBooks();
    }
}