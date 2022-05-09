package Exo8;

import java.util.Scanner;

public class Star {
    public static void Star (){
    Scanner scanChif = new Scanner(System.in);
        System.out.print(" chiffre : ");
    int nb = scanChif.nextInt();
    String calcul = "";
        for (int i = 1; i <= nb; i++) {

            calcul += "*";
            System.out.println(calcul);
    }
}}
