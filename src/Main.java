public class Main {
    public static void main(String[] args) {

        // Create gallery
        ArtGallery gallery = new ArtGallery("Modern Art Gallery", "Paris");

        // Create artist
        Artist artist1 = new Artist("Vincent van Gogh", "Netherlands");
        Artist artist2 = new Artist("Vincent van Gogh", "Netherlands");

        // Create artworks
        Artwork artwork1 = new Artwork("Starry Night", 1889, 1000000);
        Artwork artwork2 = new Artwork("Starry Night", 1889, 1000000);

        // Display information
        gallery.displayInfo();
        artist1.displayInfo();
        artwork1.displayInfo();

        // Compare artists
        if (artist1.getName().equals(artist2.getName()) &&
                artist1.getCountry().equals(artist2.getCountry())) {
            System.out.println("Artists are the same.");
        } else {
            System.out.println("Artists are different.");
        }

        // Compare artworks
        if (artwork1.getTitle().equals(artwork2.getTitle()) &&
                artwork1.getYear() == artwork2.getYear()) {
            System.out.println("Artworks are the same.");
        } else {
            System.out.println("Artworks are different.");
        }
    }
}
