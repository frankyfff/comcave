/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcave.college.lessons.development.overriding;

/**
 *
 * @author RSTE203
 */
public class OverrideMyMethod
{
    protected String message= "Nein"; /*Default*/
    /***********************************************************************************/
    /*Standard-Konstruktor*/
    protected OverrideMyMethod(){}
    /***********************************************************************************/
    /**
     * @param message 
     */
    protected OverrideMyMethod(String message) /*Überladener Konstruktor*/
    {
        this.message= message;
    }
   /***********************************************************************************/
    protected void getMessage()
    {
        System.out.println(new StringBuffer("Wurde die Methode getMessage() überschrieben? ").append(this.message).append("!"));
    }
    /***********************************************************************************/
}
