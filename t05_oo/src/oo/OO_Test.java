package oo;

import java.util.Date;

public class OO_Test {
  
  public static void main(String[] args) {
    Person p1 = new Person("Schmidt", "Peter");
    p1.printData();

    Teilnehmer tn1 = new Teilnehmer();
    tn1.setName("Meyer");
    tn1.setVorname("Hans");
    tn1.startDatum = new Date();
    tn1.printData();

  }
}
