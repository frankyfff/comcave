package oo.p07_ueberschreiben.super_aufrufe;

import java.time.LocalDate;
import oo.p04_polymorphismus.Person;
import oo.p04_polymorphismus.Teilnehmer;

public class Test {

  public static void main(String[] args) {
    Person p1 = new Teilnehmer("Schmidt", "Peter", LocalDate.now());
    p1.printData();
    
  }

}
