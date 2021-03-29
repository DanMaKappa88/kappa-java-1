package hu.flowacademy.kappa;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Cica");
        // Készítsünk egy olyan programot, ami parancssori 
        // argumentumként számokat kap (egész), és ezeknek kiírja az átlagát
        int sum = 0;
        // for(int i = 0; i < args.length; i++) {
        //     sum += Integer.parseInt(args[i]);
        // }
        for(String s : args) {
            sum += Integer.parseInt(s);
        }
        double eredmeny = sum / (double)args.length;
        System.out.println("Átlag: " + eredmeny);
        // int a = 10000000;
        // int b = 3;
        // double eredmeny = (double)a / (double)b;        // explicit típuskonverzió
        // System.out.println(eredmeny);

        // TÖMB
        int[] tomb = new int[5];    // 1D tömb létrehozása, 5 elemet tárolhat HA primitív elemekből csináljuk, 0 vagy '' lesz az elemek
                                          // Ha objektum típusú tömböt csinálunk, akkor null-ok
        for(int i = 0; i < tomb.length; i++) {
            System.out.println(tomb[i]);
        }
        System.out.println(tomb);   // Kiírás nem működik sout-al
        // tomb[5] = 10; // A tömböt nem indexelhetjük túl
        int[][] tomb2d = new int[3][3];
        tomb2d[0][0] = 10;

        Ember mate = new Ember("Józsi", 65, true);
        mate.koszon();
        Ember kata = new Ember("Kata", 10, true);   // példányosítás
        kata.koszon();
        // kata.nev = "Feri";
        // kata.koszon();
        kata.setNev("Katalin");
        System.out.println(kata.getNev());
        kata.setKor(15);
        System.out.println(kata);
    }
}
