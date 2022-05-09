package Exo7;

import java.util.Scanner;

public class Somme {
    public static void SommeFacto(){
        Scanner scanChif = new Scanner(System.in);
        System.out.println();
        System.out.print(" chiffre : ");
        System.out.println();
        int nb = scanChif.nextInt();
        int result = 0;
String calcul ="0";
        for (int i = 1;i<=nb;i++){
            result += i;
            calcul = calcul +"+"+ String.valueOf(i);
        }
        System.out.println();
        System.out.printf(calcul + " =   " + result);
    }


}
