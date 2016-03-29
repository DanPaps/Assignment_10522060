/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10522060;

import java.util.Scanner;

public class Nim 
{
    public static void main(String[] arg)
    {
           
      Scanner input =new Scanner(System.in); 
     
        String alter[] = new String [2];
         System.out.print("Player1:");
    String p1=input.next();
      System.out.print("Player2:");
       String p2=input.next();
          String s=p2;  
      int A=3,B=4,C=5,n;
      String q;
      
      System.out.printf("A:%d  B:%d C:%d %n ",A,B,C);
      while(A>=0 && B>=0 && C>=0  )
              {
                  
                  if(s==p1)
                  {
                      p1=p2;
                  }
                  else
                  {
                    p2=p1;  
                  }
                  
       System.out.printf(" %s Choose a Pile:%n",s);
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


