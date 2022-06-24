package art_gallery_lab;

import java.util.ArrayList;

public class Artist {


    private String name;
    private ArrayList<String> artworks = new ArrayList<>();

    //constructors
    public Artist(String name, ArrayList<String> artworks) {
        this.name = name;
        this.artworks = artworks;
    }


}
