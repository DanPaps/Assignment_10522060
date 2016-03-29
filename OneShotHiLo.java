/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;

import java.util.Scanner;
import java.util.Random;
public class OneShotHiLo
{
    public static void main(String[] arg)
    {
        Scanner input= new Scanner(System.in);
        Random r = new Random();
        int x = 1+ r.nextInt(99);
        int y;
        
        System.out.println("I'm thinking of a number from 1 to 100.Try guessing it ");
        y=input.nextInt();
        
        if(y>x)
        {
           System.out.printf("Your guess is too high,I was thinking of %s%n",x); 
        }
        else if(y<x)
        {
            System.out.printf("Your guess is too low,I was thinking of %s%n ",x); 
            
        }
        else 
        {
            System.out.printf("Your guess is right");
        }
    }
}
