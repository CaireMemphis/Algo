package Exo13;

import java.util.ArrayList;
import java.util.Collections;

public class Tri {
    public static void main(String[] args) {

        //int[] essai = {2, 5, 6, 4, 9, 6, 4, 1, 3, 7, 9, 12, 5, 14, 84,-2};
        //afficher(essai);
        //triageBulle(essai);
        //triageSelection(essai);
        //afficher(essai);

        ArrayList<Integer> essai = new ArrayList<>();
essai.add(1);
        essai.add(5);
        essai.add(-1);
        essai.add(4);
        essai.add(9);
        essai.add(3);

        System.out.println(essai);

        Collections.sort(essai);
        System.out.println(essai);






    }

    public static void triageBulle(int[] essai) {

        int taille = essai.length;
        int depla = 0;
        for (int i = 0; i < taille; i++) {
            for (int j = 1; j < (taille - i); j++) {
                if (essai[j - 1] > essai[j]) {
                    depla = essai[j - 1];
                    essai[j - 1] = essai[j];
                    essai[j] = depla;
                }
            }
        }
    }

    public static void triageSelection(int[] essai) {
        int taille = essai.length;
        int index = 0;

        for (int i = 0; i < taille - 1; i++) {
            int petit = i;
            for (int j = i + 1; j < (taille); j++) {
                if (essai[j] < essai[petit]) {
                    petit = j;
                }
            }
            int smallNb = essai[petit];
            essai[petit] = essai[i];
            essai[i] = smallNb;
        }
    }

    static void afficher(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}