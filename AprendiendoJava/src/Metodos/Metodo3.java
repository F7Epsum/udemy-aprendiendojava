package Metodos;

public class Metodo3 {

    public static void main(String[] args) {
        String[] titleMovieArray = new String[]{"La naranja mecanica","Buscando a nemo", "Mision Imposible", "Star Wars", "Troya", "Yo Robot", "Iron Man"};

        //Al utilizar ahora un metodo que requiere de String e int debemos aclarar dentro del parentesis esos valores que queremos usar
        String title = playMovie(titleMovieArray,3);
        System.out.println(". . .");
        stopMovie(title);
    }

    public static String playMovie(String[] titleMovieArray, int index){
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
