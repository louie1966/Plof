package nl.louie66;

import java.util.Scanner;

public class Plof {
    // Programma plof is een rekenspelletje om te leren delen
    // @author Rene de Leeuw

    public static void main(String[] args) {
        // Hier start het programma

        // Object om imput van de gebruiker te vragen
        Scanner input = new Scanner(System.in);

        // Het plofgetal (2..9) wordt steeds opnieuw gevraagd totdat het getal klopt
        int plofGetal = 1; // Waarde 1 zorgt er voor dat de loop minstens 1 keer wordt gedraaid
        while (plofGetal < 2 || plofGetal > 9) {
            input.reset(); // Reset de input streeam
            System.out.print("Wat is het \"Plof\" getal (2..9)? ");
            plofGetal = input.nextInt();
        }

        // Het maximum tot hoever doorgeteld moet worden
        // Deze moet mininaal gelijk zijn aan het plof getal
        int maximum = -1;
        while (maximum < 0) {
            input.reset(); // Reset de input streeam
            System.out.print("Tot en met welk getal moet ik tellen? ");
            maximum = input.nextInt();
        }

        // Nu getallen met een spatie of een plof met spatie afdrukken in de console
        // De plof wordt berekend waar de modulo van het plof getal op x 0 oplevert.
        for (int x = 1; x <= maximum; x++) {
            if (x % plofGetal != 0) {
                System.out.print(x);
            } else {
                System.out.print("plof");
            }
            System.out.print(" ");
        }

        // Input object sluiten
        input.close();
    }
}
