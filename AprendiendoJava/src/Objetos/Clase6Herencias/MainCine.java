package Objetos.Clase6Herencias;

public class MainCine {

    public static void main(String[] args) {
        Movie toyStory = new Movie();

        toyStory.setTitle("Toy Story");
        toyStory.setGenre("Family");
        toyStory.setWonOscar(true);

        Series breakinBad = new Series();
        breakinBad.setTitle("Breaking Bad");
        breakinBad.setGenre("Drama");
        breakinBad.setEpisodeDuration(50);
        breakinBad.setTotalEpisodes(12);
        breakinBad.setTotalSeasons(5);

        System.out.println(toyStory.getTitle());
        System.out.println(toyStory.toString());
        System.out.println(breakinBad.toString());

        toyStory.play();
        toyStory.pause();
        breakinBad.play();
        breakinBad.pause();
    }
}
