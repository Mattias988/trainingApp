/**
 * @file Main.java
 * @brief This file contains the definition of the Main class, which serves as the entry point for the training management application.
 */

package org.example;

import java.util.Scanner;

/**
 * @class Main
 * @brief This class contains the main method to run the training management application.
 */
public class Main {
    public static void main(String[] args) {
        MenadzerTreningow menadzer = new MenadzerTreningow();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Dodaj trening");
            System.out.println("2. Wyświetl historię treningów");
            System.out.println("3. Zakończ");
            System.out.print("Wybierz opcję: ");
            int wybor = scanner.nextInt();
            scanner.nextLine(); // Czyszczenie bufora

            if (wybor == 1) {
                Trening trening = new TreningDzienny();
                menadzer.dodajTrening(trening);
            } else if (wybor == 2) {
                menadzer.wyswietlHistorie();
            } else if (wybor == 3) {
                System.out.println("Zakończenie programu.");
                break;
            } else {
                System.out.println("Nieprawidłowy wybór, spróbuj ponownie.");
            }
        }
        scanner.close();
    }
}
