package oo.p09_konstruktoren;

public class Mitarbeiter extends Person {
  
  int counter = 12;
  
  
  public Mitarbeiter() {
//    super(); // IMPLIZIT
    System.out.println("================> Mitarbeiter()");
//    System.out.println(this.counter); //  Mitarbeiter.counter
//    System.out.println(super.counter); //    
    
    
  }

  public Mitarbeiter(String vorname, String nachname) {
    super(vorname, nachname);
    System.out.println("================> Mitarbeiter(String, String)");
  }
  
  
  
  
  
}
