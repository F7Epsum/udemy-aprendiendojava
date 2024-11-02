package Objetos.Clase4;

public class MainCine {

    public static void main(String[] args) {
        Movie toyStory = new Movie("Toy Story", "Familiar", 90);
        Movie madMax = new Movie("Mad Max", "Action", 120);

        toyStory.playMovie();
        toyStory.pauseMovie();
        madMax.playMovie();
        madMax.pauseMovie();

        System.out.println("La duracion total de la pelicula es de: " + toyStory.getTotalFrames());
        System.out.println("La duracion total de la pelicula es de: " + madMax.getTotalFrames());

        System.out.println(madMax);
    }
}
