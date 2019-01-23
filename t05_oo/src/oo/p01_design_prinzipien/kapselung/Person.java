package oo.p01_design_prinzipien.kapselung;

public class Person {
  // Alle Variablen private
  // Zugriff auf Variablen mit public getter und setter-Methoden möglich erlauben.
  private String nachname; // Instanzvariable (non-static)
  private String vorname;
  
  public Person() {}
  
  public Person(String nachname, String vorname) {
    this.nachname = nachname;
    this.vorname = vorname;
  }

  // getter-Methode
  public String getNachname() {
    return nachname;
  }
  
  // setter-Methode für "nachname"
  public void setNachname(String nachname) {
    // Code vorher
    System.out.println("==========> Nachname wird gesetzt !!!!!!!!!!!!!!!!!!!!!!!!! <==========");
    // Validierung (z.B.) 
    this.nachname = nachname;
    // Code nachher
  }
  
  public String getVorname() {
    return vorname;
  }
  
//  public void setVorname(String vorname) {
//    this.vorname = vorname;
//  }
}
