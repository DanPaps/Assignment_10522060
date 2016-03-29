/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;

import java.util.Scanner;
public class KeepGuessing 
{
    public static void main(String[] arg){
    Scanner input = new Scanner (System.in);
    int n=8;
    int key;
        System.out.printf("Im thinking if a number between 1 to 10.Try guessing it %n Your Guess>");
        key=input.nextInt();
            while(n!=key)
            {
                System.out.println("That is incorrect.Guess again");
                key=input.nextInt();
            }
            System.out.printf("You are right,I was thinking of %d%n",n);
}
}