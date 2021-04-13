package hu.flowacademy.kappa.osztalyok;

import hu.flowacademy.kappa.CicaException;
import hu.flowacademy.kappa.interfacek.Szuperhos;

public abstract class Bosszuallo implements Szuperhos {

    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    public double mekkoraAzEreje() {
        return szuperero;
    }

    public boolean legyoziE(Szuperhos s) throws CicaException {
        if(s == null) {
            System.out.println("HIBA");
            //throw new RuntimeException("Hiba volt");
            throw new CicaException("Rossz cica");
        }
        if(s instanceof Bosszuallo) {
            if(((Bosszuallo) s).vanEGyengesege && ((Bosszuallo) s).szuperero < this.szuperero) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public String toString() {
        return "Bosszuallo{" +
                "szuperero=" + szuperero +
                ", vanEGyengesege=" + vanEGyengesege +
                '}';
    }
}
