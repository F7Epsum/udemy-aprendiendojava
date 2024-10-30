package Metodos;

import java.util.Random;

public class Metodo4 {

    public static void main(String[] args) {
        String[] titleMovieArray = new String[]{"La naranja mecanica","Buscando a nemo", "Mision Imposible", "Star Wars", "Troya", "Yo Robot", "Iron Man"};

        //Al utilizar ahora un metodo que requiere de String e int debemos aclarar dentro del parentesis esos valores que queremos usar
        String title = playMovie(titleMovieArray,3);
        String title2 = playMovie(titleMovieArray);
        System.out.println(". . .");
        stopMovie(title);
        stopMovie(title2);
    }

    public static String playMovie(String[] titleMovieArray, int index){
        String title = titleMovieArray[index];

        for (int i = 0; i < 4; i++) {
            System.out.println("playing movie..." + title);
        }
        return title;
    }

    public static String playMovie(String[] titleMovieArray){
        Random random = new Random();
        int index = random.nextInt(titleMovieArray.length-1);

        String title = titleMovieArray[index];

        for (int i = 0; i < 4; i++) {
            System.out.println("playing movie..." + title);
        }
        return title;
    }

    public static void stopMovie(String title){
        if (title.isEmpty()){
            System.out.println("No movie playing");
        } else {
            System.out.println("Movie stopped: " + title);
        }
    }
}
