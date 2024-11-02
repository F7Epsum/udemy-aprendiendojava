package Objetos.Clase8Encapsulamiento;

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
    }
}
