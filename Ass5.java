//switch case : accept choice from user and accordingly display the output 1:unary operator 2:binary operator 3:ternary operator 
import java.util.*;
class Ass5
{
public static void main(String args[])
{
int c,c1,c2,c3,c4;
Scanner sc = new Scanner(System.in);
System.out.println("1.Unary Operation \n2.Binary Operation \n3.Ternary Operation");
System.out.println("enter choice:");
c = sc.nextInt(); 
switch(c)
{
case 1:
	System.out.println("... UNARY OPERATION ...");
	System.out.println("1.Pre-Increment \n2.Pre-Decrement \n3.Post-Increment \n4.Post-Decrement");
	int a,b;
	System.out.println("enter num");
	a = sc.nextInt();
	System.out.println("enter choice:");
	c1 = sc.nextInt();
	switch(c1)
	{
		case 1:
			b=++a;
			System.out.println("Pre-Increment opration"+b);
			break;
		case 2:
			b=--a;
			System.out.println("Pre-Decrement opration"+b);
			break;
		case 3:
			b=a++;
			System.out.println("Post-Increment opration"+b);
			break;
		case 4:
			b=a--;
			System.out.println("Post-Decrement opration"+b);
			break;
			
	}
	break;

case 2:
	System.out.println("... BINARY OPERATION ...");
	System.out.println("1.Arithmetic \n2.Relational");
	int x,y,z;
	System.out.println("enter value for x");
	x = sc.nextInt();
	System.out.println("enter value for y");
	y = sc.nextInt();
	System.out.println("enter choice:");
	c2 = sc.nextInt();
	switch(c2)
	{
		case 1:
		System.out.println("arithmetic operation");
		System.out.println("1.addition \n2.subtraction \n3.division \n4.multiplication");
		System.out.println("enter choice:");
		c3 = sc.nextInt();
		switch(c3)
		{
			case 1:
				z=x+y;
				System.out.println("addition is "+z);
				break;
			case 2:
				z=x-y;
				System.out.println("subtraction is "+z);
				break;
			case 3:
				z=x*y;
				System.out.println("multiplication is "+z);
				break;
			case 4:
				z=x/y;
				System.out.println("division is "+z);
				break;
		}
		break;

		case 2:
		System.out.println("relational operation");
		System.out.println("1.greater than equal to \n2.less than equal to \n3.equal");
		System.out.println("enter choice:");
		c4 = sc.nextInt();
		switch(c4)
		{
			case 1:
				if(x>=y)
				{
				System.out.println(x +" is greater");
				}
				else{
				System.out.println(x +" is less");
		        }
				break;
			case 2:
				if(x<=y)
				{
				System.out.println(y +" is greater");
				}
				else{
				System.out.println(y +" is less");
				}
				break;
			case 3:
				if(x==y)
				{
				System.out.println("both are equal");
				}
				else{
				System.out.println("both are not equal");
				}	
				break;
		}
		break;	
	}break;

case 3:
    System.out.println("... ternary operator ...");
		int p,q,max;
	System.out.println("enter value for p");
	p = sc.nextInt();
	System.out.println("enter value for q");
	q = sc.nextInt();
	max=(p>q)?p:q;
	System.out.println("maximum is="+max);
	break;	
}
}
}