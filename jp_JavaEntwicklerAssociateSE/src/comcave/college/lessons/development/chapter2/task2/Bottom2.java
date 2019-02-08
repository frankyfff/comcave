/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comcave.college.lessons.development.chapter2.task2;

/**
 *
 * @author RSTE203
 */
public class Bottom2 extends Top
{
    public Bottom2(String e)
    {
       super(e);
        System.out.print("D");
    }
    
    public static void main(String[] args)
    {
        new Bottom2("C");
        System.out.println(" ");
    }
    
    public static void main(int[] args)
    {
        new Bottom2("C");
        System.out.println(" ");
    }
}
