package hu.flowacademy.kappa;

public class Ember {
  
  private String nev;   //Attributum vagy más néven adattag
  private int kor;
  private boolean szeretiACicat;
  // private Ember parja;

  public Ember (String nev, int kor, boolean szeretiACicat) {  //konstruktor
    this.nev = nev;
    this.kor = kor;
    this.szeretiACicat = szeretiACicat;
  }

  public String getNev() {  //Getter függvény
    return nev;
  }

  public void setNev(String ujNev) {  // Setter függvény
    if(ujNev.length() > 0) {
      this.nev = ujNev;
    }
  } 

  public int getKor() {
    return this.kor;
  }

  public void setKor(int kor) {
    if(kor >= this.kor) {
      this.kor = kor;
    }
  }

  public void koszon() {    //metódus létrehozása
    System.out.println("Szia, én " + nev + " vagyok");
  }

  public String toString() {  // override-oljuk a beépített toString függvényt
    return "Név: " + this.nev + " Kor: " + this.kor 
     + (this.szeretiACicat?"":" nem") + " szereti a cicát";
  }

}