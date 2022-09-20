//WAP to accept a no from user and display a square if no is divisible by 5 using if case.
import java.util.*;
class Ass1
{
    public static void main(String[] args) 
	{
	  Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	  System.out.print("Enter number- ");  
      int n= sc.nextInt();  
	  
	if(n%5==0){
        System.out.println("No. is divisibel by 5 ");
		System.out.println("Square of that no." + n*n);
    }
	else
		System.out.println("No. is not divisibel by 5 ");
		
	}
}