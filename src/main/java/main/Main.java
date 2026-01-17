package main;

import modell.Elelmiszer;
import modell.ElelmiszerkezdoIdo;
import modell.Konzerv;
import modell.Raktar;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Raktar raktar = new Raktar();
        Scanner sc = new Scanner(System.in);

        System.out.println("raktar alkalmazas");

        boolean fut = true;
        while (fut) {
            System.out.println("1. elelmiszer felvetel");
            System.out.println("2. konzerv felvetel");
            System.out.println("3. raktar lista");
            System.out.println("4. kilepes");
            System.out.println("valassz menut:");


            String valasztas = sc.nextLine();

            switch (valasztas) {
                case "1":
                    try {
                        System.out.println("elelmiszer nev:");
                        String nev = sc.nextLine();
                        System.out.println("gyarto");
                        String gyarto = sc.nextLine();
                        System.out.println("lejarati datum:");
                        String datum = sc.nextLine();

                        LocalDate lejarat = datum.isEmpty() ? null : LocalDate.parse(datum);

                        ElelmiszerkezdoIdo e = new ElelmiszerkezdoIdo(nev, gyarto, lejarat);
                        raktar.felvesz(e);
                    } catch (DateTimeException ex) {
                        System.out.println("rossz datum");
                    } catch (Exception ex) {
                        System.out.println("hiba:" + ex.getMessage());
                    }
                    break;

                case "2":
                    try {
                        System.out.println("konzerv nev:");
                        String nev = sc.nextLine();
                        System.out.println("gyarto:");
                        String gyarto = sc.nextLine();
                        System.out.println("lejarati datum");
                        String datum = sc.nextLine();
                        LocalDate lejarat = datum.isEmpty() ? null : LocalDate.parse(datum);
                        System.out.println("liras:");
                        String leiras = sc.nextLine();
                        System.out.println("a recept neve");
                        String recept = sc.nextLine();
                        if (recept.isEmpty()) recept = null;

                        Konzerv k = new Konzerv(nev, gyarto, lejarat, leiras, recept);
                    }catch (DateTimeException ex) {
                        System.out.println("nem jo datum");
                    } catch (Exception ex) {
                        System.out.println("hiba:" + ex.getMessage());
                    }
                    break;

                case "3":
                    System.out.println("raktar tartalmaz:");
                    for (Elelmiszer e : raktar.getElelmiszerek()) {
                        System.out.println(e);
                    }
                    break;

                case "4":
                    System.out.println("kilepes");
                    fut = false;
                    break;

                default:
                    System.out.println("HIBA");
                    break;

            }
        }
        sc.close();
    }
}