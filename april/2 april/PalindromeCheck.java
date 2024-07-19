//MEthod Example
import java.util.*;
class PalindromeCheck
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//1
		System.out.print("Enter a number : ");	//2
		int num = sc.nextInt();					//3
		int rev = reverseNumber(num);			//4
		isPalindrome(num,rev);					//8
	}

	//method to reverse the number
	public static int reverseNumber(int num) {
		int rev = 0;						//5
		while(num>0)						//6
		{
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		return rev;							//7
	}

	//method to check rev==num
	public static void isPalindrome(int num,int rev) {
		if(num==rev)						//9
			System.out.println(num+" is a Palindrome number.");	//10
		else
			System.out.println(num+" is not a Palindrome number.");		//10
	}
}