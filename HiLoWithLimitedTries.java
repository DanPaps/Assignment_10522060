/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;

import java.util.Random;
import java.util.Scanner;
public class HiLoWithLimitedTries 
    {
    public static void main(String[]arg)
    {
         Scanner input= new Scanner(System.in);
        Random r = new Random();
        int x = 1+ r.nextInt(99);
        int y;
        int tries=0;
        System.out.println("I'm thinking of a number from 1 to 100.Try guessing it.You have 7 guesses. ");
        while( tries<7 ){
        
        y=input.nextInt();
        
        if(y>x)
        {
           System.out.printf("Your guess is too high%n");
           tries++;
        }
        else if(y<x)
        {
            System.out.printf("Your guess is too low %n"); 
            tries++;
        }
        else 
        {
            System.out.printf("Your guess is right.I was thiking of %d%n",x);
        }
        
    }
        if(tries==7)
        {
            System.out.printf("You have used up all  of your chances.You lose.I was thinking of %d%n");
        }
    }
    
    
    }
