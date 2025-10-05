

public class Theatre {
    public static void main(String[] args){
        Actor actor1 = new Actor("Андрей", "Ryzhov", "123");
        Actor actor2 = new Actor("Alex", "Yur", "124");
        Actor actor3 = new Actor("Rustam", "Say", "125");

        Director director1 = new Director("Путин", "Владимир", 11);
        Director director2 = new Director("Трамп", "Дональд", 12);

        Person musicAuthor = new Person("Мирон", "Федорович");
        Person choreographer = new Person("Никола", "Цицкаридзе");

        MusicalShow musicalShow = new MusicalShow("Простой спектакль", 3, director1.toString(), musicAuthor.toString(), "Текст Либретто для обычного шоу...\n");
        System.out.println(musicalShow);
        musicalShow.putListOfActors(actor1);
        musicalShow.putListOfActors(actor3);
        System.out.println("Актеры спектакля:");
        musicalShow.outActors();
        musicalShow.removeAndPutActorInShow(actor3,actor2);


        Opera opera = new Opera("Оперный спектакль", 2, director2.toString(), musicAuthor.toString(), "Текст Либретто для оперы...\n","24");
        System.out.println(opera);
        opera.putListOfActors(actor2);
        opera.putListOfActors(actor1);
        System.out.println("Актеры Оперного спектакля:");
        opera.outActors();
        opera.putListOfActors(actor2);

        Ballet ballet = new Ballet("Балет", 4, director2.toString(), musicAuthor.toString(), choreographer.toString(), "Текст Либретто для балета...\n");
        System.out.println(ballet);
        ballet.putListOfActors(actor2);
        ballet.putListOfActors(actor3);
        System.out.println("Актеры балета:");
        ballet.outActors();
        ballet.putListOfActors(actor1);


    }
}
