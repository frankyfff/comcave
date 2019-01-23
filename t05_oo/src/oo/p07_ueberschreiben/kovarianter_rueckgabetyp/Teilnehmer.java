package oo.p07_ueberschreiben.kovarianter_rueckgabetyp;

import java.util.Date;

import oo.p03_interfaces.PC;
import oo.p03_interfaces.Startable;
import oo.p03_interfaces.p01_hierarchy.TurboStartable;
import oo.p03_interfaces.Waschmaschine;

public class Teilnehmer extends Person {
  
  private Date startDatum;
  private String massnahmenNummer;
  
  public Teilnehmer() {
  }
  public Teilnehmer(String nachname, String vorname) {
    super(nachname, vorname);
  }
  
  public Teilnehmer(String nachname, String vorname, Date startDatum, String massnahmenNummer) {
    super(nachname, vorname);
    this.startDatum = startDatum;
    this.massnahmenNummer = massnahmenNummer;
  }
  
  public Date getStartDatum() {
    return startDatum;
  }
  public void setStartDatum(Date startDatum) {
    this.startDatum = startDatum;
  }
  public String getMassnahmenNummer() {
    return massnahmenNummer;
  }
  public void setMassnahmenNummer(String massnahmenNummer) {
    this.massnahmenNummer = massnahmenNummer;
  }

  public void printData() {
    System.out.println("################ Teilnehmerdaten ################");
    //super.printData();
    System.out.format("Maßnahmennummer: %s. Startdatum: %s%n", massnahmenNummer, startDatum);
  }
  @Override
  protected Teilnehmer copy() {
    return null;
  }
  
//  @Override
//  protected Startable getStartable(int typ) {
//    if (typ == 1)
//      return new PC();
//    else if (typ == 2)
//      return new Waschmaschine();
//    else       
//    return null;
//  }
//  @Override
//  protected PC getStartable(int typ) {
//    return null;
//  }
//  @Override
//  protected Waschmaschine getStartable() {
//    return new Waschmaschine();
//  }
  @Override
  protected TurboStartable getStartable() {
    return null;
  }
}

