package basic_operation;
class A{
	   int variable1=20; // 4 byte
	   int variable2=30; // 4 byte
	   String name="40";
	    void addition() {
	    	int num1=80;  // 4 byte
	    	System.out.println(num1);
		   System.out.println("addition message.....");
	   }
	    
	   void substaraction() {
		
		   System.out.println("substaraction message.....");
	   }   
	   
	   void mul() {

		   System.out.println("mul message.....");
		   
	   }
	
}



class B{
	
	
}


class C{
	
	
}

public class NewClass {
   public static void main(String[] args) {
	   A a=new A();
	   a.addition();
	   System.out.println(a.variable1);
	   System.out.println(a.variable2);
	   A a1=new A();
	   A a2=new A();
	   A a3=new A();
	   A a4=new A();
	   A a5=new A();
	   
	   a5.mul();
	   a4.mul();
	   a3.mul();
	   a2.mul();
	   a1.mul();
	   
	
}
   
}
