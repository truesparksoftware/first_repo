package methodrelatedoperation;

class Mobile {
	int var1 = 30;
	static int var2 = 40;

	Mobile() {
		System.out.println("constructor....");
	}

	// dynamic block
	{
		System.out.println("dynamic block..");
	}

	static {
		System.out.println("static block...");
	}

	public void m1() {
		System.out.println("instance method....");
	}

	public static void m2() {
		System.out.println("static method...");
	}

}

public class ExecutionFlow {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.m1();
		Mobile.m2();
	}
}
