/*Hierarchical:
WAP to accept no from the user and perform the different types of Operator.
*/
package inheritance;

import java.util.Scanner;

public class accept 
{
	static int num1,num2;
	public static void acc() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter The Numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
	}
}

package inheritance;

public class Arithmetic extends accept 
{
	
	public static void arith()
	{
		acc();
		System.out.println("\n Arithmetic Operations:");
		System.out.println("Addition is :"+(num1+num2));
		System.out.println("Subtraction is:"+(num1-num2));
		System.out.println("Multiplication is:"+(num1*num2));
		System.out.println("Division is:"+(num1/num2));     
		
	}	
}

package inheritance;

public class Ternary extends accept
{
	public static void ternary()
	{
		acc();
		System.out.println("\n Ternary Operations:");
		int max = (num1 > num2) ? num1 : num2;
		 
        // Print the largest number
        System.out.println("Maximum is = " + max);
    
	}
}

package inheritance;

public class Logical extends accept
{
	public static void logi()
	{
		acc();
		System.out.println("\n Logical Operations:");
		// && operator
		System.out.println("AND Operator"); 
	    System.out.println((num1 > num2) && (num2 > num1)); 
	    System.out.println((num1 > num2) && (num2 < num1));  
       
	    // || operator
	    System.out.println("OR Operator");  
	    System.out.println((num1 < num2) || (num2 > num1));  
	    System.out.println((num1 > num2) || (num2 < num1));  
	    System.out.println((num1 < num2) || (num2 < num1));  

	    // ! operator
	    System.out.println("NOT Operator"); 
	    System.out.println(!(num1 == num2));  
	    System.out.println(!(num1 > num2));
	    System.out.println(!(num1 < num2)); 
	}
}

package inheritance;

public class Bitwise extends accept
{
	public static void bit()
	{
		acc();
		System.out.println("\n Bitwise Operations:");
		// & operator
		System.out.println("bitwise AND Operator");
		System.out.println(num1<num2&num2<num1);	// bitwise and 
		
	    // ^ operator
	    System.out.println("bitwise XOR  Operator");   
	    System.out.println(num1>num2|num2<num1);	// bitwise XOR
	    
	    // | operator
	    System.out.println("bitwise inclusive OR Operator"); 
	    System.out.println(num1 | num2);   // bitwise inclusive OR
	    
	    // ~ operator
	    System.out.println("bitwise compliment Operator"); 
		System.out.println(~num1);   // bitwise compliment 
	
	}
}

package inheritance;

public class Display extends accept
{

	public static void main(String[] args) 
	{
		Arithmetic ob = new Arithmetic();
		//ob.acc();
		ob.arith();
		
		Logical ob1 =new Logical();
		ob1.logi();
		
		Ternary ob2 =new Ternary();
		ob2.ternary();
		
		Bitwise ob3 =new Bitwise();
		ob3.bit();

	}
}
