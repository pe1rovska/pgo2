public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        }
    }

    public void printAvailableBooks() {
        System.out.println("\n--- Available Books ---");
        for (int i = 0; i < bookCount; i++) {
            books[i].printInfo();
        }
    }

    public int countAvailableBooks() {
        return bookCount;
    }

    public void borrowBook(String title, Reader reader) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title) && books[i].isAvailable()) {
                books[i].borrow();
                reader.increaseBorrowedCount();
                System.out.println("Book '" + title + "' borrowed by " + reader.getLastName());
                return;
            }
        }
        System.out.println("Book not available: " + title);
    }

    public void returnBook(String title, Reader reader) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].returnBook();
                reader.decreaseBorrowedCount();
                System.out.println("Book '" + title + "' returned by " + reader.getLastName());
                return;
            }
        }
    }
}