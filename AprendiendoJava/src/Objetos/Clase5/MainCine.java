package Objetos.Clase5;

public class MainCine {

    public static void main(String[] args) {
        Movie toyStory = new Movie("Toy Story", "Familiar", 90);
        Movie madMax = new Movie("Mad Max", "Action", 120);

        toyStory.playMovie();
        toyStory.pauseMovie();
        madMax.playMovie();
        madMax.pauseMovie();



        System.out.println(madMax);
    }
}
