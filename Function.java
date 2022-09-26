import java.util.Scanner;

/*WAP to Accept a no from the user and perform the following task
1:Logical Operator
2: Arithmetic Operation
3: Reverse of the No
4: swapping of two no with third variable
5:Swapping without third variable
6:Accept the value find out the factorial and pass the value of factorial to another function 7
7:Find out the sum of digit
*/

public class Function {

	public static void main(String[] args)
	{
		Function obj=new Function();
		obj.accept();
		
	}
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		int num1,num2,facto=1;
		System.out.println("Enter the Numbers :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		logical(num1,num2);
		arith(num1,num2);
		reverse(num1);
		swapping(num1,num2);
		swapWithout(num1,num2);
		facto=factorial(num1,facto);
		sumOfDigit(facto);
	
	}
	
	public void logical(int a,int b)
	{
		System.out.println("\n Logical Operations:");
		// && operator
		System.out.println("AND Operator"); 
	    System.out.println((a > b) && (b > a)); 
	    System.out.println((a > b) && (b < a));  
       
	    // || operator
	    System.out.println("OR Operator");  
	    System.out.println((a < b) || (b > a));  
	    System.out.println((a > b) || (b < a));  
	    System.out.println((a < b) || (b < a));  

	    // ! operator
	    System.out.println("NOT Operator"); 
	    System.out.println(!(a == b));  
	    System.out.println(!(a > b));
	    System.out.println(!(a < b));  
	    
	}
	
	public void arith(int n1,int n2)
	{
		int a;
		System.out.println("\n Arithmetic Operations:");
		a=n1+n2;
		System.out.println("Addition is :"+a);
		a=n1-n2;
		System.out.println("Subtraction is:"+a);
		a=n1*n2;
		System.out.println("Multiplication is:"+a);
		a=n1/n2;
		System.out.println("Division is:"+a);
		
	}
	
	public void reverse(int num)
	{
		int rev=0;
		System.out.println("\n Reverse Number:");
		while(num != 0)   
		{  
		int remainder = num % 10;  
		rev = rev * 10 + remainder;  
		num = num/10;  
		} 
		System.out.println("The reverse of the given number is: " + rev);
	}
	
	public void swapping(int x,int y)
	{
		int temp=0;
		System.out.println("\n Swap The Number:");
		System.out.println("Before swapping numbers: "+x +"  "+ y);  
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping numbers: "+x +"  "+ y); 
	}
	
	public void swapWithout(int p,int q)
	{
		System.out.println("\n Swapping without third Number:");
		System.out.println("Before swapping numbers: "+p +"  "+ q);
		p=p+q;
		q=p-q;
		p=p-q;
		System.out.println("After swapping numbers: "+p +"  "+ q);

	}
	
	public int factorial(int num,int fact)
	{
		System.out.println("\n Factorial Number");
	
		while(num>=1)
		{
		fact=fact*num;						 
		num--;
		}
		System.out.println("The factorial is ="+fact);
		return fact;
		
	}
	
	public void sumOfDigit(int number)
	{
		System.out.println("\n Sum of digit");
		int digit, sum=0;
		while(number!=0)
		{
			digit=number%10;   
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("sum of digit " +sum);
		
	}

}
