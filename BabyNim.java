/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;


import java.util.Scanner;
public class BabyNim 
{
    public static void main(String[]arg)
    {
      Scanner input =new Scanner(System.in); 
      int A=3,B=3,C=3,n;
      String q;
      
      System.out.printf("A:%d  B:%d C:%d %n ",A,B,C);
      while(A>=0 && B>=0 && C>=0  )
              {
       System.out.printf("Choose a Pile:%n");
       q=input.next();
       
        System.out.printf("How many to remove from pile:%n");
     n=input.nextInt();
      if(q.equals ("A"))
      {
          A=A-n;
          
           System.out.printf("A:%d  B:%d C:%d  ",A,B,C);
           
      }
      else if(q.equals ("B"))
      {
          B=B-n;
           System.out.printf("A:%d  B:%d C:%d  ",A,B,C);
       
      }
      else if(q.equals ("C"))
      {
          C=C-n;
           System.out.printf("A:%d  B:%d C:%d  ",A,B,C);
          
      }
      if (A==0 && B==0 && C==0 || A<0 && B==0 && C==0 ||A==0 && B<0 && C==0 ||A==0 && B==0 && C<0 ||A<0 && B<0 && C==0
              ||A<0 && B<0 && C<0 ||A<0 && B==0 && C<0)
      {
          System.out.println("All piles are empty %n Good Job!!");
          break;
      }
    }
    }
}
