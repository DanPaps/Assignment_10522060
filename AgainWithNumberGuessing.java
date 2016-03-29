/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;

import java.util.Scanner;

public class AgainWithNumberGuessing
{
    public static void main(String[]arg) 
    {
    Scanner input= new Scanner(System.in);
    int n=8;
    int key;
    int tries=0;
   do{
        System.out.printf("Im thinking if a number between 1 to 10.Try guessing it %n Your Guess>");
    
        
     key=input.nextInt();
   }
    while(n!=key && tries < 3);
    if(n!=key && tries < 3)
   {
            
                System.out.println("That is incorrect.Guess again");
                key=input.nextInt();
                tries++;
                 if (tries==3)
            {
                System.out.println("Im sorry you ran out of chances");
            }
    else if (n==key){
            System.out.printf("You are right,I was thinking of %d%n",n);
            }
    else 
            {
                System.out.println("Im sorry you ran out of chances");
}
    
    
}}
