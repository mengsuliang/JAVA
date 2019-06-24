package sxt;

public class SxtStu {
	//属性
	int id;
	int age;
	String name;
	
	
	Computer comp;
		
	//方法
	void study() {
		System.out.println("我在认真学习！！使用电脑："+comp.brand);
		}
	void play() {
		System.out.println("我在玩游戏！！王者农药！");
	}
		
		
	//程序执行的入口，必须要有的
	public static void main(String[] args) {
		SxtStu stu = new SxtStu();  //创建一个对象
		stu.id=1800300404;
		stu.age=18;
		stu.name="Meng Suliang";
		
		Computer c1 = new Computer();
		c1.brand ="联想";
		stu.comp = c1;
		
		stu.play();
		stu.study();
			
	}


}

class Computer {
	String brand;
	
}
