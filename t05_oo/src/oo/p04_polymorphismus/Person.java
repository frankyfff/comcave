package oo.p04_polymorphismus;

public class Person /* extends Object */{
  
  private String nachname;
  private String vorname;
  
  public Person() {
  }
  protected Person(String nachname, String vorname) {
    super();
    this.nachname = nachname;
    this.vorname = vorname;
  }
  public String getFullName() {
    return vorname + " " + nachname ;
  }
  public String getNachname() {
    return nachname;
  }
  public void setNachname(String nachname) {
    this.nachname = nachname;
  }
  public String getVorname() {
    return vorname;
  }
  public void setVorname(String vorname) {
    this.vorname = vorname;
  }
  public void printData() {
    System.out.format("Personendaten: %s %s%n", vorname, nachname);
  }
  
}
