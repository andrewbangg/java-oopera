import java.util.ArrayList;
import java.util.List;

public class Opera extends MusicalShow {

    private String choirSize;

    public String getChoirSize() {
        return choirSize;
    }
    public void setChoirSize(String choirSize) {
        this.choirSize = choirSize;
    }

    public Opera(String title, int duration, String director, String musicAuthor, String librettoText, String choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

}