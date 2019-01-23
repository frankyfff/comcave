package oo;

import java.util.Date;

public class Teilnehmer extends Person {
  
  Date startDatum;
  // ....

  // Konstruktor 1
  public Teilnehmer() {
  }
  // Konstruktor 2
  public Teilnehmer(String name, String vorname) {
    super(name, vorname);
  }
  // Konstruktor 3
  public Teilnehmer(Date startDatum, String name, String vorname) {
    super(name, vorname);
    this.startDatum = startDatum;
  }
  
//  public void printData() {
//    System.out.println("Teilnehmer: " + vorname + " " + name + " - Gestartet am " + startDatum);
//  }


  


}
