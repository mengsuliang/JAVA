package sxt;

class people{
	/*
	 * 构造方法：1、方法名与类名一致     2、无返回值     3、自动执行     4、可重载
	 */
	
	public people(int a,String n) {
		int age=a;
		String name=n;
		 System.out.println("姓名:"+name+"   年龄:"+age);
	}
	//构造方法的重载
	public people(String n) {
		String name = n;
		System.out.println("姓名:"+name);
	}
	
}

public class Fh {
	public static void main(String []args) {
		people p = new people(18, "亮亮");
		people s =new people("小柯南");
	}
	

}
