package main;

import modell.*;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

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
        } catch (LejartElelmiszer e) {
            System.out.println(e.getMessage());
        }

        for (Elelmiszer e : raktar) {
            System.out.println(e);
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("raktar.bin"))) {
            oos.writeObject(raktar);
            System.out.println("mentve");
        } catch (IOException e) {
            e.printStackTrace();
        }

        raktar = null;

//Ide olvassuk vissza

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("raktar.bin"))) {
            Raktar beolvasottRaktar = (Raktar) ois.readObject();
            System.out.println("visszaolvasva");
            System.out.println(beolvasottRaktar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        for (Elelmiszer e : raktar) {
            System.out.println(e);
        }

    }

}
