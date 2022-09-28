import java.util.Scanner; 
public class Table 
{
	
	public static void main(String[] args)
	{
		Table obj=new Table();
		obj.table1();
		obj.table2();
	}
	
	public void table1()
	{
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter number: ");       
		int num=sc.nextInt(); 
		for(int i=1; i <= 10; i++)  
		{  
		System.out.println(num+" * "+i+" = "+num*i);  
		}   
	}
	public void table2()
	{
		System.out.println("The Table from 1 to 10: \n");
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

}
