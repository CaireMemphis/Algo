package Exo14;

import java.util.Random;
import java.util.Scanner;

public class JustePrix {
    static int prix;
    static int tentative;

    public static void main(String[] args) {

        parametres();
        trouver();
    }

    public static void trouver() {
        Scanner scan = new Scanner(System.in);
        int proposition = 0;
        for (int i = 1; i <= tentative; i++) {
            System.out.println("----------------------------------------");
            System.out.print("Proposition " + i + "/" + tentative + " : ");
            proposition = scan.nextInt();
            System.out.println();

            if (proposition < prix) {
                System.out.println("c'est plus");
            }
            if (proposition > prix) {
                System.out.println("c'est moins !");
            }
            if (proposition == prix) {
                System.out.println("C'est gagné !!!!!!!!!!!");
                System.out.println("Juste Prix : "+prix+" €");
                break;
            }
        }
        if (proposition != prix) {
            System.out.println("Essais ecoulés ... Perdu !!!");
            System.out.println("Juste Prix : "+prix+" €");
        }
    }

    public static void parametres() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("nb de tentatives ?");
        tentative = sc.nextInt();
        System.out.println("minimum ?");
        int min = sc.nextInt();
        System.out.println("maximum ?");
        int max = sc.nextInt();
        prix = min + random.nextInt(max - min);
    }
}
