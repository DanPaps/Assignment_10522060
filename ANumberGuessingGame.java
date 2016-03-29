/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;


import java.util.Scanner;
import java.util.Random;
public class ANumberGuessingGame 
{
    public static void main(String[]arg)
    {
        Scanner input= new Scanner(System.in);
        Random r = new Random();
        int y;
        int x= 1 + r.nextInt(10);
        
        System.out.println("I'm thinking of a number");
        
         System.out.println("What is your guesss:");
        y=input.nextInt();
        if(x==1)
        {
           if(y==0)
           {
               System.out.printf("You are correct the answer is %d",r.nextInt(10));
           }
           else
           {
               System.out.printf("Your guess is incorrect, the answer is %d",r.nextInt(10));
           }  
             
            
        }
        
        else if(x==2)
        {
            if(y==1)
           {
               System.out.printf("You are correct the answer is %d",r.nextInt(10));
           }
           else
           {
               System.out.printf("Your guess is incorrect, the answer is %d",r.nextInt(10));
           }  
        }
            
         else if(x==3)
        {
            if(y==2)
           {
               System.out.printf("You are correct the answer is %d",r.nextInt(10));
           }
           else
           {
               System.out.printf("Your guess is incorrect, the answer is %d",r.nextInt(10));
           }  
        }
         else if(x==4)
        {
            if(y==3)
           {
               System.out.printf("You are correct the answer is %d",r.nextInt(10));
           }
           else
           {
               System.out.printf("Your guess is incorrect, the answer is %d",r.nextInt(10));
           }  
        }
         else if(x==5)
        {
            if(y==4)
           {
               System.out.printf("You are correct the answer is %d",r.nextInt(10));
           }
           else
           {
               System.out.printf("Your guess is incorrect, the answer is %d",r.nextInt(10));
           }  
        }
         else if(x==6)
        {
            if(y==5)
           {
               System.out.printf("You are correct the answer is %d",r.nextInt(10));
           }
           else
           {
               System.out.printf("Your guess is incorrect, the answer is %d",r.nextInt(10));
           }  
        }
         else if(x==7)
        {
            if(y==6)
           {
               System.out.printf("You are correct the answer is %d",r.nextInt(10));
           }
           else
           {
               System.out.printf("Your guess is incorrect, the answer is %d",r.nextInt(10));
           }  
        }
         else if(x==8)
        {
            if(y==7)
           {
               System.out.printf("You are correct the answer is %d",r.nextInt(10));
           }
           else
           {
               System.out.printf("Your guess is incorrect, the answer is %d",r.nextInt(10));
           }  
        }
         else if(x==9)
        {
            if(y==8)
           {
               System.out.printf("You are correct the answer is %d",r.nextInt(10));
           }
           else
           {
               System.out.printf("Your guess is incorrect, the answer is %d",r.nextInt(10));
           }  
        }
         else if(x==10)
        {
            if(y==9)
           {
               System.out.printf("You are correct the answer is %d",r.nextInt(10));
           }
           else
           {
               System.out.printf("Your guess is incorrect, the answer is %d",r.nextInt(10));
           }  
        }
    }
}
