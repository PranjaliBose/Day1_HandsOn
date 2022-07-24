import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Number is a Positive number.");
		}
		else if(n<0)
		{
			System.out.println("Number is a Negative number.");
		}
		else
		{
			System.out.println("Number is zero");

		}
					

	}

}
