//else if: WAP to accept 5 no from user and find out the greatest.
import java.util.*;
class Ass3
{
    public static void main(String[] args) 
	{
	  Scanner sc= new Scanner(System.in);    
	  
	  System.out.print("Enter first number: ");
	  int num1 = sc.nextInt();
	   
	  System.out.print("Enter second number: ");
	  int num2 = sc.nextInt();
	   
	  System.out.print("Enter third number: ");
	  int num3 = sc.nextInt();
	   
	  System.out.print("Enter fourth number: ");
	  int num4 = sc.nextInt();
	  
	  System.out.print("Enter fifth number: ");
	  int num5 = sc.nextInt();
	  
		  if( num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5)
            System.out.println(num1 + " is the greatest number.");

        else if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5)
            System.out.println(num2 + " is the greatest number.");

        else if (num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5)
            System.out.println(num3 + " is the greatest number.");
		
		else if (num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5)
            System.out.println(num4 + " is the greatest number.");
	
        else
			System.out.println(num5 + " is the greatest number.");
	
	}
}