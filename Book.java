public class Book implements LibraryItem {
    private String title;
    private String author;
    private int publicationYear;
    private boolean borrowed;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public void borrowItem() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("The book '" + title + "' by " + author + " has been borrowed.");
        } else {
            System.out.println("The book '" + title + "' is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            System.out.println("The book '" + title + "' has been returned.");
        } else {
            System.out.println("The book '" + title + "' is not currently borrowed.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    // Getters and setters for other attributes
}