public class Main {
    public static void main(String[] args) {
        System.out.println("\n--- Testing Readers ---");
        Reader reader1 = new Reader("Anna", "Petrovska", "2368637");
        Reader reader2 = new Reader("Dasha", "Suprun", "5898474");

        reader1.printData();
        reader2.printData();

        System.out.println("\nAnna borrows a book...");
        reader1.increaseBorrowedCount();
        reader1.printData();

        System.out.println("\nAnna returns a book...");
        reader1.decreaseBorrowedCount();
        reader1.printData();
    }
}