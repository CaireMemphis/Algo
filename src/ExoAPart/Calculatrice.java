package ExoAPart;

import java.util.Scanner;

public class Calculatrice {
    int un;
    int deux;
    String nouv = "O";

    public void affichageCalcul() {
        Scanner scanChif = new Scanner(System.in);

        /*System.out.print("Nouveau calcul = O/N");
        nouv = scanChif.next();
        System.out.printf(nouv);*/

       if (nouv == "O") {

           System.out.println();

           System.out.print(" chiffre 1 : ");

           un = scanChif.nextInt();
           System.out.println();

           System.out.print(" Chiffre 2 : ");
           deux = scanChif.nextInt();
           String choix;
           Scanner scanNom = new Scanner(System.in);
           System.out.print("selectionner l'action à faire (+, -, * ou /) :");
           choix = scanNom.next();






            switch (choix) {

                case "+": {
                    int somme = un + deux;
                    System.out.printf(un + " + " + deux);
                    System.out.printf("  =  " + somme);
                    break;
                }

                case "-": {
                    int supp = un - deux;
                    System.out.printf(un + " - " + deux);
                    System.out.printf("  =  " + supp);
                    break;

                }

                case "*": {
                    int multi = (deux * un);
                    System.out.printf(un + " * " + deux);
                    System.out.printf("  =  " + multi);
                    break;


                }

                case "/": {
                    int div = (un / deux);
                    System.out.printf(un + " / " + deux);
                    System.out.printf("  =  " + div);
                    break;

                }


            }

        }



    }
}
