package MoreOnClasses;

public class Demo123 {
	
		public static void main(String[] args){
		Account a1=new Account();
		String s1=new String();
	float p=(float) 98.098908988888888899999999999999999999999999900000000000000000099999999999777777777;
	System.out.println("Itis float value"+p);
		a1.insert(832345,"Ankit",1000);
		a1.display();
		a1.checkBalance();
		a1.deposit(40000);
		a1.checkBalance();
		a1.withdraw(15000);
		a1.checkBalance();
		}


}
