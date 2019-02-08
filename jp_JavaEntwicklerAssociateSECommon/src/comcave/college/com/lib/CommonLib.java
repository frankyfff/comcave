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
public abstract class CommonLib extends StringCommonLib
{
    /***********************************************************************************/
    private final static int KB_FACTOR     = 1024;
    private final static int MB_FACTOR     = (KB_FACTOR * KB_FACTOR);
    public final static int DISPLAY_TYPE_KB= 1;
    public final static int DISPLAY_TYPE_MB= 2;
    /***********************************************************************************/
    /**
     * @param DISPLAY_TYPE
     * @return 
     */
    public static long getUsedMemory(int DISPLAY_TYPE)
    {
        switch(DISPLAY_TYPE)
        {
            case DISPLAY_TYPE_KB:
                return ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / KB_FACTOR);
            case DISPLAY_TYPE_MB:
                return ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / MB_FACTOR);
            default: /*Byte*/
                return (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());     
        }
    }
    /***********************************************************************************/
    /**
     * @param DISPLAY_TYPE
     * @return 
     */
    public static long getFreeMemory(int DISPLAY_TYPE)
    {
        switch(DISPLAY_TYPE)
        {
            case DISPLAY_TYPE_KB:
                return (Runtime.getRuntime().freeMemory() / KB_FACTOR);
            case DISPLAY_TYPE_MB:
                return (Runtime.getRuntime().freeMemory() / MB_FACTOR);
            default:
                return Runtime.getRuntime().freeMemory();       
        }
    }
    /**
     * @param DISPLAY_TYPE
     * @return 
     */
    public static long getTotalMemory(int DISPLAY_TYPE)
    {
        switch(DISPLAY_TYPE)
        {
            case DISPLAY_TYPE_KB:
                return (Runtime.getRuntime().totalMemory() / KB_FACTOR);
            case DISPLAY_TYPE_MB:
                return (Runtime.getRuntime().totalMemory() / MB_FACTOR);
            default:
                return Runtime.getRuntime().totalMemory();       
        }
    }
    /***********************************************************************************/
    /**
     * @param DISPLAY_TYPE
     * @return 
     */
    public static long getMaxMemory(int DISPLAY_TYPE)
    {       
        switch(DISPLAY_TYPE)
        {
            case DISPLAY_TYPE_KB:
                return (Runtime.getRuntime().maxMemory() / KB_FACTOR);
            case DISPLAY_TYPE_MB:
                return (Runtime.getRuntime().maxMemory() / MB_FACTOR);
            default:
                return Runtime.getRuntime().maxMemory();       
        }
    }
    /***********************************************************************************/
    private static String DISPLAY_TYPE_AS_STRING;
    /***********************************************************************************/
    /**
     * @param DISPLAY_TYPE 
     */
    public static void printHeapSizeInfo(int DISPLAY_TYPE)
    {
        DISPLAY_TYPE_AS_STRING= ((DISPLAY_TYPE == DISPLAY_TYPE_KB) ? " KByte" : ((DISPLAY_TYPE == DISPLAY_TYPE_MB) ? " MByte" : " Byte"));
        
        String usedMem  = Long.toString(getUsedMemory(DISPLAY_TYPE));
        String freeMem  = Long.toString(getFreeMemory(DISPLAY_TYPE));
        String totalMem = Long.toString(getTotalMemory(DISPLAY_TYPE));
        String maxMem   = Long.toString(getMaxMemory(DISPLAY_TYPE));
        
        int maxStrLength= usedMem.length();
        maxStrLength    = ((freeMem.length() > maxStrLength) ? freeMem.length() : maxStrLength);
        maxStrLength    = ((totalMem.length() > maxStrLength) ? totalMem.length() : maxStrLength);
        maxStrLength    = ((maxMem.length() > maxStrLength) ? maxMem.length() : maxStrLength);
        
        usedMem         = getLeftPaddedString(usedMem,' ',maxStrLength);
        freeMem         = getLeftPaddedString(freeMem,' ',maxStrLength);
        totalMem        = getLeftPaddedString(totalMem,' ',maxStrLength);
        maxMem          = getLeftPaddedString(maxMem,' ',maxStrLength);
        
        System.out.println("---");
        System.out.println(new StringBuilder("Used Memory:  ").append(usedMem));
        System.out.println(new StringBuilder("Free Memory:  ").append(freeMem));
        System.out.println(new StringBuilder("Total Memory: ").append(totalMem));
        System.out.println(new StringBuilder("Max Memory:   ").append(maxMem));
        System.out.println("---");
    }
    /***********************************************************************************/
     public static void printHeapSizeInfoInByte() /*overloaded method / überladene Methode */
     {
         printHeapSizeInfo(0);
     }
    /***********************************************************************************/
     public static void printHeapSizeInfoInKByte() /*overloaded method / überladene Methode */
     {
         printHeapSizeInfo(DISPLAY_TYPE_KB);
     }
    /***********************************************************************************/
     public static void printHeapSizeInfoInMByte() /*overloaded method / überladene Methode */
     {
         printHeapSizeInfo(DISPLAY_TYPE_MB);
     }
     /***********************************************************************************/
}
