package Exo9;

import java.util.Scanner;

public class StarDown {
    public static void main(String[] args) {
        Downstar();
    }
    public static void Downstar(){
        Scanner scanChif = new Scanner(System.in);
        System.out.print(" chiffre : ");

        int nb = scanChif.nextInt();

        int bn = 0;

        String calcul = "";
        for (int i = 1; i <= nb; i++) {
            calcul += "*";
            System.out.println(calcul);
        }
        for (int i = nb; i > 1; i--) {
            bn += 1;
            System.out.println(calcul.substring(bn));
        }
    }
}
