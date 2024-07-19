import java.util.Scanner;
class MethodExampleCharAt
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : ");
		String name = sc.next();
		System.out.print("Enter an index : ");
		int index = sc.nextInt();
		char ch = demo(name,index);
		System.out.println(name+" has a character "+ch+" at index "+index);
	}

	public static char demo(String name, int index) {
		char ch = name.charAt(index);
		return ch;
	}
	
}