
public class Book {
    private String title;
    private String author;
    private int pageCount;
    private boolean available;

    public Book(String title, String author, int pageCount, boolean available) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.available = available;
    }

    public void printInfo() {
        System.out.println("Book: '" + title + "' by " + author + " | Pages: " + pageCount + " | Available: " + available);
    }
    public void borrow() {
        this.available = false;
    }
    public void returnBook() {
        this.available = true;
    }
    public String getTitle() { return title; }
    public boolean isAvailable() { return available; }
}
