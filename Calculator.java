package week.day3;

public class Calculator {
	public void additionTwoNumber(int a,int b){
		int c= a+b;
		System.out.println("Addition:" +c);
	}
	public void subractionTwoNumber(int e,int f) {
		int d= e-f;
		System.out.println("Subraction:" +d);
	}
	public void multipleTwoNumber(double i,double j) {
		double h= i*j;
		System.out.println("Multiple:" +h);
	}
	public void divideTwoNumber(float x,float y) {
		float z= x/y;
		System.out.println("Division:" +z);
	}

	public static void main(String[] args) {
		Calculator operations = new Calculator();
		
		operations.additionTwoNumber(10, 20);
		operations.subractionTwoNumber(200, 150);
		operations.multipleTwoNumber(20.5, 21.5);
		operations.divideTwoNumber(200.5f, 2.5f);
	}

}
