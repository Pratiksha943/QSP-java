class MethodTypes
{
	public static void main(String[] args) {
		System.out.println("Execution starts.");
		myMethod();				//method call
		checkEvenOdd(10);		//method call
		checkEvenOdd(11);		//method call
		System.out.println("Execution ends.");
	}

	//No arguments method
	public static void myMethod() {
		System.out.println("Hello from  myMethod() .");
	}

	//Paremeterized method
	public static void checkEvenOdd(int num) {
		if(num%2==0)
			System.out.println(num+" is a even number.");
		else
			System.out.println(num+" is a odd number.");
	}
}