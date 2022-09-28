import java.util.Scanner;

public class pattern 
{
	public static void main(String[] args) 
	{
		pattern obj=new pattern(); 
		obj.pattern1();
		obj.pattern2();
		obj.pattern3();
		obj.pattern4();
	
	}
	public void pattern1()
	{
		
		int i,j, alphabet = 65; //ASCII value of capital A is 65   
		for (i=0;i<=5;i++)  
		{        
		for (j=0;j<i;j++)  
		{  
			System.out.print((char) (alphabet + j) + " ");   
		}  
		System.out.println();  
		}  
	}
	
	public void pattern2()
	{
		Scanner sc=new Scanner(System.in);
		int i,j,size;
		System.out.println("\nEnter the size:");
		size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			for(j=i;j<size;j++)
			{
				System.out.print(" ");
			}	
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		
			System.out.println();
		}
	}
	
	public void pattern3()
	{
		Scanner sc=new Scanner(System.in);
		int i,j,size;
		System.out.println("\nEnter the size:");
		size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			for(j=i;j<size;j++)
			{
				System.out.print(" ");
			}	
			for(j=1;j<=(2*i-1);j++)
			{
				System.out.print("*");
			}
		
			System.out.println();
		}
	}
	
	public static void pattern4()
	{
		Scanner sc=new Scanner(System.in);
		int size,i,j,p;
		char ch;
		System.out.println("Enter the size:");
		size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for( p=i;p<=size;p++)
			{
				if(p%2==0)
				{
					System.out.print("0");
				}
				else
				{
				System.out.print("1");
				}
				
			}
			System.out.println();
		}
	}
	
}