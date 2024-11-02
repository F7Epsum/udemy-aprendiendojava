package Objetos.Clase2;

public class Movie {

    String title;
    String genre;
    int duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = "This is the movie: " + title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
