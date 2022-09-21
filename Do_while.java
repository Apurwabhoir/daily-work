import java.util.Scanner;

public class Do_while
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int menu_item,menu1, price = 0;
		char ans;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Menu:\n1:Starters \n2:Main course \n3:Desserts");
			menu_item=sc.nextInt();
			switch(menu_item)
			
			{
			case 1:
				System.out.println("    Starters   ");
				System.out.println("1:Masala Papad \t 120Rs.");
				System.out.println("2:Aloo Chaat \t 300Rs.");
				System.out.println("3:Paneer 65 \t 600Rs.");
				menu1=sc.nextInt();
				if(menu1==1) 
				{
					 price= price+120;
				}
				else if(menu1==2){
					 price= price+300;
				}
				else if(menu1==3){
					 price= price+600;
				}
				//System.out.println("Starter price" + price);
				break;
			case 2:
				System.out.println("    Main course   ");
				System.out.println("1:Aloo matar \t 700Rs.");
				System.out.println("2:Paneer Masala \t500Rs.");
				System.out.println("3:Palak Paneer \t450Rs.");
				menu1=sc.nextInt();
				if(menu1==1) 
				{
					 price= price+700;
				}
				else if(menu1==2){
					 price= price+500;
				}
				else if(menu1==3){
					 price= price+450;
				}
				break;
			case 3:
				System.out.println("    Desserts    ");
				System.out.println("1:Apple pie \t850Rs");
				System.out.println("2:Cheesecake  \t400Rs");
				System.out.println("3:Brownies  \t950Rs");
				menu1=sc.nextInt();
				if(menu1==1) 
				{
					 price= price+850;
				}
				else if(menu1==2){
					 price= price+400;
				}
				else if(menu1==3){
					 price= price+950;
				}
				break;
			
			}
			System.out.println("Do you want to addd another item y/n");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y'||ans=='y');
		//System.out.println("Your Bill");
		System.out.println("Your Bill is" + price);
		System.out.println("Thanks for coming");
		
		
	}

}
