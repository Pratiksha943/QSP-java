class MethodExample1
{
	public static void main(String[] args) {
		System.out.println("Main starts.");
		ramesh();
		System.out.println("Main ends.");
	}

	public static void ramesh() {
		System.out.println("Ramesh starts");
		suresh();
		System.out.println("Ramesh ends.");
	}

	public static void suresh() {
		System.out.println("Suresh starts.");
		mahesh();
		System.out.println("Suresh ends.");	
	}

	public static void mahesh() {
		System.out.println("Mahesh starts.");
		System.out.println("Mahesh ends.");
	}
}