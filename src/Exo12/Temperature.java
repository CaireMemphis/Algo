package Exo12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Temperature {
    public static void main(String[] args) {
        int[] essai = {2,-1,8,5,14,-10,-5,21,-2,1};
        afficher(essai);
     celcius(essai);
    }
    public static void celcius(int [] fahrenheit){
        int tMinPlus =0;
        int tMinMoins= 0;

        for (int i = 0; i < fahrenheit.length; i++) {
            if (fahrenheit[i]>tMinPlus){
                tMinPlus = fahrenheit[i];
            }
            if (fahrenheit[i]<tMinMoins){
                tMinMoins = fahrenheit[i];
            }
        }
        for (int i = 0; i < fahrenheit.length; i++) {

            if (fahrenheit[i] <=0){

            if (fahrenheit[i] >=tMinMoins) {

                tMinMoins = fahrenheit[i];
                }
            }
            if (fahrenheit[i] >=0){

                if (fahrenheit[i] <=tMinPlus){
                    tMinPlus = fahrenheit[i];
                }
            }
        }
        int InterMoins=0;
        int InterPlus=0;
        for (int i = 0; i < tMinPlus; i++) {
            InterPlus+=1;
        }
        for (int i = 0; i > tMinMoins; i--) {
            InterMoins+=1;
        }

if (InterMoins<=InterPlus){
    System.out.println("La température la plus proche de 0°C est " + tMinMoins +"°C.");
}else {
        System.out.println("La température la plus proche de 0°C est " + tMinPlus +"°C.");
    }
}

public static void afficher(int[] essai) {
    for (int i = 0; i < essai.length; i++) {
        System.out.print(essai[i]+" ");
    }
    System.out.println();
}
}