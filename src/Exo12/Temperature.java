package Exo12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Temperature {
    public static void main(String[] args) {
     celcius();
    }
    public static void celcius(){
        ArrayList<Integer> fahrenheit = new ArrayList<>();
        fahrenheit.add(12);
        fahrenheit.add(25);
        fahrenheit.add(5);
        fahrenheit.add(7);
        fahrenheit.add(6);
        fahrenheit.add(-5);
        fahrenheit.add(-10);
        fahrenheit.add(27);
        fahrenheit.add(-1);
        fahrenheit.add(2);
        fahrenheit.add(-3);
        fahrenheit.add(1);

        int tMin = 0;
        int tMinPlus = (int) Collections.max(fahrenheit);
        int tMinMoins= (int) Collections.min(fahrenheit);

        for (int i = 0; i < fahrenheit.size(); i++) {
            if (fahrenheit.get(i) <=0){
            if (fahrenheit.get(i) >=tMinMoins) {
                tMinMoins = fahrenheit.get(i);
            }}
            if (fahrenheit.get(i) >=0){
                if (fahrenheit.get(i) <=tMinPlus){
                    tMinPlus = fahrenheit.get(i);
                }
            }
        }
        System.out.println(tMinMoins);
        System.out.println(tMinPlus);
        int InterMoins=0;
        int InterPlus=0;
        for (int i = 0; i < tMinPlus; i++) {
            InterPlus+=1;
        }
        for (int i = 0; i > tMinMoins; i--) {
            InterMoins+=1;
        }
        System.out.println(InterPlus);
        System.out.println(InterMoins);
if (InterMoins<=InterPlus){
    System.out.println("La température la plus proche de 0°C est " + tMinMoins +"°C.");
}else {
        System.out.println("La température la plus proche de 0°C est " + tMinPlus +"°C.");
    }
}}