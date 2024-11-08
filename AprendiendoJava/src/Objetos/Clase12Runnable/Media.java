package Objetos.Clase12Runnable;

public class Media {

    private String title;
    private String genre;
    private int duration;
    private String synopsis;

    public Media(String title, String genre, int duration) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
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

    public void download(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Downloading " + title);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(title + " Downloaded! Eres un pirata xd\n");
            }
        });

        thread.start();

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
