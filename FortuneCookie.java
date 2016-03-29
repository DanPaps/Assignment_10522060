/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;

import java.util.Random;
public class FortuneCookie 
{
    public static void main(String[] arg)
    {
        Random r = new Random();
        Random f=new Random();
        int d= f.nextInt(20);
        int x=1+r.nextInt(5);
        
        if(x==1)
        {
         System.out.printf(" Your Fortune Cookie Says: You will find happiness with new love %n ");
         System.out.printf("%d-%d-%d-%d-%d-%d%n",f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20));
        }
        else if(x==2)
        {
         System.out.printf(" Your Fortune Cookie Says: Stay with your wife %n ");
         System.out.printf("%d-%d-%d-%d-%d-%d%n",f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20));
        }
        else if(x==3)
        {
         System.out.printf(" Your Fortune Cookie Says: Money is coming your way %n ");
         System.out.printf("%d-%d-%d-%d-%d-%d%n",f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20));
        }
        else if(x==4)
        {
         System.out.printf(" Your Fortune Cookie Says: Pursue her,first love is crazy %n ");
         System.out.printf("%d-%d-%d-%d-%d-%d%n",f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20));
        }
      else if(x==5)
        {
         System.out.printf(" Your Fortune Cookie Says: Never give up life is going to get better %n ");
         System.out.printf("%d-%d-%d-%d-%d-%d%n",f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20));
        }
       else if(x==6)
        {
         System.out.printf(" Your Fortune Cookie Says: Pray and fast this evening ");
         System.out.printf("%d-%d-%d-%d-%d-%d%n",f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20),f.nextInt(20));
        }
            
       
    }
}
