package ExoAPart;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
    Scanner scanChif = new Scanner(System.in);
    System.out.print(" chiffre : ");
    int count = scanChif.nextInt();
    int nbr1=0, nbr2=1, nbr3;
    System.out.print(nbr1+" "+nbr2);
    for(int i=2; i<count; ++i){
        nbr3 = nbr1 + nbr2;
        nbr1 = nbr2;
        nbr2 = nbr3;
        System.out.print(" "+nbr3);
    }
}
}

