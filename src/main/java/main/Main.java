package main;

import modell.Raktar;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Raktar raktar = new Raktar();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("raktar.bin"))) {
            oos.writeObject(raktar);
            System.out.println("mentve");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
