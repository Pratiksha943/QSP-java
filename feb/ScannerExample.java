import java.util.Scanner;	// importing the scanner class.
class ScannerExample
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);	//creating an object of scanner class.
		System.out.print("Enter your name : ");
		String name = sc.next().toLowerCase();	// utilization of methods of scanner reference variable.
		char ch = name.charAt(0);	// extracting the character which is at 0th Index.
		System.out.println("Hi my name is "+name+" and my first character is "+ch+".");

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
		{
			System.out.println("Character "+ch+" is a vowel.");
		}
		else
		{
			System.out.println("Character "+ch+" is a consonent.");
		}
	}
}