package bbo;

abstract class Abs{
	 public int id;
	 public String name;
	 public void tell() {
		 
	 }
	 //���󷽷�
	 public abstract void say();
	 public abstract void speak();
}

class AbsDemo extends Abs{
	//���าд���������еĳ��󷽷�
	 public void say() {
		 id = 12345678;
		 System.out.println(id);
		 
	 }
	 
	 public void speak() {
		 name = "С��";
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
