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
                                /*Vererbung*/
public class OverrideAMethod extends OverrideMyMethod
{
    /***********************************************************************************/
    public OverrideAMethod()
    {
        super("Ja"); /*Übergeben dem Konstrutor der vererbten Klasse den Parameter-Wert "message"*/
    }
    /***********************************************************************************/
    @Override
    public void getMessage()
    {
        System.out.println(new StringBuffer("Wurde die Methode getMessage() überschrieben? ").append(this.message).append("!"));
    }
    /***********************************************************************************/
}
