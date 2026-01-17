package modell;

import java.io.StringReader;
import java.time.LocalDate;

public abstract class Elelmiszer {

    private String nev;
    private String gyarto;
    private LocalDate lejaratiDatum;


    public Elelmiszer(String nev, String gyarto, LocalDate lejaratiDatum) {

        this.nev = nev;
        this.gyarto = gyarto;

        if (lejaratiDatum == null) {
            this.lejaratiDatum = LocalDate.now().plusYears(1);
        } else if (lejaratiDatum.isAfter(LocalDate.now())) {
            this.lejaratiDatum = lejaratiDatum;
        } else {
            throw new LejartElelmiszerException();
        }
    }

    public String getNev() {
        return nev;
    }

    public String getGyarto() {
        return gyarto;
    }

    @Override
    public String toString() {
        return nev + " - " + gyarto + " (lejar:" + lejaratiDatum + ")";
    }


}
