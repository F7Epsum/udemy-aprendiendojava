package Objetos.Clase11Thread;

import java.util.Scanner;

public class MainCine {

    public static void main(String[] args) {
        Movie toyStory = new Movie("Toy Story","Family",90);
        toyStory.setWonOscar(true);
        toyStory.download();

        Series breakinBad = new Series("Breaking Bad", "Drama",50,12,5);
        Series vikings = new Series("Vikings", "Action",50,10,6);
        Series friends = new Series("Friends", "Comedy",20,22,12);

        breakinBad.setSynopsis("Un profe recluta a un vago y venden dulces azules");
        vikings.setSynopsis("Un monton de chicos buscan pleito a otros porque pinto");
        friends.setSynopsis("Un grupo de amiguis no laburan y se juntan a hablar chismes");

        printInstrucions();

        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        while (selection !=0){
            System.out.println("\n");

            if (selection == 1){
                System.out.println(breakinBad.getSynopsis());
            } else if (selection == 2) {
                System.out.println(vikings.getSynopsis());
            } else if (selection == 3) {
                System.out.println(friends.getSynopsis());
            } else {
                System.out.println("Serie invalida, selecciona de los numeros!");
            }

            System.out.println("\n");
            printInstrucions();
            selection = scanner.nextInt();
        }

        System.out.println("Muchas gracias! ");

    }
    public static void printInstrucions(){
        System.out.println("Selecciona una serie para ver su sinopsis:");
        System.out.println("1 - Breaking Bad");
        System.out.println("2 - Vikings");
        System.out.println("3 - Friends");
        System.out.println("0 - Salir");

    }

}
