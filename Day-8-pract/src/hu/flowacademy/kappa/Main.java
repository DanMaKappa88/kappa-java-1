package hu.flowacademy.kappa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

class One {

}

class Two{
    byte x;
    One one;

}

public class Main {

    static Two fix(Two tt){
        tt.x = 42;
        return tt;
    }

    public static void main(String[] args) {
        // Tömb
        int[] arr = new int[10];
        // Előnye: indexek szerint kényelmesen használható
        // Hátránya: nem bővíthető
        // Listák
        List<Integer> list1 = new ArrayList<>();
        // Arraylist: tömböt használ a háttérben
        // Gyorsan elérhetőek az elemek, de a törlés, beszúrás bonyibb
        List<String> list2 = new LinkedList<>();
        // Node-okat használ a háttérben
        // Törölni, beszúrni gyorsabb
        // DE indexek szerint lassabb a hivatkozás
        // --------------------------------------------
        // Halmazok (Set)
        // Ha halmazként akarunk kezelni elemeket
        Set<Integer> set1 = new TreeSet<>();
        // Treeset: piros-fekete fát használ a háttérben
        // Lassú, de rendezetten tárolja az elemeket
        Set<Integer> set = new HashSet<>();
        // Gyorsabb, de nem rendezett
        // ---------------------------------------------
        // Map
        Map<String, List<Integer>> map = new HashMap<>();
        // Kulcs-érték párok tárolására való
        map.put("cica", new ArrayList<Integer>());
        map.get("cica").add(20);


        //Készíts egy programot, amely megszámolja a paraméterben az egyes karakterek
        //előfordulásainak számát! A megvalósításhoz használj egy String → Integer
        //leképezést
        //(HashMap<String,Integer>)!
        Map<String, Integer> karakterek = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            String szo = args[i];
            for (int j = 0; j < szo.length(); j++) {
                String c = Character.toString(szo.charAt(j));
                if(karakterek.get(c) == null) {
                    karakterek.put(c, 1);
                } else {
                    karakterek.replace(c, karakterek.get(c) + 1);
                }
            }
        }
        for(Map.Entry<String, Integer> entry : karakterek.entrySet()) {
            System.out.println("Karakter " + entry.getKey() + " darab " + entry.getValue());
        }

    }
}
