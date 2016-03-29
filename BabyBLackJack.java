/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2_10522060;

import java.util.Scanner;
import java.util.Random;
public class BabyBLackJack
{
    public static void main(String[]arg)
    {
        Scanner input=new Scanner(System.in);
        Random r= new Random();
        int x=r.nextInt(20);
        int y=r.nextInt(20);
        int v=r.nextInt(20);
        int w=r.nextInt(20);
        int g=x+y;
        System.out.printf("You drew %d and %d %n The total is %d%n",x,y,g);
        int f=w+v;
        System.out.printf("the dealer drew %d and %d %n The total is %d%n",w,v,f);
        if(g>f)
        {
            System.out.printf("You WIN!!!");
        }
        else
        {
            System.out.printf("Dealer WINS!!!");
        }
        
    }
    
}
