package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Raktar {

    private List<Elelmiszer> elelmiszerek = new ArrayList<>();

    public void felvesz(Elelmiszer e) {

    }

    public List<Elelmiszer> getElelmiszerek() {
       return Collections.unmodifiableList(elelmiszerek);
       // egy yt videóban volt, így jó összegyűjteni?
    }



}
