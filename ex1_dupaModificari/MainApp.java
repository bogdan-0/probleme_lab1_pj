package ex1;

import java.util.Scanner;

//facem clasa dreptunghi, cu constructor, variabile membre private lungime latime si metodele get perimetru get arie
public class MainApp {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti lungimea dreptunghiului: ");
        int lungime = scanner.nextInt();

        System.out.print("Introduceti latimea dreptunghiului: ");
        int latime = scanner.nextInt();

        int perimetru = 2 * (lungime + latime);
        int arie = lungime * latime;

        System.out.println("Perimetrul dreptunghiului este: " + perimetru);
        System.out.println("Aria dreptunghiului este: " + arie);

        scanner.close();
    */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduceti lungimea: ");
            int lungime = scanner.nextInt();

            System.out.print("Introduceti latimea: ");
            int latime = scanner.nextInt();

            Dreptunghi dreptunghi = new Dreptunghi(lungime, latime);

            System.out.println("Perimetrul este: " + dreptunghi.perimetru());
            System.out.println("Aria este: " + dreptunghi.arie());

            scanner.close();
        }

}