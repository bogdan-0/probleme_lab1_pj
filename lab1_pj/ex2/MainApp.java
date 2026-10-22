package Java.lab1_pj.ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String numeFisR = "Java/lab1_pj/ex2/in.txt";
        String numeFisW = "Java/lab1_pj/ex2/out.txt";
        int suma = 0;
        int numarElemente = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        try {
            Scanner scanner = new Scanner(new File(numeFisR));

            while (scanner.hasNextInt()) {
                int valoare = scanner.nextInt();
                suma += valoare;
                numarElemente++;

                if (valoare < min) {
                    min = valoare;
                }
                if (valoare > max) {
                    max = valoare;
                }
            }
            scanner.close();

            if (numarElemente == 0) {
                System.out.println("Fișierul este gol sau nu conține numere întregi valide.");
                return;
            }

            double media = (double) suma / numarElemente;

            System.out.println("Suma: " + suma);
            System.out.println("Media aritmetică: " + media);
            System.out.println("Valoarea minimă: " + min);
            System.out.println("Valoarea maximă: " + max);

            PrintStream fluxOut = new PrintStream(numeFisW);
            fluxOut.println("Suma: " + suma);
            fluxOut.println("Media aritmetică: " + media);
            fluxOut.println("Valoarea minimă: " + min);
            fluxOut.println("Valoarea maximă: " + max);
            fluxOut.close();

            System.out.println("Rezultatele au fost scrise cu succes în fișierul " + numeFisW);

        } catch (FileNotFoundException e) {
            System.out.println("Eroare: Fișierul " + numeFisR + " nu a fost găsit! Asigură-te că este plasat în directorul proiectului.");
        }
    }
}