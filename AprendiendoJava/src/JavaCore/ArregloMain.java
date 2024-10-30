package JavaCore;

import java.util.Scanner;

public class ArregloMain {

    public static void main(String[] args) {
        System.out.println("Escribe el numero de episodio que quieras saber su duracion");
        Scanner scanner = new Scanner(System.in);
        int episodeIndex = scanner.nextInt();
        episodeIndex--;

        int [] episodeDurationArray = new int []{30,18,24,35,40};
        int n = episodeDurationArray.length;


        if (episodeIndex >= 0 && episodeIndex < n) {

            int episodeDuration = episodeDurationArray[episodeIndex];
            System.out.println("El epsiodio dura: " + episodeDuration + " minutos");
        }
        else {
            System.out.println("Error, la serie solo tiene" + n + " episodios");
        }
    }
}
