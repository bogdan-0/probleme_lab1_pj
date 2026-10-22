package Java.lab1_pj.ex5;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();

        int numar = random.nextInt(21);
        System.out.println("Numărul generat este: " + numar);

        boolean apartine = false;
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
    }
}