package hu.flowacademy.kappa;

public class Main {

    public static void main(String[] args) {
        System.out.println(Kutya.kutyaSzamolo);
        Kutya feri = new Kutya("Feri", 5, true, 100.0, "tarka");
        Kutya geza = new Kutya("Feri", 5, true, 100.0, "tarka");
        Kutya feri2 = new Kutya("Feri", 5, true, 100.0, "tarka");
        Kutya feri3 = new Kutya("Feri", 5, true, 100.0, "tarka");
        Kutya.nullaz();
        System.out.println(feri);
        System.out.println(feri3);
        System.out.println(Kutya.kutyaSzamolo);
//        printValami();

        Gepjarmu gep = new Gepjarmu();
        Auto auto = new Auto(1993, "Ford", 4, true, 5);
        Villamos vili = new Villamos(1995, "Pesa", 16, 600, true);
        gep.kozlekedik();
        auto.kozlekedik();
        vili.kozlekedik();
    }

//    public static void printValami () {
//        System.out.println("Valami");
//    }
}
