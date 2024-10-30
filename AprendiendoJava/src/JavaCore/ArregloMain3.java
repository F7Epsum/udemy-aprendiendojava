package JavaCore;

public class ArregloMain3 {
    public static void main(String[] args) {
        String[] movieTitleArray = new String[]{"Up","Titanic","Aladdin","Pepe el toro", "Avengers","Matrix"};

        //Lo que se hace en el ciclo for es iterar con el valor deseado "title" sobre to do el array que vemos a continuacion que es movieTitleArray
        for (String title : movieTitleArray){

            //El simbolo ! significa que no. en este caso el titulo NO contiene.
            if (!title.contains("i")){
                System.out.println(title);
            }
        }
    }
}
