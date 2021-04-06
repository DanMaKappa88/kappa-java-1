package hu.flowacademy.kappa.osztalyok;

public class Eger extends Allat {

    private boolean szeretiASajtot;     // Objektum szintű adattag
    public static int egerSzamlalo = 0;     // Statikus adattag, vagy osztály szintű adattagnak

    public Eger(String nev, boolean isNosteny, boolean szeretiASajtot) {
        super(nev, isNosteny, 4);   // Ősosztály konstruktorát hívjuk !4!
        this.szeretiASajtot = szeretiASajtot;
        egerSzamlalo++;
    }

    public boolean isSzeretiASajtot() {
        return szeretiASajtot;
    }

    public void setSzeretiASajtot(boolean szeretiASajtot) {
        this.szeretiASajtot = szeretiASajtot;
    }

    public void hangotAd() {        // Objektum szintű függvény
        System.out.println("Ennyi egér van: " + egerSzamlalo);  // Minden objektum szintű függvény látja az osztály szintű adattagokat
        System.out.println("Cin cin cin");
        valami();   // Elérem a statikus függvényt az objektum szintű függvényből
    }

    public static void valami() {   // Osztály szintű vagy statikus függvény
        System.out.println("Valami" + egerSzamlalo);  // Eléri a statikus adattagot
       // hangotAd(); NEM látja az objektum szintű függvényeket, és adattagokat
//        System.out.println(szeretiASajtot);   NEM láthatjuk az objektum szintű adattagokat
    }

    public void ugrik() {
        System.out.println("Jump cin cin");
    }
}
