package oo.p02_vererbung;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Teilnehmer extends Person {
  
  private Date startDatum;
  private List<Massnahme> massnahmen;
  
  public Teilnehmer() {
  }
  public Teilnehmer(String nachname, String vorname) {
    super(nachname, vorname);
    massnahmen = new ArrayList<Massnahme>();
  }

  public Teilnehmer(String nachname, String vorname, Date startDatum) {
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
  
  public Date getStartDatum() {
    return startDatum;
  }
  public void setStartDatum(Date startDatum) {
    this.startDatum = startDatum;
  }
  @Override
  public void printData() {
    System.out.println("################ Teilnehmerdaten ################");
    super.printData();
    System.out.format("Startdatum: %s%n", startDatum);
  }
  
}

