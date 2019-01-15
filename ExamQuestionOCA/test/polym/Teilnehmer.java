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
public class Teilnehmer extends Person {
    
    private String kurs;

    public Teilnehmer(String kurs, String name, String vorname) {
        super(name, vorname);
        this.kurs = kurs;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    @Override
    public void getInfo() {
        System.out.println("Teilnehmer");
    }
    
    
    
}
