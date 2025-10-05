public class Person {

    private String name;
    private String surname;
    public static String gender;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

enum gender{
    MALE,
    FEMALE
}