package oo.p06_verkettung;

import java.util.Date;

public class Kfz {
  private int id;
  private int nummer;
  private String kennzeichen;
  private String hersteller; // VW
  private String modell; // Golf 5, CC
  private String kfzIdent; // VW341267068777
  private Date   erstZulassung;
  private Date   baujahr;
  private int   hubraum; // 1996 cm³
//  private Motor motor;
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getNummer() {
    return nummer;
  }

  public void setNummer(int nummer) {
    this.nummer = nummer;
  }

  public String getKennzeichen() {
    return kennzeichen;
  }

  public void setKennzeichen(String kennzeichen) {
    this.kennzeichen = kennzeichen;
  }

  public String getHersteller() {
    return hersteller;
  }

  public void setHersteller(String hersteller) {
    this.hersteller = hersteller;
  }

  public String getModell() {
    return modell;
  }

  public void setModell(String modell) {
    this.modell = modell;
  }

  public String getKfzIdent() {
    return kfzIdent;
  }

  public void setKfzIdent(String kfzIdent) {
    this.kfzIdent = kfzIdent;
  }

  public Date getErstZulassung() {
    return erstZulassung;
  }

  public void setErstZulassung(Date erstZulassung) {
    this.erstZulassung = erstZulassung;
  }

  public Date getBaujahr() {
    return baujahr;
  }

  public void setBaujahr(Date baujahr) {
    this.baujahr = baujahr;
  }

  public int getHubraum() {
    return hubraum;
  }

  public void setHubraum(int hubraum) {
    this.hubraum = hubraum;
  }
  
  
}
