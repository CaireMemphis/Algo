package Exo15;

import java.util.ArrayList;
import java.util.Random;

public class RollerCoaster {
    public static void main(String[] args) {

        int totalPlaces = 15;
        int placesAct = 0;
        int sum = 0;
        int total = 0;
        ArrayList file = new ArrayList<>();
        int tours = 48;
        int nbPers;
        Random rand = new Random();

        for (int i = 0; i < 35; i++) {
            nbPers = 0 + rand.nextInt(12 );
            file.add(nbPers);
        }
        int get;
        int potentiel;
        System.out.println(file);
        System.out.println("----------------------");
        for (int i = 0; i < tours; i++) {
            get = (int) file.get((file.size()) - 1);
            do {
                placesAct += get;
                file.add(0, get);
                file.remove((file.size() - 1));
                get = (int) file.get((file.size()) - 1);
                potentiel = placesAct + get;
            } while (potentiel <= totalPlaces);
            total += placesAct;
            System.out.println("places : " + placesAct + "/"+totalPlaces);
            System.out.println("apport : " + placesAct + " �");
            placesAct = 0;

            System.out.println(file);
            System.out.println(" : Caisse  : " + total + " �");
            System.out.println("-----------------------------");
        }
        System.out.println("total : " + total + " �");
    }
}
