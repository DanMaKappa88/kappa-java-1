package hu.flowacademy.kappa;

public class Auto extends Gepjarmu {

    private boolean hasTurbo;
    private int ulesek;

    public Auto (int gyartasiEv, String tipus, int kerekekSzama, boolean hasTurbo, int ulesek) {
        super(gyartasiEv, tipus, kerekekSzama); // FONTOS, ha nincs default konstruktora az ősosztálynak
        this.hasTurbo = hasTurbo;
        this.ulesek = ulesek;
        super.kozlekedik();
    }

    public String toString() {
        return "Autó" + super.getGyartasiEv() + super.tipus + super.kerekekSzama + this.ulesek + this.hasTurbo;
    }

    public void kozlekedik() {
        System.out.println("Autóként közlekedek");
    }

}
