package hu.flowacademy.kappa;

public final class Kutya {  // Nem lehet belőle leszármazni

    private final String nev; //Addattagok A final az konstanst jelent adattagnál
    private int eletkor;
    private boolean isHim;
    private double eletero;
    private String szorszin;
    public static int kutyaSzamolo = 0;     //static adattag
    public static final double PI = 3.1415; // Valódi konstans

    public Kutya (String nev, int eletkor, boolean isHim, double eletero, String szorszin) {    // Konstruktor
        kutyaSzamolo++;
        this.nev = nev; // this kulcsszó hivatkozik az adott példányra
        this.eletero = eletero;
        this.eletkor = eletkor;
        this.isHim = isHim;
        this.szorszin = szorszin;
    }

    public String getNev() {
        return this.nev;
    }

    public int getEletkor() {
        return this.eletkor;
    }

    public boolean isHim() {
        return this.isHim;
    }

    public double getEletero() {
        return this.eletero;
    }

    public String getSzorszin() {
        return this.szorszin;
    }

//    public void setNev(String nev) {
//        this.nev = nev;
//    }

    public void setEletero(double eletero) {
        this.eletero = eletero;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public void setHim(boolean him) {
        isHim = him;
    }

    public void setSzorszin(String szorszin) {
        this.szorszin = szorszin;
    }

    public static String nullaz() {   // Osztály szintű függvények, amik csak az osztály szintű adattagokat láthatják
        kutyaSzamolo = 0;
        return "oké";
    }

    public String toString() {  // Objektum szintű függvények, amik az objektumhoz kötődnek, látják az objektum szintű adattagokat
        return "Kutya Név: " + nev + " Életkora: " + eletkor + " Életerő: " + eletero
                + " Szőre: " + szorszin + (isHim? " Hím ": " Nőstény ") + " Kutyák száma:" + kutyaSzamolo;
    }
}
