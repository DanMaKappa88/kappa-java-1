package hu.flowacademy.kappa;

public class AudiS8 extends Jarmu{

    private boolean lezerBlokkolo;

    public AudiS8(String rendszam, int sebesseg, boolean lezerBlokkolo){
        super(sebesseg, rendszam);
        this.lezerBlokkolo = lezerBlokkolo;
    }

    public boolean gyorshajtottE(int korlat) {
//        if(sebesseg < korlat) {
//            return false;
//        } else if(lezerBlokkolo) {
//            return false;
//        }
//        return true;
        return sebesseg > korlat && !lezerBlokkolo;
    }

    public String toString() {
        return "Audi: " + super.toString();
    }
}
