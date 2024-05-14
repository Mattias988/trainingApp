/**
 * @file TreningDzienny.java
 * @brief This file contains the definition of the TreningDzienny class, which represents a daily training session.
 */

package org.example;

import java.util.Scanner;

/**
 * @class TreningDzienny
 * @brief This class represents a daily training session.
 */
public class TreningDzienny extends Trening {
    @Override
    void pobierzDane() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj typ aktywności (np. Trening Siłowy, Cardio):");
        this.typAktywnosci = scanner.nextLine();
        System.out.println("Podaj czas trwania treningu w minutach:");
        this.czasTrwania = scanner.nextInt();
        scanner.nextLine();  // Oczyszczenie bufora
    }

    @Override
    void dodajCwiczenia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz ćwiczenia, które wykonałeś, oddzielone przecinkiem (np. przysiady, pompki):");
        String line = scanner.nextLine();
        String[] exercises = line.split(",");
        for (String exercise : exercises) {
            this.cwiczenia.add(exercise.trim());
        }
    }

    @Override
    void zapiszDoDziennika() {
        System.out.println("Zapisywanie treningu do dziennika...");
        System.out.println(getSzczegoly());
    }
}
