public class ArtGallery {

    private String name;
    private String location;

    public ArtGallery(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void displayInfo() {
        System.out.println("Gallery: " + name + ", Location: " + location);
    }
}
