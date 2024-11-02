package Objetos.Clase9Encapsulamiento2;

public class MainCine {

    public static void main(String[] args) {
        Movie toyStory = new Movie("Toy Story","Family",90);

        toyStory.setTitle("Toy Story");
        toyStory.setGenre("Family");
        toyStory.setWonOscar(true);

        Series breakinBad = new Series();
        breakinBad.setTitle("Breaking Bad");
        breakinBad.setGenre("Drama");
        breakinBad.setEpisodeDuration(50);
        breakinBad.setTotalEpisodes(12);
        breakinBad.setTotalSeasons(5);

//        System.out.println(toyStory.getTitle());
//        System.out.println(toyStory.toString());
//        System.out.println(breakinBad.toString());
//
//        toyStory.play();
//        toyStory.pause();
//        breakinBad.play();
//        breakinBad.pause();

        toyStory.moveForward(15);

        breakinBad.moveForward();

        Media media = new Media("Batman","Action",120);
        String title = media.getTitle();
        String genre = media.getGenre();
        int duration = media.getDuration();

        //Si queremos utilizar media.printSomething() no nos va a dejar porque tiene acceso privado. Pero si usamos otro metodo que si lo contenga,
        // ejemplo moveForward() si nos va a dejar utilizar lo que contiene dentro porque es public y ese metodo utiliza el otro que es printSomething()
        media.moveForward(50);
    }
}
