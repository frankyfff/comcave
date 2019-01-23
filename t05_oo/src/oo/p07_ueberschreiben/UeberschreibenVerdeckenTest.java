package oo.p07_ueberschreiben;

import oo.p03_interfaces.Startable;
import oo.p03_interfaces.Waschmaschine;
import oo.p04_polymorphismus.Dozent;
import oo.p04_polymorphismus.Person;

public class UeberschreibenVerdeckenTest {

  public static void main(String[] args) {
    
    
    Person person = new Dozent();
    person.printData();

//    person.printCounter();
//    System.out.println(person.alter);
//    System.out.println(((Dozent)person).alter);
  }

}

//class Vater {
//  int instVar;
//  static int staticVar;
//  void instMethod() {}
//  static void staticMethod() {}
//}
//
//class Kind extends Vater {
//  int instVar = super.instVar * 2;
//  static int staticVar = Vater.staticVar;
//  void instMethod() {
//    super.instMethod();
//  }
//  static void staticMethod() {
//    Vater.staticMethod();
//  }
//}

//class Vater {
//  public Person getSample() {
//    return new Person();
//  }
//}
//
//class Kind extends Vater {
//
//  @Override
//  public Teilnehmer getSample() {
//    return new Teilnehmer();
//  }
//  
//}

abstract class Vater {

  public abstract Startable getSample();

}

class Kind extends Vater {

  @Override
  public Waschmaschine getSample() {
    return new Waschmaschine();
  }
  
}
