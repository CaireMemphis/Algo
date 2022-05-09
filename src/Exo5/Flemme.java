package Exo5;

public class Flemme {
    public static void Flemme() {

        int[] notes = {10, 14, 8, 4, 17, 14, 15,20,11,8,7,6,19,17,15,9,10,11,4,1,2,0,3,20};
        int taille = notes.length;
        for (int i = 0; i < taille; i++) {

            if (notes[i] <= 4) {
                System.out.printf(notes[i] + " : Catastrophique, il faut tout revoir");
                System.out.println();
            } else if (5 <= notes[i] && notes[i] <= 10) {
                System.out.printf(notes[i] + " : Insuffisant");
                System.out.println();
            } else if (11 <= notes[i] && notes[i] <= 14) {
                System.out.printf(notes[i] + " : Peut mieux faire");
                System.out.println();
            } else if (15 <= notes[i] && notes[i] <= 17) {
                System.out.printf(notes[i] + " : Bien");
                System.out.println();
            } else if (18 <= notes[i] && notes[i] <= 20) {
                System.out.printf(notes[i] + " : Excellent, bon travail");
                System.out.println();
            }
        }
    }
}
