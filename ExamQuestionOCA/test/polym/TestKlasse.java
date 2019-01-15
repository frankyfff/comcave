/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polym;

/**
 *
 * @author mamiri
 */
public class TestKlasse {

    public static void main(String[] args) {
        Person person = new Mitarbeiter(1, "klaus", "meier");
        
        person.getInfo();

        person = new Mitarbeiter(222, "Max", "Mustermann");
        
        person.getInfo();
        
        person = new Teilnehmer("Java", "Peter", "Müller");

//        person = new Teilnehmer();
        person.getInfo();
  //      person.getInfo();
        
        person = new Dozent(3500, 5, "Jim", "Bo");
  
         person.getInfo();
  
  
    }

}
