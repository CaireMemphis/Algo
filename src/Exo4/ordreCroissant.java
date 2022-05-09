package Exo4;

import java.util.Scanner;

public class ordreCroissant {
    public static void ordreCroissant() {
        int nb1;
        int nb2;
        int nb3;
        Scanner scanChif = new Scanner(System.in);

        System.out.println();
        System.out.print(" chiffre 1 : ");
        nb1 = scanChif.nextInt();
        System.out.println();
        System.out.print(" chiffre 2 : ");
        nb2 = scanChif.nextInt();
        System.out.println();
        System.out.print(" chiffre 3 : ");
        nb3 = scanChif.nextInt();
        System.out.println();






if (nb1 >= nb2 && nb1 >= nb3){

    System.out.printf("[" + nb1 + " , " + nb2 + " , " + nb3 +" ]--> " +nb1);

} else if (nb2 >= nb3) {
    System.out.printf("[" + nb1 + " , " + nb2 + " , " + nb3 +" ]--> " +nb2);
} else if (nb3>=nb2) {
    System.out.printf("[" + nb1 + " , " + nb2 + " , " + nb3 +" ]--> " +nb3);
}
        {


}


    }

}
