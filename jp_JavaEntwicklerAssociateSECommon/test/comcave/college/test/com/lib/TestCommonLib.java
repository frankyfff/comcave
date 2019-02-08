/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcave.college.test.com.lib;

import comcave.college.com.lib.CommonLib;
import org.junit.Test;
/**
 *
 * @author RSTE203
 */
public class TestCommonLib
{   
    /***********************************************************************************/
    @Test
    public void testLeftPaddedString()
    {
        org.junit.Assert.assertNotNull(CommonLib.getLeftPaddedString("Test",((char)9),10));
    }
    /***********************************************************************************/
}
