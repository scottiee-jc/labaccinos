package art_gallery_lab;

import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;

    private ArrayList<Artwork> artworkCollection;

    //constructors
    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.artworkCollection = new ArrayList<>();
    }

    //methods
    void buyArt(Artwork artwork, Gallery gallery) {
        int price = artwork.getPrice();
        this.wallet -= price;
        gallery.setTill(gallery.getTill() + price);
        this.artworkCollection.add(artwork);
        gallery.removeArtwork(artwork);
    }

    public void addArtwork(Artwork artwork) {
        this.artworkCollection.add(artwork);
    }

    public int getWallet() {
        return this.wallet;
    }
}
