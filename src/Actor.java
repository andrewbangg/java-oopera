import java.util.Objects;

public class Actor extends Person {
    private String height;


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Actor(String name, String surname, String height) {
        super(name, surname);
        this.height = height;

    }

    @Override
    public String toString() {
        return getName() + " " + getSurname();
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return Objects.equals(getName(), actor.getName()) &&
                Objects.equals(getSurname(), actor.getSurname()) &&
                Objects.equals(height, actor.height);

    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }

}