public class Artist {

    // Attributes (fields)
    private String name;
    private String country;

    // Constructor
    public Artist(String name, String country) {
        this.name = name;
        this.country = country;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for country
    public String getCountry() {
        return country;
    }

    // Method to display artist info
    public void displayInfo() {
        System.out.println("Artist name: " + name + ", Country: " + country);
    }
}
