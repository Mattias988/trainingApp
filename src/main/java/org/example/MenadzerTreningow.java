/**
 * @file MenadzerTreningow.java
 * @brief This file contains the definition of the MenadzerTreningow class, which manages training sessions.
 */

package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @class MenadzerTreningow
 * @brief This class manages training sessions.
 */
public class MenadzerTreningow {
    private List<Trening> historiaTreningow = new ArrayList<>();

    /**
     * Add a training session and conduct it.
     * @param trening The training session to be added.
     */
    public void dodajTrening(Trening trening) {
        historiaTreningow.add(trening);
        trening.przeprowadzTrening();
    }

    /**
     * Display the history of training sessions.
     */
    public void wyswietlHistorie() {
        if (historiaTreningow.isEmpty()) {
            System.out.println("Brak zarejestrowanych treningów.");
        } else {
            System.out.println("Historia treningów:");
            for (Trening trening : historiaTreningow) {
                System.out.println(trening.getSzczegoly());
            }
        }
    }
}
