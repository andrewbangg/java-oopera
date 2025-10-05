import java.util.List;

public class Ballet extends MusicalShow {

    private String choreographer;

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }

    public Ballet(String title, int duration, String director, String musicAuthor, String choreographer, String librettoText) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }


}