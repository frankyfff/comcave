/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcave.college.lessons.development;

import comcave.college.com.lib.CommonLib;
/**
 *
 * @author RSTE203
 */
public class Start
{
    /***********************************************************************************/
    public static void main(String[] args)
    {
        CommonLib.printHeapSizeInfo(CommonLib.DISPLAY_TYPE_MB);
        
        CommonLib.getFreeMemory(CommonLib.DISPLAY_TYPE_MB);
    }
    /***********************************************************************************/
}
