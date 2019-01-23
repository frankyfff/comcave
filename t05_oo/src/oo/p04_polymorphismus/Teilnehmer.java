package oo.p04_polymorphismus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import oo.p02_vererbung.Massnahme;

public class Teilnehmer extends Person {  // Person, Serializable sind Supertypen von Teilnehmer
  
  private LocalDate startDatum;
  private List<Massnahme> massnahmen;
  
  public Teilnehmer() {
  }
  public Teilnehmer(String nachname, String vorname) {
    super(nachname, vorname);
    massnahmen = new ArrayList<Massnahme>();
  }

  public Teilnehmer(String nachname, String vorname, LocalDate startDatum) {
    super(nachname, vorname);
    this.startDatum = startDatum;
  }

  
  public List<Massnahme> getMassnahmen() {
    return massnahmen;
  }

  public void setMassnahmen(List<Massnahme> massnahmen) {
    this.massnahmen = massnahmen;
  }
  
  public void add(Massnahme m) {
    // Prüfung auf null
    massnahmen.add(m);
  }
  
  public LocalDate getStartDatum() {
    return startDatum;
  }
  public void setStartDatum(LocalDate startDatum) {
    this.startDatum = startDatum;
  }
  
  @Override
  public void printData() {
    super.printData(); // Instanzmethode der Superklasse aufrufen
    System.out.format("Startdatum: %s%n", startDatum);
  }
  
}

