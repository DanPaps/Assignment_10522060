/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;


import java.util.Scanner;
public class CountingMachine 
{
    public static void main(String[]arg)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the maximum number to reach");
        int y=input.nextInt();
        for(int n = 0;n<=y;n++)
        {
            System.out.println(n + " ");
        }
    }
    
}
