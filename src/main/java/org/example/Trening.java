/**
 * @file Trening.java
 * @brief This file contains the definition of the Trening class, which represents a training session.
 */

package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @class Trening
 * @brief This abstract class represents a training session.
 */
public abstract class Trening {
    protected String typAktywnosci;
    protected int czasTrwania; // w minutach
    protected List<String> cwiczenia = new ArrayList<>();

    /**
     * Template method to conduct a training session.
     */
    final void przeprowadzTrening() {
        pobierzDane();
        dodajCwiczenia();
        zapiszDoDziennika();
    }

    /**
     * Abstract method to get training session details.
     */
    abstract void pobierzDane();

    /**
     * Abstract method to add exercises to the training session.
     */
    abstract void dodajCwiczenia();

    /**
     * Abstract method to save the training session to the journal.
     */
    abstract void zapiszDoDziennika();

    /**
     * Get details of the training session.
     *
     * @return A string containing details of the training session.
     */
    public String getSzczegoly() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trening: ").append(typAktywnosci).append("\n");
        sb.append("Czas trwania: ").append(czasTrwania).append(" minut\n");
        sb.append("Ćwiczenia: ");
        for (String cwiczenie : cwiczenia) {
            sb.append(cwiczenie).append(", ");
        }
        return sb.toString();
    }
}