package p2;

import p1.Ax1;

public class Ax3 extends Ax1{
	int num3=90;
	
	// default cannot access outside package
	void m3() {
		System.out.println(num1);
	}
	
}

