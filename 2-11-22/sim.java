package testCode;

import java.util.Scanner;

public class sim 
{
	public static void main(String[] args)
	   {
	      float totalCost, costToPaid, discount;
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Total Amount of Shopping: ");
	      totalCost = scan.nextFloat() ;
	     
	      
	      if(totalCost<=800)
	      {
	         costToPaid= totalCost  ;
	      }
	      else if(totalCost>800 && totalCost<=1500)
	      {
	         discount = (totalCost*10)/100;
	         costToPaid = totalCost - discount;
	      }
	      else if(totalCost>1500 && totalCost<=2500)
	      {
	         discount = (totalCost*15)/100;
	         costToPaid = totalCost - discount;
	      }
	      else if(totalCost>2500 && totalCost<=5000)
	      {
	         discount = (totalCost*20)/100;
	         costToPaid = totalCost - discount;
	      }
	      else
	      {
	         discount = (totalCost*30)/100;
	         costToPaid = totalCost - discount;
	      }
	      System.out.println("\nThe cost to be Paid is:  "+costToPaid );
	   }
}
