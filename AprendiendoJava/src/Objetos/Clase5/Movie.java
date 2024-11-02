package Objetos.Clase5;

public class Movie {
    //final determina que sea una constante que NO SE PUEDE CAMBIAR y se escriben en SNAKE_CASE
    static final int FRAME_RESOLUTION = 60;
    static final int SECONDS_PER_MINUTE = 60;

    String title;
    String genre;
    int duration;

    public static int getTotalFrames(int duration){
        return duration * SECONDS_PER_MINUTE * FRAME_RESOLUTION;
    }

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

    public void playMovie(){
            System.out.println("Playing movie...");
    }
    public void pauseMovie(){
            System.out.println("Pause movie...");
    }



    @Override
    public String toString() {
        return "The movie is: " + title + ", and the genre is: " + genre + ", and the duration is: " + duration;
    }
}
