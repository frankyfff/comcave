/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcave.college.lessons.development.overriding;

/**
 *
 * @author mamiri
 */
public class OverrideMyMethod 
{
    protected String message = null;
    /********************************************************************************************/
    public OverrideMyMethod()
    {
        this.message = " Nein ";
    }
    /********************************************************************************************/
    /**
     * 
     * @param message 
     */
    public OverrideMyMethod(String message) /*Überladener Konstukrot*/
    {
        this.message = message;
    }
    /********************************************************************************************/
    public void getMessage() 
    {
        System.out.println(new StringBuffer("Wurde die Methode getMessage() überschrieben").append(this.message).append("!"));
    }
    /********************************************************************************************/
}
 