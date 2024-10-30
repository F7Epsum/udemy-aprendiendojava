package Metodos;

public class Metodo1 {

    public static void main(String[] args) {
        playMovie();
        stopMovie();
    }

    //Los metodos deben llevar un nombre que va a describir que es lo que va a hacer ese metodo con el codigo a ejecutar. argumentos del metodo
    //Los metodos deben hacer una sola cosa y no multiples.
    public static void playMovie(){
        for (int i = 0; i < 10; i++) {
            System.out.println("playing movie...");
        }
    }

    public static void stopMovie(){
        System.out.println("Movie stopped");
    }

}
