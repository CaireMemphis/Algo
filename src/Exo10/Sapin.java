package Exo10;

import java.util.Scanner;

public class Sapin {

    public static void sapin() {

        Scanner scanChif = new Scanner(System.in);
        System.out.print(" chiffre : ");
        int nb = scanChif.nextInt();
        String affich ="";
        for (int i = 0; i < nb; i++) {
            int nbx = (2 * i) - 1;
            int nbesp = (60 - nbx) / 2;


            for (int f = 0; f < nbesp; f++) {
                affich += " ";
            }

            for (int g = 0; g < nbx; g++) {
                affich += "*";
            }

            System.out.println(affich);
            affich = "";
        }

    }
}
