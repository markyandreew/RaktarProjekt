package modell;

import java.io.File;
import java.time.LocalDate;

public class Konzerv extends Elelmiszer{

    private String leiras;
    private String ezaRecept; // lehet null

    public Konzerv(String nev, String gyarto, LocalDate lejaratiDatum,
                   String leiras, String receptFajlNev) {
        super(nev, gyarto, lejaratiDatum);
        this.leiras = leiras;
        this.ezaRecept = receptFajlNev;
    }

    public Konzerv(String nev, String gyarto, String leiras) {
        super(nev, gyarto, null);
        this.leiras = leiras;
    }

    public void receptetMutat() {
        if (ezaRecept != null && new File(ezaRecept).exists()) {
        }
    }

    @Override
    public String toString() {
        return super.toString() + "konzerv:" + leiras;
    }
}
