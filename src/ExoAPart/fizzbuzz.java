package ExoAPart;

public class fizzbuzz {
    static int nb = 1;

    public static void main(String[] args) {
        int rv = 0;
        do {
            String result = "...";
            if (nb % 3 == 0) {
                result = "Fizz";
            }
            if (nb % 5 == 0 && nb % 3 != 0) {
                result = "Buzz";
            }
            if (nb % 5 == 0 && nb % 3 == 0) {
                result = "FizzBuzz";
            }
            System.out.println(nb + " : " + result);
            nb += 1;
        }
        while (nb <= 50);
        System.out.println("Fin");
    }
}