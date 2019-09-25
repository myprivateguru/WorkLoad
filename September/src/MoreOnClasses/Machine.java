package MoreOnClasses;

 class Machine1 {
	public void start() {
		System.out.println("Starting...");
	}

}
 class Machine {
public static void main(String[] args) {
	Machine1 m = new Machine1(){
		 public void start() {
			System.out.println("wooo...");
		}
	};
	m.start();
}
}
 //two classes must not be in a single file