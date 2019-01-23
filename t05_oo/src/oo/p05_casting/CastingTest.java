package oo.p05_casting;

import oo.p04_instanceof.Dozent;
import oo.p04_instanceof.Person;
import oo.p04_instanceof.Teilnehmer;

public class CastingTest {

  public static void main(String[] args) {

    Object object1 = new Object();
    Person person1 = new Person();
    Teilnehmer teilnehmer1 = new Teilnehmer();
    Dozent dozent1 = new Dozent();
    
    // Zuweisung: Mit oder ohne Casting nur möglich wenn die Typen auf beiden Seiten kompatibel sind.
    //    stringVar = personVar; // Keine IST-Beziehung zwischen Beiden ==> COMPILER-Fehler
    //    dozent1 = teilnehmer1; // Keine IST-Beziehung zwischen Beiden ==> COMPILER-Fehler
  
    //########### Ohne Casting: supertyp = untertyp; ###########
    object1 = person1; 
    object1 = teilnehmer1;
    object1 = dozent1;
    
    person1 = teilnehmer1;
//    person1 = dozent1;
//    person1 = new Person();
    
    // ########### Mit Casting: untertyp = (Untertyp) supertyp; ###########
    teilnehmer1 = (Teilnehmer) person1; // Möglich hier eine ClassCastException !!!!!!!

  }



}
