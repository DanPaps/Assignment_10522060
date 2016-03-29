/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;
 
import java.util.Scanner;
import java.util.Random;
public class ThreeCardMonte 
    {
        public static void main(String[]arg)
        {
            Scanner input = new Scanner(System.in);
            Random r = new Random();
            int x= 1+ r.nextInt(2);
            int y;
            System.out.printf("Which one is the ace%n##\t\t##\t\t##%n##\t\t##\t\t##%n1\t\t2\t\t3%n");
            y=input.nextInt();
           if(y==x)
           {
               if(x==1)
               {
               System.out.printf("You nailed it, you won the ace card was number %d!! %nAA\t\t##\t\t##%nAA\t\t##\t\t##%n1\t\t2\t\t3%n",x);
           }
               else if(x==2)
                   {
               System.out.printf("You nailed it, you won!,the ace card was number %d!! %n##\t\tAA\t\t##%n##\t\tAA\t\t##%n1\t\t2\t\t3%n",x);
           }
               else if(x==3)
                   {
               System.out.printf("You nailed it, you won!!, the ace card was number %d!! %##\t\t##\t\tAA%n##\t\t##\t\tAA%n1\t\t2\t\t3%n",x);
           }
           }
           else 
            {
               System.out.printf("Im Sorry, you lost %n##\t\t##\t\t##%n##\t\t##\t\t##%n1\t\t2\t\t3%n",x);
            }      
        
        }
    }
