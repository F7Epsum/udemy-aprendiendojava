package JavaCore;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Como es el clima de hoy? Seleccione un numero del 1 al 5 para ver como sera el clima");
        Scanner scanner = new Scanner(System.in);
        int weather = scanner.nextInt();

        switch (weather) {
            case 1:
                System.out.println("El clima es soleado");
                break;
            case 2:
                System.out.println("El clima es nublado");
                break;
            case 3:
                System.out.println("El clima es Lluvioso");
                break;
            case 4:
                System.out.println("El clima es Tormentoso");
                break;
            case 5:
                System.out.println("El clima es nevado");
                break;
            default:
                System.out.println("Preguntale a google");

        }
    }
}
