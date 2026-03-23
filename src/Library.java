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
        } else {
            System.out.println("Library is full!");
        }
    }

    public void printAvailableBooks() {
        System.out.println("\n--- Available Books ---");
        for (int i = 0; i < bookCount; i++) {
            books[i].printInfo();
        }
    }

    public void findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                books[i].printInfo();
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }
    public int countAvailableBooks() {
        return bookCount;
    }
}