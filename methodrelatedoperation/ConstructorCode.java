package methodrelatedoperation;

class Example{
	// declaration
	int num=0;
	
	void m1() {
		num=30;
		System.out.println("num"+num);
	}
	
	//constructor...
	Example(){
		int num1=20;
		int num2=30;
		int sum=num1+num2;
		System.out.println("constructor code..."+sum);	
	}
	
	Example(int num1,int num2){
		int sum=0;
		sum=num1+num2;
		System.out.println("addition of 2 number.."+sum);
	}
	
	Example(String name,int num2){
		System.out.println("name paramter...."+name);
		System.out.println("number2....."+num2);
	}
	
}




public class ConstructorCode {
public static void main(String[] args) {
	// at time of object creation....
 // Example exmple=new Example();
  
//  Example ex1=new Example(10,20);
  
	Example ex2=new Example("Jeevan",30);
	
}
}
