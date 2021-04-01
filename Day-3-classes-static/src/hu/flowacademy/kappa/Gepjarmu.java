package hu.flowacademy.kappa;

public class Gepjarmu {

    private int gyartasiEv;
    protected String tipus;
    protected int kerekekSzama;

    public Gepjarmu(int gyartasiEv, String tipus, int kerekekSzama) {
        this.gyartasiEv = gyartasiEv;
        this.tipus = tipus;
        this.kerekekSzama = kerekekSzama;
    }

    public Gepjarmu() {     // Default - nem paraméteres konstruktor
        this.gyartasiEv = 2000;
        this.tipus = "Valami";
        this.kerekekSzama = 2;
    }

    public int getGyartasiEv() {
        return gyartasiEv;
    }

    public void setGyartasiEv(int gyartasiEv) {
        this.gyartasiEv = gyartasiEv;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getKerekekSzama() {
        return kerekekSzama;
    }

    public void setKerekekSzama(int kerekekSzama) {
        this.kerekekSzama = kerekekSzama;
    }

    public void kozlekedik() {
        System.out.println("Közlekedek, gépjármű vagyok");
    }

    @Override
    public String toString() {
        return "Gepjarmu{" +
                "gyartasiEv=" + gyartasiEv +
                ", tipus='" + tipus + '\'' +
                ", kerekekSzama=" + kerekekSzama +
                '}';
    }
}
