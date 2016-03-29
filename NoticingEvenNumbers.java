/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;

public class NoticingEvenNumbers 
{
    public static void main(String[] arg)
    {
        for(int i=1;i<=20;i++)
        {
            if((i%2)==0)
            {
                System.out.printf("%d<%n",i);
            }
            else
            {
            System.out.printf("%d%n",i); 
            }
        }
    }       
}
