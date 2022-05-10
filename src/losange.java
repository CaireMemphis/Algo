import java.util.Scanner;

public class losange {
    static int nb;
    static String affich ="";
    public static void main(String[] args) {
        Scanner scanChif = new Scanner(System.in);
        System.out.print(" chiffre : ");
         nb = scanChif.nextInt();
losange();
sangelo();
    }
    public static void losange (){

        for (int i = 0; i < nb; i++) {
            int nbx = (2 * i) - 1;
            int nbesp = (60 - nbx) / 2;


            for (int f = 0; f < nbesp; f++) {
                affich += " ";
            }

            for (int g = 0; g < nbx; g++) {
                affich += "*";
            }

            System.out.println(affich);
            affich = "";
    }}
        public static void sangelo(){
        for (int i = nb; i < 0; i--) {
            int nbx = (2 * i) - 1;
            int nbesp = (60 - nbx) / 2;


            for (int f = nbesp; f < 0; f--) {
                affich += " ";
            }

            for (int g = nbx; g < 0; g--) {
                affich += "*";
            }

            System.out.println(affich);
            affich = "";
        }

}


}
