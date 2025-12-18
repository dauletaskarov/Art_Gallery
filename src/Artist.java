public class Artist {

    
    private String name;
    private String country;

    public Artist(String name, String country) {
        this.name = name;
        this.country = country;
    }


    public String getName() {
        return name;
    }


    public String getCountry() {
        return country;
    }


    public void displayInfo() {
        System.out.println("Artist name: " + name + ", Country: " + country);
    }
}
