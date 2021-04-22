package hu.flowacademy.kappa;

import java.util.*;

public class Main {

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
    }
}
