package Exo6;
import java.util.Scanner;
import java.util.Scanner;
public class Calc {
    public static void Calc() {
        float un;
        float deux;
        String choix;
        int nouv;
        do {

            Scanner scanChif = new Scanner(System.in);
            System.out.println();
            System.out.print(" chiffre 1 : ");
            System.out.println();
            un = scanChif.nextFloat();

                Scanner scanNom = new Scanner(System.in);
                System.out.print("" +
                        "(+, -, * ou /) :");
                choix = scanNom.next();

            System.out.println();
            System.out.print(" Chiffre 2 : ");
            deux = scanChif.nextFloat();
            System.out.println(
            );
            switch (choix) {
                case "+": {
                    float somme = un + deux;
                    System.out.printf(un + " + " + deux);
                    System.out.printf("  =  " + somme);
                    break;
                }
                case "-": {
                    float supp = un - deux;
                    System.out.printf(un + " - " + deux);
                    System.out.printf("  =  " + supp);
                    break;
                }
                case "*": {
                    float multi = (deux * un);
                    System.out.printf(un + " * " + deux);
                    System.out.printf("  =  " + multi);
                    break;
                }
                case "/": {
                    if (un == 0 || deux == 0){
                        System.out.println("erreur : pas de division par 0");
                    }else {
                    float div = (un / deux);
                    System.out.printf(un + " / " + deux);
                    System.out.printf("  =  " + div);
                    break;}
                    }
                default:{
                    System.out.println("erreur");
                }
                }

            System.out.println();
            Scanner scanResp = new Scanner(System.in);
            System.out.print("Nouveau calcul = oui:1/non:2");
            nouv = scanResp.nextInt();
            System.out.println();
            System.out.printf("choix " + nouv);
            System.out.println();
        }while (nouv != 2);
        System.out.println();
        System.out.println("Au revoir !");
        }
    }
