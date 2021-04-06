package hu.flowacademy.kappa.osztalyok;

public abstract class Allat {

    private String nev;
    private boolean isNosteny;
    private int labSzam;

    public Allat(String nev, boolean isNosteny, int labSzam) {
        this.nev = nev;
        this.isNosteny = isNosteny;
        this.labSzam = labSzam;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public boolean isNosteny() {
        return isNosteny;
    }

    public void setNosteny(boolean isNosteny) {
        this.isNosteny = isNosteny;
    }

    public int getLabSzam() {
        return labSzam;
    }

    public void setLabSzam(int labSzam) {
        this.labSzam = labSzam;
    }

    public abstract void hangotAd();

    public abstract void ugrik();

}
