/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcave.college.lessons.development.dateandtime;

import comcave.college.com.utils.ProcessTimeDetection;
/**
 *
 * @author RSTE203
 */
public class DurationTest
{
    /***********************************************************************************/
    /**
     * @param args 
     */
    public static void main(String[] args)
    {
        ProcessTimeDetection p= new ProcessTimeDetection(true);

        p.setVerbose(true);
        
        for(int i= 0; i < 20; i++)
        {
            try
            {
                Thread.sleep(200);
            }
            catch(Exception ex){}
        }
        
        System.out.println("--\nDauer: " + p.getFormatedReleaseTime());
        
        
        /*
        2019-02-07T14:34:25.049
        2019-02-07T14:34:29.056
        -----------------------
                   00:00:04.7
        */
    }
    /***********************************************************************************/
}
