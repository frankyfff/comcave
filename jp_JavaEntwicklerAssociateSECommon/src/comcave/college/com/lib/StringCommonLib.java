/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcave.college.com.lib;

/**
 *
 * @author RSTE203
 */
public abstract class StringCommonLib
{
    /***********************************************************************************/
    /**
     * @param strValue
     * @param padChar
     * @param strLen
     * @return 
     */
    public static String getLeftPaddedString(String strValue,
                                             char padChar,
                                             int strLen)
    {
        StringBuffer retVal= new StringBuffer(((strValue != null) ? strValue : ""));
        
        while(retVal.length() < strLen)
        {   //Todo: JUnit-Test mit padChar == null ("str",((char)0),10) / ("str",null,10)
            retVal= new StringBuffer().append(padChar).append(retVal);
        }
        
        return retVal.toString();
    }
    /***********************************************************************************/
}