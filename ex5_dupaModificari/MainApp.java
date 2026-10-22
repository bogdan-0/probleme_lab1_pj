package ex5;

import java.util.Random;

//metoda patratelor perfecte
public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();

        int numar = random.nextInt(21);
        System.out.println("Numărul generat este: " + numar);

       /* boolean apartine = false;
        int a = 0;
        int b = 1;

        if (numar == 0 || numar == 1) {
            apartine = true;
        } else {
            int c = a + b;
            while (c <= numar) {
                if (c == numar) {
                    apartine = true;
                    break;
                }
                a = b;
                b = c;
                c = a + b;
            }
        }

        if (apartine) {
            System.out.println("Numărul " + numar + " APARȚINE șirului lui Fibonacci.");
        } else {
            System.out.println("Numărul " + numar + " NU aparține șirului lui Fibonacci.");
        }
        */

        long n2 = (long) numar * numar;
        boolean apartine = verifPatratPerfect(5 * n2 + 4) || verifPatratPerfect(5 * n2 - 4);

        if (apartine) {
            System.out.println("Numarul " + numar + " apartine sirului lui Fibonacci.");
        } else {
            System.out.println("Numarul " + numar + " nu aparține sirului lui Fibonacci.");
        }


    }
    public static boolean verifPatratPerfect(long x) {
        if (x < 0) {
            return false;
        }
        long radacina = (long) Math.sqrt(x);
        return (radacina * radacina == x);
    }
}