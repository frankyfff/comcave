/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcave.college.lessons.development.heap;

import comcave.college.com.lib.CommonLib;
import comcave.college.com.utils.ProcessTimeDetection;
import java.util.HashSet;

/**
 *
 * @author RSTE203
 */
public class HeapTest
{
    /***********************************************************************************/
    /**
     * @param args 
     * 
     * Manipulate the Memory-Sizes -Xms32m -Xmx256m (VM-Options)<br>
     * <br>
     * -> Windows-Suche -> cmd <- eingeben<br>
     * -> java -X <- zeigt Informationen zu diesen Parametern<br>
     */
    /*  */ //
    public static void main(String[] args)
    {
        ProcessTimeDetection p= new ProcessTimeDetection();
        
        System.out.println(p.getFormatedReleaseTime());
        System.exit(0);
        heapTest();
    }
    /***********************************************************************************/
    private static void heapTest()
    {
        System.gc();
        System.out.println("Start:");
        CommonLib.printHeapSizeInfoInByte();

        HashSet<String> stack= new HashSet<String>();

        for(int i= 0; i < 5000; i++)
        {
            stack.add(CommonLib.getLeftPaddedString(Integer.toString(i),'0',8));
        }

        System.out.println("Stack loaded:");
        CommonLib.printHeapSizeInfoInByte();

        stack.clear();
        stack= null;

        System.gc();
        System.out.println("Stack cleared:");
        CommonLib.printHeapSizeInfoInByte();
     }
    /***********************************************************************************/
}
