// to find num is prime or not
import java.util.*;
class MethodExample
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		isPrime(num);
		// for(int i=1;i<=50;i++)
		// 	isPrime(i);
	}
	
	public static void isPrime(int num) {
		boolean flag = true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		System.out.println(flag ? num+" is a Prime number." : num+" is not a Prime number.");
	}
}