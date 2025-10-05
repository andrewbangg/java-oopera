import java.util.ArrayList;
import java.util.List;

public class Show {

    private String title;
    private int duration;
    private String director;
    private List<Actor> listOfActors = new ArrayList<>();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(List<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }


    public Show(String title, int duration, String director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void outActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor + " (Рост:" + actor.getHeight() + ")");
        }
    }


    public void putListOfActors(Actor newActor) {
        if (listOfActors.isEmpty()) {
            listOfActors.add(newActor);
        } else {
            for (Actor actor : listOfActors) {
                if (newActor.equals(actor)){
                    System.out.println("Такой актер уже участвует в спектакле: " + actor + "\n");
                    return;
                }
            }listOfActors.add(newActor);
        }
    }

    public void removeAndPutActorInShow(Actor remActor, Actor putActor){
        for (int i = 0; i <= listOfActors.size(); i++){
            if (listOfActors.get(i).equals(remActor)){
                listOfActors.remove(i);
                putListOfActors(putActor);
                return;
            }
        }
    }
}