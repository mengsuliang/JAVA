package bbo;

public class Animal {
	protected void cry() {
		System.out.println("�н�");
	}
	public static void testCry(Animal am) {
		am.cry();
		if(am instanceof Cat) {
			((Cat)am).grab();
		}
		
	}
	public static void outCry(Animal bm) {
		bm.cry();
		if (bm instanceof Dog) {
			((Dog)bm).see();
			
		}
		
	}
	public static void main(String[]args) {
		Animal am = new Cat();
		testCry(am);
		Animal bm = new Dog();
		outCry(bm);
	}
	
}
class Cat extends Animal{
	protected void cry() {
		System.out.println("����");	
	}
	public void grab() {
		System.out.println("ץ����");
	}
}

class Dog extends Animal{
	protected void cry() {
		System.out.println("����");
	}
	public void see() {
		System.out.println("����");
	}
}
