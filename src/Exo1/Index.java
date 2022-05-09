package Exo1;



import java.util.Scanner;

public class Index {
    public static void bonjour(){
        String exo;
        Scanner scanNom = new Scanner(System.in);
        System.out.print("Veuillez saisir votre nom :");
        exo = scanNom.nextLine();
        System.out.println();
        System.out.printf("Bonjour " + exo +"!");
        System.out.println();
    }



}
