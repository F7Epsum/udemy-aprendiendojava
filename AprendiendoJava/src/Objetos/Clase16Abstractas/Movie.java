package Objetos.Clase16Abstractas;

public class Movie extends Media {

    private boolean wonOscar;

    public Movie(String title, String genre, int duration) {
        super(title, genre, duration);
    }

    public boolean isWonOscar() {
        return wonOscar;
    }

    public void setWonOscar(boolean wonOscar) {
        this.wonOscar = wonOscar;
    }

    @Override
    public int getDuration() {
        return super.getDuration();
    }

    @Override
    public void play() {
        printSomething("Playing " + super.getTitle());
    }
}
