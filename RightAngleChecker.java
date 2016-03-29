/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;

import java.util.Scanner;
public class RightAngleChecker 
{
    public static void main(String[]arg)
    {
        Scanner input=new Scanner(System.in);
        int side1;
        int side2;
        int side3;
        System.out.println("Side1:");
        side1=input.nextInt();
         System.out.println("Side2:");
        side2=input.nextInt();
         System.out.println("Side3:");
        side3=input.nextInt();
        while(side1!= 0 || side2!=0 ||side3!=0 )
        {
            if(side1>side2)
            {
           System.out.printf("%d is greater than %d, so it cannot be a right angle triangle%n",side1,side2);
           break;
            }
            else  if(side1>side3)
            {
           System.out.printf("%d is greater than %d,so it cannot be a right angle triangle%n",side1,side3);
           break;
            }
            else if(side2>side3)
            {
           System.out.printf("%d is greater than %d,so it cannot be a right angle triangle%n",side2,side3);
           break;
            }
            else if(side1<side2 && side1<side3 && side2<side3)
        {
           System.out.printf("Your inputs are %d, %d and %d%n These do  form a right angle triangle%n",side1,side2,side3); 
           break;
           
        }
            if(side1==side2 || side1==side3 || side2==side3 )
            {
           System.out.printf("Your inputs are %d, %d and %d%n These do not form a right angle triangle%n",side1,side2,side3);
           break;
            }
           
        }
       
    }
}
