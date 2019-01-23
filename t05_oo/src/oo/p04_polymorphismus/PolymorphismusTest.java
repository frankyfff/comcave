package oo.p04_polymorphismus;

import java.time.LocalDate;
import java.util.Date;
import oo.p03_interfaces.PC;
import oo.p03_interfaces.Startable;
import oo.p03_interfaces.Waschmaschine;

public class PolymorphismusTest {


  public static void main(String[] args) {
    mitUnterklassen();
//    mitInterface();
  }

  public static void mitInterface() {
    Startable st1 = new Waschmaschine();
    st1.start();

    st1 = new PC();
    st1.start();

    
    // Spez. Methoden der Objekte (nicht in der Interface definiert)
    double speed = ((PC) st1).getSpeed();
    System.out.println("Prozessorgeschwindigkeit: " + speed + " GHz");
  }

  
  
  public static void mitUnterklassen() {
    System.out.println("###############################################");
    
    // Die Variable "person" referenziert auf ein Person-Objekt
    Person person = new Person("Schmidt", "Peter");
    person.printData();

    System.out.println("###############################################");

    // Die Variable "person" referenziert auf ein Mitarbeiter-Objekt
    person = new Mitarbeiter("Meyer", "Hans", 3500); 
    person.printData(); // es wird Mitarbeiter.printData() in der Laufzeit ausgeführt !!!
    
    System.out.println("###############################################");
    
    Mitarbeiter ma = ((Mitarbeiter) person); // Casting
    ma.getGehalt();


    
  }

}
