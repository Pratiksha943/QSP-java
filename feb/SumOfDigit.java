import java.util.Scanner;
class SumOfDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer between 1 to 1000 : ");
		int num = sc.nextInt();
		int dup = num; 	// assume num = 456
		int sum =0;
		sum = sum + num%10;  // sum = 0 + (456%10) = 6
		num = num/10;		 // num = 456/10 = 45
		sum = sum + num%10;	 // sum = 6 + (45%10) = 11
		num = num/10;
		sum = sum + num%10;
		System.out.print("Sum of digits is "+sum+" and the number is "+dup);
	}
}