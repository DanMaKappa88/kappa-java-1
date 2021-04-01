package hu.flowacademy.kappa;

public class Villamos extends Gepjarmu {

    private int feszultseg;
    private boolean hasKalauz;

    public Villamos(int gyartasiEv, String tipus, int kerekekSzama, int feszultseg, boolean hasKalauz) {
        super(gyartasiEv, tipus, kerekekSzama);
        this.feszultseg = feszultseg;
        this.hasKalauz = hasKalauz;
    }

    public void kozlekedik() {
        System.out.println("Villamosként közlekedek");
    }

}
