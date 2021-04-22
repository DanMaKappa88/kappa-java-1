package hu.flowacademy.kappa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SajatLista {

    private int[] tomb;
    private int poz;

    public SajatLista(int... szamok) {
        poz = 0;
        tomb = new int[szamok.length];
        for(int szam : szamok) {
            tomb[poz++] = szam;
        }
    }

    public int[] getTomb(){
        return Arrays.copyOfRange(tomb, 0, poz);
    }

    public void add(int szam) {
        int[] ujTomb = new int[poz + 1];
        for(int i = 0; i < poz; i++) {
            ujTomb[i] = tomb[i];
        }
        tomb = ujTomb;
        tomb[poz++] = szam;
    }

    public SajatLista filter(Feltetel f) {
        SajatLista sl = new SajatLista();
        for(int i = 0; i < poz; i++) {
            if(f.vizsgal(tomb[i])) {
                sl.add(tomb[i]);
            }
        }
        return sl;
    }

    public String toString() {
        StringBuilder out = new StringBuilder("A lista elemei: ");
        for(int i = 0; i < poz; i++) {
            out.append(tomb[i] + ",");
        }
        return out.toString();
    }

}
