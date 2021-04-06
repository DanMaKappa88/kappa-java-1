package hu.flowacademy.kappa.osztalyok;

public class Tigris extends Allat {

    private boolean isKaromKint;

    public Tigris(String nev, boolean isNosteny, boolean isKaromKint) {
        super(nev, isNosteny, 4);
        this.isKaromKint = isKaromKint;
    }

    public boolean isKaromKint() {
        return isKaromKint;
    }

    public void setKaromKint(boolean karomKint) {
        isKaromKint = karomKint;
    }

    public void hangotAd() {
        System.out.println("Roar meow");
    }

    public void ugrik() {
        System.out.println("Jump roar meow");
    }
}
