package Objetos.Clase3;

public class Movie {

    String title;
    String genre;
    int duration;

    public String getTitle() {
        return "This is the movie: " + title;
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

    public Movie(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }
}
