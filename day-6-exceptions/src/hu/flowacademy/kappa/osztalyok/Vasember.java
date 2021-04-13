package hu.flowacademy.kappa.osztalyok;

import hu.flowacademy.kappa.interfacek.Milliardos;

public class Vasember extends Bosszuallo implements Milliardos {

    public Vasember() {
        super(150, true);
    }

    public void kutyutKeszit() {
            double szuperero = getSzuperero();
        double novekedes = Math.random() * 10;
        setSzuperero(szuperero + novekedes);
    }

    public int getSzuperero0(Bosszuallo b) {
        int[] arr = new int[1];
        try {
//            b.isVanEGyengesege();
//            return arr[5];
        } catch (NullPointerException e) {
            System.out.println("Nullos");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index");
        } catch (Exception e) {
            System.out.println("Kivétel");
        } finally {
            System.out.println("Finally");
        }
        return 0;
    }

    public int getSzupereroThrow(Bosszuallo b) throws InterruptedException {
        Thread.sleep(2000);
        int[] arr = new int[1];
        b.isVanEGyengesege();
        return arr[5];
    }

    public boolean megmentiAVilagot() {
        return getSzuperero() > 1000;
    }

    @Override
    public String toString() {
        return "Vasember{ " + super.getSzuperero() + " " + super.isVanEGyengesege() + "}";
    }
}
