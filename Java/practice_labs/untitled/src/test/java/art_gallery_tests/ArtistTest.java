package art_gallery_tests;

import org.testng.annotations.Test;

public class ArtistTest {
}

class ArtworkTest {

    @Test
    void getPrice() {
    }
}

class CustomerTest {

    private Artwork artwork1;
    private Customer customer;
    private Gallery gallery;

    //gallery.addArtwork(artwork1);

    @BeforeEach
    void setUp () {
        artwork1 = new Artwork("The Scream", "Edvard Munch", 2000, "Yes");
        customer = new Customer("James", 3000);
        gallery = new Gallery("Tate", 10000);
    }

    @Test
    void takesMoney() {
        gallery.addArtwork(artwork1);
        customer.buyArt(artwork1, gallery);
        assertEquals(1000, customer.getWallet());
    }

    @Test
    void givesMoney() {
        gallery.addArtwork(artwork1);
        customer.buyArt(artwork1, gallery);
        assertEquals(12000, gallery.getTill());
    }
}


class GalleryTest {

    @Test
    void getTill() {
    }

    @Test
    void setTill() {
    }
}

