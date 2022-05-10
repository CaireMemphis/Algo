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
do{
    if (total >= 500) {
        total -= 500;
        billet500 += 1;
    }
}while (total >= 500);
        System.out.println("billet de 500 : "+ billet500);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 200) {
                total -= 200;
                billet200 += 1;
            }
        }while (total >= 200);
        System.out.println("billet de 200 : "+ billet200);
        total = Math.round(total*100.0)/100.0;


        do{
            if (total >= 100) {
                total -= 100;
                billet100 += 1;
            }
        }while (total >= 100);
        System.out.println("billet de 100 : "+ billet100);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 50) {
                total -= 50;
                billet50 += 1;
            }
        }while (total >= 50);

        System.out.println("billet de 50 : "+ billet50);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 20) {
                total -= 20;
                billet20 += 1;
            }
        }while (total >= 20);
        System.out.println("billet de 20 : "+ billet20);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 10) {
                total -= 10;
                billet10 += 1;
            }
        }while (total >= 10);
        System.out.println("billet de 10 : "+ billet10);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 5) {
                total -= 5;
                billet5 += 1;
            }
        }while (total >= 5);
        System.out.println("billet de 5 : "+ billet5);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 2) {
                total -= 2;
                piece2 += 1;
            }
        }while (total >= 2);
        System.out.println("piece de 2 : "+ piece2);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 1) {
                total -= 1;
                piece1 += 1;
            }
        }while (total >= 1);
        System.out.println("piece de 1 : "+ piece1);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 0.5) {
                total -= 0.5;
                piece05 += 1;
            }
        }while (total >= 0.5);
        System.out.println("piece de 0.5 : "+ piece05);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 0.2) {
                total -= 0.2;
                piece02 += 1;
            }
        }while (total >= 0.2);
        System.out.println("piece de 0.2 : "+ piece02);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 0.1) {
                total -= 0.1;
                piece01 += 1;
            }
        }while (total >= 0.1);
        System.out.println("piece de 0.1 : "+ piece01);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 0.05) {
                total -= 0.05;
                piece005 += 1;
            }
        }while (total >= 0.05);
        System.out.println("piece de 0.05 : "+ piece005);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 0.02) {
                total -= 0.02;
                piece002 += 1;
            }
        }while (total >= 0.02);
        System.out.println("piece de 0.02 : "+ piece002);
        total = Math.round(total*100.0)/100.0;

        do{
            if (total >= 0.01) {
                total -= 0.01;
                piece001 += 1;
            }
        }while (total >= 0.01);
        System.out.println("piece de 0.01 : "+ piece001);
        total = Math.round(total*100.0)/100.0;
        System.out.println(total);
    }

}
