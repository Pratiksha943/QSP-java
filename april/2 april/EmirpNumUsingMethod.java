import java.util.Scanner;
class EmirpNumUsingMethod
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		boolean condition1 = isPrime(num);

		if(condition1)
		{
			int rev = reverse(num);
			boolean condition2 = isPrime(rev);	
			if(condition2)
				System.out.println(num+" is an Emirp number.");
			else
				System.out.println(num+" is not an Emirp number.");
		}
		else
		{
			System.out.println(num+" is not an Emirp number.");
		}

	}
	//method to check num/reverse is prime
	public static boolean isPrime(int num) {
		int count = 0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		boolean flag = count==0?true:false;
		return flag;
	}
	//method to reverse the number
	public static int reverse(int num){
		int rev = 0;
			while(num>0)
			{
				int rem = num%10;
				rev = rev*10+rem;
				num/=10;
			}
		return rev;
	}
}