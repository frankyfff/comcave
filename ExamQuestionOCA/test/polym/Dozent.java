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
public class Dozent extends Mitarbeiter {
    
    private double gehalt;

    public Dozent(double gehalt, int mnr, String name, String vorname) {
        super(mnr, name, vorname);
        this.gehalt = gehalt;
    }

    
    
    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

//    @Override
//    public void getInfo() {
//       // super.getInfo();
//        
//        System.out.println("getInfo() im Dozenten");
//    }
    
    
    
    
}
