package Assignments;

public class VarMethodObjectDemo {
	//below are global variables
	int a;//declaration of variable
	int b=20;// Initialization of variable
	void m1() {
	a=10;  //assignment of variable to global variable
	int c=30;
	System.out.println("i m here "+a);
	System.out.println("print here "+c);
	}
public static void main(String[] args) {
	VarMethodObjectDemo cs=new VarMethodObjectDemo();
	//Object Creation
	cs.m1(); //Method calling by object
	System.out.println("Last out "+cs.b);
}
}
