public class DataTypes {

  public static void main(String[] args) {
    boolean isOk = true;  // Minden változónak kell, hogy legyen típusa! neve! és LEHET kezdőértéke
    isOk = false;
    System.out.println("Isok? " + isOk);
    char c = 'a'; // Karakter, aposztrófok közé írjuk !!!

    byte kisSzam = 5;
    short nagyobbSzam = 30000;
    int nagySzam = 900000;  // Leggyakrabban használjuk, ha egész számról van szó, és belefér
    long nagyonNagySzam = 8000000000l;  // Ha literálként adjuk meg, akkor l betű kell a végére

    float lebego = 3.7f;  // Floatnál f betű kell a literál végére
    double nagyobbLebego = 5.6; // Ő az alap, őt használjuk általában 

    nagySzam++;  // Egyoperandusú postfix operátor
    ++nagySzam;  // Egyoperandusú prefix operátor

    int eredmeny = kisSzam > 10 ? 20 : kisSzam;
    System.out.println(eredmeny);
    int a = 78;
    int b = 51;
    int eredmeny2 = a & b;
    System.out.println("ÉS " + eredmeny2);
    System.out.println("VAGY " + (a | b));

    String alma = "Alma";   // NEM primitív, hanem referencia/objektum
    Integer szam = 20;  // Wrapper class az int-hez
    System.out.println(szam.doubleValue());

  }

}