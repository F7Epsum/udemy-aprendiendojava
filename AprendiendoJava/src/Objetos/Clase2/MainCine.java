package Objetos.Clase2;

public class MainCine {

    public static void main(String[] args) {
        Movie toyStory = new Movie();
        toyStory.setTitle("Toy Story");
        toyStory.setGenre("Familiar");
        toyStory.setDuration(90);

        System.out.println(toyStory.getTitle() + ", Genero: " + toyStory.getGenre());
        playMovie();
        stopMovie();


        Movie madMax = new Movie();
        madMax.setTitle("Mad Max");
        madMax.setGenre("Accion");
        madMax.setDuration(120);

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
