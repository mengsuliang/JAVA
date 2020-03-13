package sxt;

class A1{
	public void tell1() {
		System.out.println("´òÓ¡-->tell1");
	}
	public void tell2(){
		System.out.println("´òÓ¡-->tell2");
	}
	
}

class A2 extends A1{
	public void tell3() {
		System.out.println("´òÓ¡-->tell3");
	}
}

public class Ji {
	public static void main(String[]args) {
		A1 a =new A1();
	    a = (A2)new A1();
		a.tell1();
		
	}

}
