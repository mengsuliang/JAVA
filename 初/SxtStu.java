package sxt;

public class SxtStu {
	//����
	int id;
	int age;
	String name;
	
	
	Computer comp;
		
	//����
	void study() {
		System.out.println("��������ѧϰ����ʹ�õ��ԣ�"+comp.brand);
		}
	void play() {
		System.out.println("��������Ϸ��������ũҩ��");
	}
		
		
	//����ִ�е���ڣ�����Ҫ�е�
	public static void main(String[] args) {
		SxtStu stu = new SxtStu();  //����һ������
		stu.id=1800300404;
		stu.age=18;
		stu.name="Meng Suliang";
		
		Computer c1 = new Computer();
		c1.brand ="����";
		stu.comp = c1;
		
		stu.play();
		stu.study();
			
	}


}

class Computer {
	String brand;
	
}
