package oo.p10_object_class;

import java.util.ArrayList;
import java.util.List;

public class EqualityTest {

  public static void main(String[] args) {
    basicTest();
    test1();
    test2();
  }

  private static void basicTest() {
    Person p1 = new Person(1, "Peter", "Schmidt", "Köln");
    Person p2 = new Person(1, "...", "...", "Dortmund");
    // ###################### Prüfung auf Gleicheit der Referenzen ######################
    System.out.println("System.identityHashCode(p1) ===> " + System.identityHashCode(p1));
    System.out.println("System.identityHashCode(p2) ===> " + System.identityHashCode(p2));
    System.out.println("(p1 == p2) ===> " + (p1 == p2));
    // ###################### Prüfung auf inhaltliche Gleicheit der Objekte ######################
    System.out.println("p1.equals(p2) ===> " + p1.equals(p2)); // Person.equals(...) basiert auf Gleichheit der id's
    // ###########################################################################################
  }
  
    private static void test2() {
    List<Person> personList = getPersonList();
    System.out.println(personList);
    // die Person mit id=30 löschen
    // ############### 1. Möglichkeit ###############
//    for (int index = 0; index < personList.size(); index++) {  
//      Person person = personList.get(index);
//      if (person.id == 30) { 
//        personList.remove(index); // index = 2 (Müller)
//        break;
//      }
//    }
//    System.out.println(personList);
    // ############### 2. Möglichkeit ###############
//    int index = personList.indexOf(new Person(30, "dummy"));
//    personList.remove(index);
//    System.out.println(personList);
    // ############### 3. Möglichkeit ###############
//    personList.remove(new Person(30, "dummy"));
//    System.out.println(personList);
    // ############### 4. Möglichkeit ###############
    personList.removeIf(p -> p.getId() == 30);
    System.out.println(personList);
    // ############### 5. Möglichkeit ###############
//    Person person = personList.stream()  // Stream<Person>
//              .filter(p -> p.id == 30)   // Stream<Person>
//              .findFirst()               // Optional<Person>
//              .get();                    // Person
//    personList.remove(person);
  }

  private static void test1() {
    Person person1 = new Person(1, "Schmidt");
    Person person2 = new Person(2, "Schmidt");
    System.out.println("(person1 == person2) ===> " + (person1 == person2));
    System.out.println("person1.equals(person2) ===> " + person1.equals(person2));
  }

  private static List<Person> getPersonList() {
    List<Person> personList = new ArrayList<>();
    personList.add(new Person(10, "Schmidt"));
    personList.add(new Person(20, "Meyer"));
    personList.add(new Person(30, "Müller"));
    personList.add(new Person(40, "Schulze"));
    return personList;
  }

}
