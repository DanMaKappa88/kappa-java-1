package hu.flowacademy.kappa;

public abstract class Jarmu {

    protected int sebesseg;
    private String rendszam;

    public Jarmu(int sebesseg, String rendszam) {
        this.sebesseg = sebesseg;
        this.rendszam = rendszam;
    }

    public String toString() {
        return rendszam + " - " + sebesseg + " km/h";
    }

    public abstract boolean gyorshajtottE(int korlat);
}


