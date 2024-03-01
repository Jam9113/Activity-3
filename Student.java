public class Student extends LibraryUser {
    public void printItemsBorrowed() {
        System.out.println("Items borrowed by student:");
        for (LibraryItem item : borrowedItems) {
            System.out.println(item);
        }
    }
}