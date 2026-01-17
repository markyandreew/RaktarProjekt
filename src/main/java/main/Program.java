package main;

import modell.Elelmiszer;
import modell.Konzerv;
import modell.LejartElelmiszerException;
import modell.Raktar;

import java.time.LocalDate;

public class Program {

    public static void main(String[] args) {

        Raktar raktar = new Raktar();

        try {
            raktar.felvesz(new Konzerv(
                    "hagymasbab",
                    "hagymasbabgyarto",
                    LocalDate.now().plusMonths(3),
                    "baboshagyma",
                    "baboshagyma.txt"
            ));

            raktar.felvesz(new Konzerv(
                    "paradicsom",
                    "paradicsomgyarto",
                    "ez egy paradicsom konzerv"
            ));
        } catch (LejartElelmiszerException e) {
            System.out.println(e.getMessage());
        }

        for (Elelmiszer e : raktar.getElelmiszerek()) {
            System.out.println(e);
        }
    }
}