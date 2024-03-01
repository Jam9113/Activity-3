public class DVD implements LibraryItem {
    private String title;
    private String director;
    private int runningTime;
    private boolean borrowed;

    public DVD(String title, String director, int runningTime) {
        this.title = title;
        this.director = director;
        this.runningTime = runningTime;
        this.borrowed = false;
    }

    public void borrowItem() {
        if (!isBorrowed()) {
            borrowed = true;
            System.out.println("DVD borrowed: " + title);
        } else {
            System.out.println("DVD is already borrowed: " + title);
        }
    }

    public void returnItem() {
        if (isBorrowed()) {
            borrowed = false;
            System.out.println("DVD returned: " + title);
        } else {
            System.out.println("DVD is not currently borrowed: " + title);
        }
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    // Getters and setters for other attributes
}
