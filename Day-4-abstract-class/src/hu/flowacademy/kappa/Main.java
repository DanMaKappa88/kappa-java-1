package hu.flowacademy.kappa;

import hu.flowacademy.kappa.osztalyok.*;

public class Main {

	public static void mondValamit(Allat a) {
		a.hangotAd();
	}

    public static void main(String[] args) {
//	    Allat a = new Allat("Feri", false, 2);
	    Eger e = new Eger("KissEgér", true, true);
	    Tigris t = new Tigris("Tiger", false, true);
//	    a.hangotAd();
//	    e.hangotAd();
//	    t.hangotAd();
//		mondValamit(a);
		mondValamit(e);
		mondValamit(t);
	    Allat b = new Eger("nev", false, false);
	    b.hangotAd();
		System.out.println(Eger.egerSzamlalo);
		Eger.valami();
		FeherEger.valami();
		System.out.println(b.getClass());
    }
}
