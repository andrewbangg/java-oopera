import java.util.ArrayList;
import java.util.List;

public class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, String director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public String getMusicAuthor(){
        return musicAuthor;
    }

    @Override
    public String toString(){
        return librettoText;
    }
}