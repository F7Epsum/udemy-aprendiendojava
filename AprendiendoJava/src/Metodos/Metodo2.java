package Metodos;

public class Metodo2 {

    public static void main(String[] args) {
        String[] titleMovieArray = new String[]{"La naranja mecanica","Buscando a nemo", "Mision Imposible", "Star Wars", "Troya", "Yo Robot", "Iron Man"};

        //Al utilizar ahora un metodo que requiere de String e int debemos aclarar dentro del parentesis esos valores que queremos usar
        playMovie(titleMovieArray,3);
        stopMovie();
    }

    public static void playMovie(String[] titleMovieArray, int index){
        String title = titleMovieArray[index];

        for (int i = 0; i < 4; i++) {
            System.out.println("playing movie..." + title);
        }
    }

    public static void stopMovie(){
        System.out.println("Movie stopped");
    }

}
