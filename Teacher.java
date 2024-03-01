public class Teacher extends LibraryUser {
    public void printItemsBorrowed() {
        System.out.println("Items borrowed by teacher:");
        for (LibraryItem item : borrowedItems) {
            System.out.println(item);
        }
    }
}