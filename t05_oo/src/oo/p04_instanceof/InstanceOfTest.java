package oo.p04_instanceof;

public class InstanceOfTest {

  public static void main(String[] args) {
//    Object var = new Person();
//    Object var = new Teilnehmer();
//    Object var = new Mitarbeiter();
//    Person myPerson = null;
    
    Object var = new Dozent();
    System.out.println("myPerson instanceof Person           ===> " + (var instanceof Person)); // true
    System.out.println("myPerson instanceof Teilnehmer       ===> " + (var instanceof Teilnehmer)); // false
    System.out.println("myPerson instanceof Mitarbeiter      ===> " + (var instanceof Mitarbeiter)); // true
    System.out.println("myPerson instanceof Dozent           ===> " + (var instanceof Dozent)); // true
    System.out.println("myPerson instanceof Object           ===> " + (var instanceof Object)); // true
    System.out.println("myPerson instanceof Motivationsfähig ===> " + (var instanceof Motivationsfähig)); // true
  }
  
}
