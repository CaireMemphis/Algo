package Exo15;

import java.util.ArrayList;

public class RollerCoaster {
    public static void main(String[] args) {

        int totalPlaces = 5;
        int placesAct = 0;
        int sum=0;
        int total = 0;
        ArrayList file = new ArrayList<>();
        int tours = 10;
        file.add(2);
        file.add(3);
        file.add(5);
        file.add(4);
        file.add(2);
        file.add(2);
        file.add(2);

        int get;
        int potentiel;
        System.out.println(file);
        System.out.println("----------------------");
        for (int i = 0; i < tours; i++) {
            get = (int) file.get((file.size())-1);
            do {
                    placesAct += get;
                    file.add(0,get);
                    file.remove((file.size()-1));
                    get = (int) file.get((file.size())-1);
                    potentiel = placesAct+get;

            }while (potentiel<=totalPlaces);
            total += placesAct * 1;
            System.out.println("places prises: "+ placesAct);
            placesAct = 0;
            System.out.printf(file +" : Caisse  : "+ total + " €");
            System.out.println();
            System.out.println("-----------------------------");
        }
        System.out.println("total : " + total + " €");
    }
}
