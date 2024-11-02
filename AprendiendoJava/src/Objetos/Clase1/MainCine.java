package Objetos.Clase1;

public class MainCine {

    public static void main(String[] args) {
        Movie toyStory = new Movie();
        toyStory.title = "Toy Story";
        toyStory.genre = "Family";
        toyStory.duration = 90;

        System.out.println("Titulo: " + toyStory.title + ", Genero: " + toyStory.genre);

        Movie madMax = new Movie();
    }

}
