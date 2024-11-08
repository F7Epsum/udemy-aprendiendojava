package Objetos.Clase9Encapsulamiento2;

public class Media {

    private String title;
    private String genre;
    private int duration;

    public Media(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public void play(){
        printSomething("Playing " + title);
    }

    public void pause(){
       printSomething("Pause " + title);
    }

    private void printSomething(String something){
        System.out.println(something);
    }

    @Override
    public String toString() {
        return "Media title: " + title;
    }

    public void moveForward(int minutes){
        printSomething("Moving forward " + minutes + " minutes");

    }

}
