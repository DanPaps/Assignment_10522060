/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;


import java.util.Scanner;
public class SafeSquarerRoot 
{
    public static void main(String[]arg)
    {
        Scanner input=new Scanner(System.in);
        int n;
        int r=0;
        System.out.println("Enter the number for its Sqaure root");
        n=input.nextInt();
        while(n>0 || n<0)
        {
           if(n<0)
           {
               System.out.println("Try again you cant find the sqaure root of a negative number ");
               n=input.nextInt();
               
           }
           else
           {
           
           Math.sqrt(n);
           System.out.println("Its square root is "+ Math.sqrt(n));
           break;
           }
     
        }
        System.out.println("You cant find the square root of a negative number ");
    }
}
