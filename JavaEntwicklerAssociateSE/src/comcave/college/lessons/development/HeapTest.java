/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcave.college.lessons.development;

import comcave.college.com.lib.CommonLib;
import comcave.college.com.lib.utils.ProcessTimeDetection;
import java.util.HashSet;

/**
 *
 * @author mamiri
 */
public class HeapTest {
    
    /*********************************************************************************/
    /**
     * 
     * @param args 
     * 
     *  Manipulate the Memory-Sizes Xms32m -Xmx256m (VM-Option)
     * 
     * -> Windows-Suche -> cmd <- eingeben
     * -> java -X <- zeigt Informationen zu diesen Parametern
     * 
     * 
     */
    public static void main(String[] args) 
    {
        ProcessTimeDetection p = new ProcessTimeDetection();
        System.exit(0);
        heapTest();
    }  
    /*********************************************************************************/
    
    private static void heapTest()
    {
        System.gc();
        System.out.println("Start:");
        CommonLib.printHeapSizeInfoByte();
        
        HashSet<String> stack = new HashSet<String>();
        
        for (int i = 0; i < 5000; i++) 
        {
            stack.add(CommonLib.getLeftPaddedString(Integer.toString(i), '0', 8));
        }
        
        System.out.println("Stack loaded:");
        CommonLib.printHeapSizeInfoByte();
        
        stack.clear();
        stack = null;
        
        System.gc();
        System.out.println("Stack cleared:");
        CommonLib.printHeapSizeInfoByte();
    }
    
    /*********************************************************************************/
        
}
