package bbo;

public class Test1 {
	public static void main(String[]args) {
		int a = 90;
		int b = 90;
		if(a==b || a>8) {System.out.println("ok1");}
		b--;
		if(a>b && a>45) {System.out.println("ok2");}
		if(!(a<=b)) {System.out.println("ok3");}
	}

}
