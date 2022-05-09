package Exo2;

import java.util.Scanner;

public class Somme {
    int une;
    int deuxe;

    public static void Additionner_2_elements (){


        Scanner scanChif = new Scanner(System.in);
        int un;
        int deux;
        int somme;


        System.out.println();

        System.out.print(" chiffre 1 : ");

        un = scanChif.nextInt();
        System.out.println();

        System.out.print(" Chiffre 2 : ");
        deux = scanChif.nextInt();

        System.out.println();

        somme = un + deux;

        System.out.printf(un + " + " + deux);
        System.out.printf("  =  " + somme);

        System.out.println();


    }


}
