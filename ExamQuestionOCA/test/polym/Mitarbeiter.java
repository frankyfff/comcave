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
public class Mitarbeiter extends Person {

    private int mnr;

    public Mitarbeiter(int mnr, String name, String vorname) {
        super(name, vorname);
        this.mnr = mnr;
    }

    public int getNummer() {
        return mnr;
    }

    public void setNummer(int mnr) {
        this.mnr = mnr;
    }


//    public void getInfo() {
//        //super.getInfo();
//        System.out.println("Name: " + super.getName());
//        System.out.println("vorname: " + super.getVorname());
//        System.out.println("Mitarbeiternr.: " + mnr);
//        System.out.println("getInfo() im Mitarbeiter");
//    }

}
