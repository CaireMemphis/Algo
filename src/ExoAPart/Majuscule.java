package ExoAPart;

import java.util.Arrays;
import java.util.Scanner;

public class Majuscule {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String saisie;
        do
        {
            System.out.println("Entrez un nouvel nom:");
            saisie=sc.nextLine();
        }
        while(!saisie.contentEquals("0"));
        System.out.println("vous avez saisie 0 fin de saisie:");
        //Arrays.sort(saisie);
        for(int i=0;i<saisie.length();i++)
        {
            System.out.println(saisie);
        }

    }
/*String[] test = {"bienvenue","Welcome","thomas"};
miseEnMaj(test);

    }
    public static void miseEnMaj(String[] maj) {
        for (int i = 0; i < maj.length; i++) {
            maj[i] = maj[i].toUpperCase();
        }
    */



}