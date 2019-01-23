package oo.p06_verkettung;

public class Mitarbeiter {

  private String nachname;
  private String vorname;
  private Adresse adresse;

  private Kfz[] firmenwagen;

  public Mitarbeiter() {
  }

  public Mitarbeiter(String nachname, String vorname) {
    super();
    this.nachname = nachname;
    this.vorname = vorname;
  }

  public Mitarbeiter(String nachname, String vorname, Adresse adresse) {
    super();
    this.nachname = nachname;
    this.vorname = vorname;
    this.adresse = adresse;
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

  public Adresse getAdresse() {
    return adresse;
  }

  public void setAdresse(Adresse adresse) {
    this.adresse = adresse;
  }

  public double getNettoGehalt() {
    double netto = Math.sqrt(1500 * 1500);
    return netto;
  }

  public Kfz[] getFirmenwagen() {
    return firmenwagen;
  }

  public void setFirmenwagen(Kfz[] firmenwagen) {
    this.firmenwagen = firmenwagen;
  }

  @Override
  public String toString() {
    return nachname + ", " + vorname + ": " + adresse;  // adresse.toString()
  }

  
}
