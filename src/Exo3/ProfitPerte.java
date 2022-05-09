package Exo3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProfitPerte {
    public static void ProfitPerte() {
        Scanner scanChif = new Scanner(System.in);

        int un;
        int deux;
        int benefice;


        System.out.println();

        System.out.print(" cout de production : ");

        un =scanChif.nextInt();
        System.out.println();

        System.out.print(" Prix de vente : ");
        deux = scanChif.nextInt();

        System.out.println();

        benefice = deux - un;
if (un <= 0 || deux <= 0) {
    System.out.println("erreur");
}
                  else if (benefice >= 0){
                       System.out.println("Profit de " + benefice + " €");
                   }
                   else if (benefice <= 0){
                       System.out.println("Perte de " + benefice + " €");
                   }
                   else {
                       System.out.println("opération nulle");

                   }
               }



    }

