public class Arguments {

  public static void main(String[] args) {  //Az args tömbben kapjuk az argumentumokat
    for (int i = 0; i < args.length; i++) {
      System.out.println((i + 1) + ". paraméter: " + args[i]);  // Összefűzünk mindent egy stringgé
    }
    int a = Integer.parseInt(args[0]);  // A string számmá alakítása
    int b = Integer.parseInt(args[1]);
    int eredmeny = a + b;   // Összeadás
    System.out.println(eredmeny); // Eredmény kiírása
  }

}