package hu.flowacademy.kappa;

import hu.flowacademy.kappa.osztalyok.Bosszuallo;
import hu.flowacademy.kappa.osztalyok.Vasember;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vasember v = new Vasember();
        try {
            v.legyoziE(null);
        } catch (CicaException e) {
            e.printStackTrace();
        }
//        System.out.println(v.getSzuperero0(null) + 1000);
//        v.legyoziE(null);
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Vége");
//        try {
//            v.getSzupereroThrow(null);
//        } catch (NullPointerException e) {
//            System.out.println("Null pointer");
//            e.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Out of bounds");
//        } catch (InterruptedException e ) {
//            System.out.println("Interrupt");
//        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(10);
        }
        for(int i : list) {
            System.out.println(i);
        }
        System.out.println(list.toString());
    }
}
