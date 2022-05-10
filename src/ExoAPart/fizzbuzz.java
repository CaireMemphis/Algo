package ExoAPart;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class fizzbuzz {
    static int nb;
    public static void main(String[] args) {
       /* int rv = 0;
      do {
          Scanner scanChif = new Scanner(System.in);
          System.out.print(" chiffre : ");
          nb = scanChif.nextInt();
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
      while(rv == 0);*/

        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
