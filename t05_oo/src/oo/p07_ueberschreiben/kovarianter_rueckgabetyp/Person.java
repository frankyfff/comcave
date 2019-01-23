package oo.p07_ueberschreiben.kovarianter_rueckgabetyp;

import java.io.IOException;

import oo.p03_interfaces.Startable;

public class Person {
  protected int alter = 5;
  protected static int counter = 12;
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
  public static void printCounter() {
    System.out.println("Person:printCounter(): --> " +  12);
  }
  public void printData()  throws IOException/*checked*/{
    System.out.format("Nachname: %s, Vorname: %s.%n", nachname, vorname);
  }
  
  protected Person copy() {
    return null;
  }
  
  
  
  protected Startable getStartable() {
    return null;
  }
  
}





