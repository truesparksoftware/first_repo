package methodrelatedoperation;

class Employee{
	static int num=20;
	int numm=30;
	// instance method
	int addition(int number1,int number2){
    System.out.println("addition method....");	
    int sum=0;
    sum=number1+number2;		
    return sum;
	}
	
	// instance method
	void displayResult(int num1,int num2,int num3) {
		int result=addition(num1,num2);
		System.out.println("retrun result from addition..."+result);
	}
	
	// static method
	static void add(int num1,int num2) {
		int sum=0;
		sum=num1+num2;
		System.out.println("addition in static method..."+sum);
		System.out.println("num...."+num);
	}
}



public class MethodCode {
public static void main(String[] args) {
	 // calling static method
	   Employee.add(20, 10);
	 Employee emp=new Employee();
	 emp.displayResult(30, 40, 50);
	 // int result = emp.addition(30,40)
}
}
