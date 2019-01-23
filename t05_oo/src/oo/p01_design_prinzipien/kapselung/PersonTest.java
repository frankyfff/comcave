package oo.p01_design_prinzipien.kapselung;

public class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person();
//    p1.nachname = "#+-*"; // NICHT möglich, da nachname "private" ist
    p1.setNachname("Schmidt");
  }
}
