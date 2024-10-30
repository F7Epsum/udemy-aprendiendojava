package JavaCore;

public class ArregloMain2 {

    public static void main(String[] args) {

        int [] episodeDurationArray = new int []{30,18,24,35,40};
//        int n = episodeDurationArray.length;

        int seasonDuration = 0;

        //Manera 1 para completar esto pero que nos sugiere IntelliJ otra forma.
//        for (int i = 0; i < n; i++) {
//
//            //Manera para simplificar el codigo usando += :
//            //seasonDuration = seasonDuration + episodeDurationArray
//            seasonDuration += episodeDurationArray[i];

        for (int j : episodeDurationArray) {

            seasonDuration += j;
        }

        System.out.println(seasonDuration);
    }
}
