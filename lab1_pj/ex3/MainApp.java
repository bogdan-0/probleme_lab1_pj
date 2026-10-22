package Java.lab1_pj.ex3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Va rugam sa introduceti un numar natural nenul (n >= 1).");
        } else {
            int numarDivizori = 0;
            System.out.print("Divizorii numarului " + n + " sunt: ");

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                    numarDivizori++;
                }
            }
            System.out.println();

            if (numarDivizori == 2) {
                System.out.println("Numarul " + n + " este numar prim.");
            } else {
                System.out.println("Numarul " + n + " NU este numar prim.");
            }
        }

        scanner.close();
    }
}