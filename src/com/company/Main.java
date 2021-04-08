package com.company;
import java.util.*;
public class Main
{

    public static void main(String[] args)
    {
	  int fact=1,i,n;
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter the number:");
	  n=in.nextInt();
	  for(i=1;i<=n;i++)
      {
          fact=fact*i;
      }
	  System.out.println("Factorial is: " + fact);





    }
}
