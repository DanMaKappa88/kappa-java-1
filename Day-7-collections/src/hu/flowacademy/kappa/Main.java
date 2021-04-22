package hu.flowacademy.kappa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Predicate;


public class Main {

    public void kiir(Predicate<Integer> f) {
        int szam = (int)Math.floor(Math.random()* 100);
        if(f.test(szam)){
            System.out.println("Teljesült a feltétel");
        }
        kiir((num) -> num > 10);
    }
    public static void main(String[] args) {
//        SajatLista sl = new SajatLista(10, 20, 30,40);
//        System.out.println(sl);
//        System.out.println(sl.filter((szam -> szam > 20)));
        MyIntList ml = new MyIntList(1, 2, 3, 4);
        ml.add(100);
        ml.add(10);
        System.out.println(ml);
        System.out.println(ml.filter((num)-> num % 2 == 0));
        System.out.println(ml.filter((num)-> num > 20));
//	    if(args.length == 2) {
//	        try {
//                int a = Integer.parseInt(args[0]);
//                int b = Integer.parseInt(args[1]);
//                if(b == 0) {
//                    throw new ArithmeticException("Divide by zero");
//                }
//                double d = a / (double)b;
//                System.out.println("Eredmény: " + d);
//            } catch (NumberFormatException e) {
//                System.out.println("Nem számot adott meg!");
//            } catch (ArithmeticException e) {
//                System.out.println("Nullával való osztás");
//            }
//        } else {
//            System.out.println("Nem volt elég bemenet");
//        }
//        List<Integer> al = new ArrayList<>(10);   // gyors a lekérés, de lassabb a törlés
//        List<Integer> ll = new LinkedList<>();    // gyorsabb a törlés, de lassabb a lekérés
//        for(int i = 0; i < 1000000; i++) {
//            al.add(10);
//        }
//        long start = System.nanoTime();
//        al.set(50000, 20);
//        System.out.println("Arraylist " + (System.nanoTime() - start));
//        for(int i = 0; i < 1000000; i++) {
//            ll.add(10);
//        }
//        start = System.nanoTime();
//        ll.set(50000, 10);
//        System.out.println("Linkedlist " + (System.nanoTime() - start));
//        Set<Integer> hs = new HashSet<>();  // gyors
//        Set<Integer> ts = new TreeSet<>();  // rendezett
//        ts.add(100);
//        ts.add(11);
//        ts.add(9);
//        ts.add(15);
//        ts.add(200);
//
//        for(int i : ts) {
//            System.out.println(i);
//        }
//        String bemenet = "Mégsem támadtak meg egy pénzszállítót szerda délután az Árkádban. Ennek ellenére tettek bejelentést a rendőrségen. A Budapesti Rendőr-főkapitányság csütörtöki sajtótájékoztatóján azt közölték, hogy a kamerafelvételek átnézése és a tanúk meghallgatása után néhány órán belül kiderült, hogy a rablási kísérlet kamu volt. A pénzszállító munkatársa ugyanis bevallotta, hogy nem támadták meg,\n" +
//                "\n" +
//                "CSAK AZÉRT TALÁLTA KI A TÖRTÉNETET, MERT UNALMAS AZ ÉLETE,\n" +
//                "\n" +
//                "és az az igazság, hogy csak be akart vágódni a kollégáinál. Azt is közölték, hogy a férfi ellen eljárás indult a hatóság félrevezetése miatt. A támadás miatti nyomozást lezárták.\n" +
//                "\n" +
//                "Szerdán az Index helyszíni tudósításban számolt be róla, hogy az Árkádnál rendőrök és katonák nagy számban szállták meg a helyszínt, hatalmas volt a készültség. Utóbb kiderült, hogy késsel próbáltak meg kirabolni egy pénzszállítót az Örs vezér terénél, azonban a rendőrség csütörtöki tájékoztatása szerint mégsem támadták meg a pénzszállítót. ";
//        Map<String, Integer> ef = new HashMap<>();
//        String[] szavak = bemenet.split(" ");
//        for(String s : szavak) {
//            String szo = s.toLowerCase();
//            if(ef.containsKey(szo)) {
//                ef.replace(szo, ef.get(szo) + 1);
//            } else {
//                ef.put(szo, 1);
//            }
//        }
//        System.out.println(ef.get("az"));
//        for (Map.Entry<String, Integer> elem : ef.entrySet()) {
//            System.out.println(elem.getKey() + "\t" + elem.getValue());
//        }
//        List<Cica> cicakok = new ArrayList<>();
//        cicakok.add(new Cica(1, "Győző"));
//        cicakok.add(new Cica(5, "Feri"));
//        cicakok.add(new Cica(10, "Géza"));
//        System.out.println("Egyenlő" + (cicakok.get(1).equals(new Cica(5, "Feri"))));
//        System.out.println(cicakok.contains(new Cica(5, "Feri")));
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("cicakok.txt"));
            String line = br.readLine();
            while (line != null) {
                System.out.println("Az adott sor: " + line);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Nincsen meg e");
        } catch (IOException ex) {
            System.out.println("Hiba fájl olvasás közben");
        }
    }
}
