package testCode;
import java.util.*;
public class Hotel_menu
{
	public static void main(String[] args)
	{
		int menu,menu1 = 0,total=0, price = 0;
		int ans = 0;
		Scanner sc=new Scanner(System.in);
	
	do 
	{ 
		System.out.println("Welcome to Rajwada Hotel");
		System.out.println("1.Non veg");
		System.out.println("2.veg");
		System.out.println("3 Desert");
		System.out.println("Please enter your menu :");
		menu=sc.nextInt();
		switch(menu)
		{ //use to select list of menu
		case 1:
		System.out.println("1.chicken Fried Rice");
		System.out.println("2.chicken Noodles");
		System.out.println("3.Chicken Soup");
		System.out.println("please select your menu");
		menu1=sc.nextInt(); //use to select menu
		break;
		
		case 2:	
		System.out.println("1.veg Fried Rice");
		System.out.println("2.veg Noodles");
		System.out.println("3.veg Soup");
		System.out.println("please select your menu");
		menu1=sc.nextInt();  //use to select menu
		break;
		
		case 3:	
		System.out.println("1.venilla Ice-Cream");
		System.out.println("2.Badam Shake");
		System.out.println("3.faluda");
		System.out.println("please select your menu");
		menu1=sc.nextInt();   //use to select menu
		break;	
	
	default :
		System.out.println("Please select your order properly");
	}
	
	if(menu==1) 
	{ //condition to check select menu
		 
		if(menu1==1)
		{  //condition for price
			System.out.println("chicken Fried Rice is : 160rs ");
			price=price+160;
	    }
		 
		 else if(menu1==2) 
		 { //condition for price
			 System.out.println("chicken Noodles is : 200rs");
			 price=price+200;
		 }
		 else if(menu1==3) 
		 { //condition for price
			 System.out.println("Chicken Soup is : 150rs");
			 price=price+150;
		 }
		 else 
		 {
			 System.out.println("sorry select correct option");
		 }
		}
		else if(menu==2)
		{//condition to check select menu
			 
			if(menu1==1) 
			{ //condition for price
					System.out.println("veg Fried Rice is : 80 rs");
					price=price+80;   	
			 }
				 
			else if(menu1==2)
			{ //condition for price
					 System.out.println("veg Noodles is : 180rs");
					 price=price+180;
				 }
				 
			else if(menu1==3)
			{ //condition for price
					 System.out.println("veg Soup is : 50rs");
					 price=price+50;
				 }
				 
			else {
					 System.out.println("sorry select correct option");
				 }
		}
		else {
			 if(menu1==1)
			 { //condition for price
					  System.out.println("venilla Ice-Cream : 120rs ");
					  price=price+120;   	
			 }
				 else if(menu1==2) 
				 { //condition for price
					  System.out.println("Badam Shake is : 100rs");
					  price=price+100;
				 }
				 else if(menu1==3)
				 { //condition for price
					  System.out.println("faluda is : 80rs");
					  price=price+80;
				 }
				 else
				 {
					 System.out.println("sorry select correct option");
				 }
		}
	System.out.println("If you want order anythink please press y:");
	ans=sc.next().charAt(0);	
	}
	while(ans=='y'||ans=='Y'); 		//condition to repeat the process
	total=total+price; 			//use formula to calculate bill of menu
	System.out.println("The total bill is :"+total+" Rs");
    System.out.println("Thank you visit again");
}
}