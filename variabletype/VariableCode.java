package variabletype;


// this class is for only student operation


class Student{
	
	//instance variable/global variable
	int number=10;
	
	//class variable/static variable
	static int number1=20;
   void m1() {
	  int num1=10;
	   System.out.println(number);
       System.out.println(number1);
       System.out.println(num1);
   }
   
   void m3() {
	   System.out.println(number);
       System.out.println(number1);
   }
   
   
   
   static void m2() {
	   System.out.println(number1);
   }

}





public class VariableCode {
public static void main(String[] args) {
	Student.m2();

	
}
}
