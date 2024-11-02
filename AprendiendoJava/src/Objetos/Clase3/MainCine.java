package Objetos.Clase3;

public class MainCine {

    public static void main(String[] args) {
        Movie toyStory = new Movie("Toy Story", "Familiar",90);

        System.out.println(toyStory.getTitle() + ", Genero: " + toyStory.getGenre());
        playMovie();
        stopMovie();

        Movie madMax = new Movie("Mad Max","Action",120);

        System.out.println(madMax.getTitle() + ", Genero: " + madMax.getGenre());
    }

    public static void playMovie(){
        for (int i = 0; i < 10; i++) {
            System.out.println("playing movie...");
        }
    }

    public static void stopMovie(){
        System.out.println("Movie stopped");
    }

}
