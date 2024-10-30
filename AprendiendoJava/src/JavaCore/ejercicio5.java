package JavaCore;

public class ejercicio5 {

    public static void main(String[] args) {
        String[] movieTitleArray = new String[]{"Jumanji","Toy Story", "Pulp Fiction", "Batman: El caballero de la noche","Kill Bill"};

        int maxLength = 0;
        String longestTitle = "";
        for (String title : movieTitleArray){
            //El .length esta devolviendo la longitud del String.
            int titleLength = title.length();
            if (titleLength > maxLength){
                maxLength = titleLength;
                longestTitle = title;

            }
        }
        System.out.println(longestTitle);
    }

}
