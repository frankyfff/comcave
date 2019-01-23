package oo.p10_object_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List<Person> personList = new ArrayList<>();
    personList.add(new Person(1, "Peter", "Schmidt", "Köln"));
    personList.add(new Person(2, "Hans", "Meyer", "Dortmund"));
    personList.add(new Person(3, "Roland", "Schwarz", "Essen"));
    System.out.println(personList);
    
    
    Person dummy = new Person(2, "dummy", "DUMMY", "DummyLand");
    personList.remove(dummy); // basiert auf die equals()-Methode, um die Gleichheit zweier Objekte festzustellen.
    
    System.out.println(personList);
    
  }
}
