import java.util.Scanner;
public class Prog5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a gender: ");
		String s=sc.next();
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		if(s.equalsIgnoreCase("Female"))
		{
			if(age>=1 && age<=58)
			{
				System.out.println("The percentage of interest is 8.2%. ");
			}
			else if(age>=59 && age<=100)
			{
				System.out.println("The percentage of interest is 9.2%. ");
				
			}
			
		}
		else
		{
			if(age>=1 && age<=58)
			{
				System.out.println("The percentage of interest is  8.4%. ");
			}
			else if(age>=59 && age<=100)
			{
				System.out.println("The percentage of interest is 10.5%. ");
				
			}
			
		}

	}

}
