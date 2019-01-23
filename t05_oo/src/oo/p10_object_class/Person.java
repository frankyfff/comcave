package oo.p10_object_class;

import java.util.Objects;

public class Person {
  private int id;
  private String vorname;
  private String nachname;
  private String wohnOrt;

  public Person() {
  }

  public Person(int id, String vorname, String nachname, String wohnOrt) {
    this.id = id;
    this.vorname = vorname;
    this.nachname = nachname;
    this.wohnOrt = wohnOrt;
  }
  public Person(int id, String nachname) {
    this.id = id;
    this.nachname = nachname;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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

  public String getWohnOrt() {
    return wohnOrt;
  }

  public void setWohnOrt(String wohnOrt) {
    this.wohnOrt = wohnOrt;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 71 * hash + this.id;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Person other = (Person) obj;
//    System.out.println(this.nachname + ".equals(" + other.nachname + ")");
    if (this.id != other.id) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return String.format("%d - %s %s - wohnhaft in %s", id, vorname, nachname, wohnOrt);
//    return "Person{" + "id=" + id + ", vorname=" + vorname + ", nachname=" + nachname + ", wohnOrt=" + wohnOrt + '}';
  }



  

  
  
}
