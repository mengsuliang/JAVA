package bbo;

abstract class Abs{
	 public int id;
	 public String name;
	 public void tell() {
		 
	 }
	 //抽象方法
	 public abstract void say();
	 public abstract void speak();
}

class AbsDemo extends Abs{
	//子类覆写抽象类所有的抽象方法
	 public void say() {
		 id = 12345678;
		 System.out.println(id);
		 
	 }
	 
	 public void speak() {
		 name = "小红";
		 System.out.println(name);
		 
	 }
	
}

public class Demo33 {

	public static void main(String[] args) {
		AbsDemo a = new AbsDemo();
		a.say();
		a.speak();
		
		
	}

}
