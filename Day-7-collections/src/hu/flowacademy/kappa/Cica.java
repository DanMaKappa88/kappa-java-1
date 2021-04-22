package hu.flowacademy.kappa;

import java.util.Objects;

/*
2021.04.20 -
 */
public class Cica {

    public static int cicaSzamlalo;
    public static final double PI_SZAM = 3.1415;
    private int eletkor;
    private String nev;

    public Cica(int eletkor, String nev) {
        this.eletkor = eletkor;
        this.nev = nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cica)) return false;
        Cica cica = (Cica) o;
        return getEletkor() == cica.getEletkor() && getNev().equals(cica.getNev());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEletkor(), getNev());
    }

    @Override
    public String toString() {
        return "Cica{" +
                "eletkor=" + eletkor +
                ", nev='" + nev + '\'' +
                '}';
    }
}
