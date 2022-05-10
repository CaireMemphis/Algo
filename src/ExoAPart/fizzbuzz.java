package ExoAPart;
import java.util.Scanner;
public class fizzbuzz {
    static int nb;
    public static void main(String[] args) {
        int rv = 0;
      do {
          Scanner scanChif = new Scanner(System.in);
          System.out.print(" chiffre : ");
          nb = scanChif.nextInt();
          controle();
      }
      while(rv == 0);
    }
    public static void controle() {
        String result = "";
        if (nb % 3 == 0) {
            result = "Fizz";
        } if (nb % 5 == 0 && nb % 3 != 0) {
            result = "Buzz";
        } if (nb % 5 == 0 && nb % 3 == 0) {
            result = "FizzBuzz";
        }
        System.out.println(result);
    }
}
