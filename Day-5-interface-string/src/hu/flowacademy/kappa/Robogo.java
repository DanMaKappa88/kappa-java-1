package hu.flowacademy.kappa;

public class Robogo extends Jarmu implements KisGepjarmu, Megy{ // Az interfészeket vesszővel elválasztva az implements kulcsszó után kell megadni

    private int maxSebesseg;

    public Robogo(String rendszam, int sebesseg, int maxSebesseg) {
        super(sebesseg, rendszam);
        this.maxSebesseg = maxSebesseg;
    }

    public boolean gyorshajtottE(int korlat) {
//        if(sebesseg > korlat) return true;
//        else return false;
        return sebesseg > korlat;
    }

    public String toString() {
        System.out.println(GYORSULAS);
        return "Robogo: " + super.toString();
    }

    @Override
    public boolean haladhatItt(int sebesseg) {
        return maxSebesseg < sebesseg;
    }

    @Override
    public void menj(int x, int y) {
        System.out.println("Megyek ide: " + x + " " + y);
    }
}
