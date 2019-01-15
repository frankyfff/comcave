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
public class Person {

    private String name;
    private String vorname;

    public Person(String name, String vorname) {
        this.name = name;
        this.vorname = vorname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void getInfo() {
        
        System.out.println("Name: "+name+" Vorname: "+vorname);
        System.out.println("getInfo() im Person");
    }

}
