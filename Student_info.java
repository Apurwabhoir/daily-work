import java.util.Scanner;

/*WAP to accept Student name , Marks of 5 subject, calculate the Percentage and display the grade*/
public class Student_info
{

	public static void main(String[] args) 
	{
		Student_info obj=new Student_info();
		int[] mark=obj.acceptMarks();
		obj.Percentage(mark);
		obj.acceptName();
	}
	
	public int[] acceptMarks()
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("\nEnter the size");
		size=sc.nextInt();
		int mark[]=new int[size];
		System.out.println("Enter " +size+ "Marks:");
		for(i=0;i<size;i++)
		{
			mark[i]=sc.nextInt();
		}
		return mark;
	}
	
	public String[] acceptName()
	{
		Scanner sc=new Scanner(System.in);
		int size,i;
		System.out.println("\nEnter the size");
		size=sc.nextInt();
		String[] name=new String[size];
		System.out.println("Enter "+size+" Names:");
		for(i=0;i<size;i++)
		{
			name[i]=sc.next();
		}
		System.out.println("The Names are :");
		for(i=0;i<size;i++)
		{
			System.out.println(name[i]);
		}
		return name;
	}
	
	public void Percentage(int[] mark)
	{
		//int[] mark=acceptMarks();
		int score = mark[0];
		int total=500;
		float percentage;

		for (int i = 0; i < mark.length; i++) 
		{  
			score = score + mark[i];  
	    }  
		System.out.println("Total Score of Marks: " +score);
		
		percentage=(score*100)/total;
		
		System.out.println("Percentage is : " +percentage);
		
		System.out.print("The student Grade is: ");
		if(percentage>=90)
        {
            System.out.print("A+");
        }
		else if(percentage>=80)
        {
            System.out.print("A");
        }
        else if(percentage>=60 && percentage<80)
        {
           System.out.print("B");
        } 
        else if(percentage>=40 && percentage<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
		
	}

}
