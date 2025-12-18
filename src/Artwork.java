public class Artwork {

    private String title;
    private int year;
    private double price;

    public Artwork(String title, int year, double price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Artwork: " + title +
                ", Year: " + year +
                ", Price: $" + price);
    }
}
