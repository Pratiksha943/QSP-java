import java.util.*;
class EvenOddMethod
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		evenOdd(num);
		// for(int i=1;i<=10;i++)
		// {
		// 	evenOdd(i);
		// }
	}

	public static void evenOdd(int num) {
		if(num%2==0)
			System.out.println(num+" - even");
		else
			System.out.println(num+" - odd");
	}
}