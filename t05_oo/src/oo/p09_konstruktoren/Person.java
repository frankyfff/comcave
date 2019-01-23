package oo.p09_konstruktoren;

public class Person {
  private String vorname;
  private String nachname;
  int counter = 3;
// Konstruktoraufruf
//    this(...);
//    super(...);
  public Person() {
    super(); // IMPLIZIT
    System.out.println("================> Person()");
  }
  
  
  public Person(String vorname, String nachname)  {
    super(); // IMPLIZIT
    System.out.println("================> Person(String, String)");
    
  }
  
  
  
  public String getVorname() {
    return vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public String getNachname() {
    return nachname;
  }

  public void setNachname(String nachname) {
    this.nachname = nachname;
  }
  
}
