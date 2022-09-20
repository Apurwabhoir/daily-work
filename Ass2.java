//If else: WAP to accept age from user and check eligible for voting or not. 
import java.util.*;
class Ass2
{
    public static void main(String[] args) 
	{
	  Scanner sc= new Scanner(System.in);      
	  System.out.print("Enter number- ");  
      int age= sc.nextInt();  
	  
	if(age>=18){
        System.out.println("You are eligible for Voting");
	}
	else
		System.out.println("Sorry,You are not eligible for voting right now");
		
	}
}