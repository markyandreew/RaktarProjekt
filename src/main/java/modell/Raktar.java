package modell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Raktar implements Iterable<Elelmiszer>  {

    private List<Elelmiszer> elelmiszerek = new ArrayList<>();

    public void felvesz(Elelmiszer e) {

    }

    public List<Elelmiszer> getElelmiszerek() {
       return Collections.unmodifiableList(elelmiszerek);
    }


    @Override
    public Iterator<Elelmiszer> iterator() {
        return elelmiszerek.iterator();
    }
}
