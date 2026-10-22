package Java.lab1_pj.ex4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(30) + 1;
        int b = random.nextInt(30) + 1;

        System.out.println("Numerele generate aleatoriu sunt: a = " + a + " și b = " + b);

        int x = a;
        int y = b;

        while (y != 0) {
            int rest = x % y;
            x = y;
            y = rest;
        }

        int cmmdc = x;

        System.out.println("CMMDC (" + a + ", " + b + ") = " + cmmdc);
    }
}