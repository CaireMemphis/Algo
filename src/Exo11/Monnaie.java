package Exo11;
import java.util.Scanner;
public class Monnaie {
    public static void main(String[] args) {
        money();
    }
    public static void money(){
        int billet500=0;
        int billet200=0;
        int billet100=0;
        int billet50=0;
        int billet20=0;
        int billet10=0;
        int billet5=0;
        int piece2=0;
        int piece1=0;
        int piece05=0;
        int piece02=0;
        int piece01=0;
        int piece005=0;
        int piece002=0;
        int piece001=0;

        Scanner scanChif = new Scanner(System.in);
        System.out.print(" chiffre : ");
        double total = scanChif.nextFloat();
        total = Math.round(total*100.0)/100.0;
        System.out.println();
        System.out.println("Total à Rendre : " +total + "€");
        System.out.println();
do{
    if (total >= 500) {
        total -= 500;
        billet500 += 1;
        total = Math.round(total*100.0)/100.0;
    }
}while (total >= 500);
        if (billet500>0) { System.out.println("billet de 500 : "+ billet500);}

        do{
            if (total >= 200) {
                total -= 200;
                billet200 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 200);
        if (billet200>0) { System.out.println("billet de 200 : "+ billet200);}

        do{
            if (total >= 100) {
                total -= 100;
                billet100 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 100);
        if (billet100>0) { System.out.println("billet de 100 : "+ billet100);}

        do{
            if (total >= 50) {
                total -= 50;
                billet50 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 50);
        if (billet50>0) { System.out.println("billet de 50 : "+ billet50);}

        do{
            if (total >= 20) {
                total -= 20;
                billet20 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 20);
        if (billet20>0) { System.out.println("billet de 20 : "+ billet20);}

        do{
            if (total >= 10) {
                total -= 10;
                billet10 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 10);
        if (billet10>0) { System.out.println("billet de 10 : "+ billet10);}

        do{
            if (total >= 5) {
                total -= 5;
                billet5 += 1;
                total = Math.round(total*100.0)/100.0;

            }
        }while (total >= 5);
        if (billet5>0) { System.out.println("billet de 5 : "+ billet5);}

        do{
            if (total >= 2) {
                total -= 2;
                piece2 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 2);
        if (piece2>0) { System.out.println("piece de 2 : "+ piece2);}

        do{
            if (total >= 1) {
                total -= 1;
                piece1 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 1);
        if (piece1>0) { System.out.println("piece de 1 : "+ piece1);}

        do{
            if (total >= 0.5) {
                total -= 0.5;
                piece05 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 0.5);
        if (piece05>0) { System.out.println("piece de 0.5 : "+ piece05);}

        do{
            if (total >= 0.2) {
                total -= 0.2;
                piece02 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 0.2);
        if (piece02>0) { System.out.println("piece de 0.2 : "+ piece02);}

        do{
            if (total >= 0.1) {
                total -= 0.1;
                piece01 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 0.1);
        if (piece01>0) { System.out.println("piece de 0.1 : "+ piece01);}

        do{
            if (total >= 0.05) {
                total -= 0.05;
                piece005 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 0.05);
        if (piece005>0) { System.out.println("piece de 0.05 : "+ piece005);}

        do{
            if (total >= 0.02) {
                total -= 0.02;
                piece002 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 0.02);
        if (piece002>0) { System.out.println("piece de 0.02 : "+ piece002);}

        do{
            if (total >= 0.01) {
                total -= 0.01;
                piece001 += 1;
                total = Math.round(total*100.0)/100.0;
            }
        }while (total >= 0.01);
        if (piece001>0) { System.out.println("piece de 0.01 : "+ piece001);}

        System.out.println();
        System.out.println("Reste : " +total + "€");
    }
}