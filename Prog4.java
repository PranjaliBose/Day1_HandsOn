import java.util.Scanner;

public class Prog4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character :");
		char c=sc.next().charAt(0);
		if(Character.isLetter(c)) 
		{
			System.out.println("Character is an Alphabet");

		}
		else if(Character.isDigit(c))
		{
			System.out.println("Character is Digit ");
		}
		else
		{
			System.out.println("Character is a Special Character ");
		}
		
	}

}
