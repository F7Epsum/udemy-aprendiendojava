package JavaCore;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserta un numero entero mayor a 0 para obtener los nuemeros pares hasta dicho numero");
        int n = scanner.nextInt();

        if (n <= 0){
            System.out.println("Inserte un numero positivo!");
        } else {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
