package exe_01;

import java.util.Scanner;
public class TestOfJava_02 {
	
	public static void main(String[] args) {
		double length,width,height;
		Scanner sc = new Scanner(System.in);
		System.out.println("��ֱ����볤����ĳ���");
		length = sc.nextDouble();
		System.out.println("��ֱ����볤����Ŀ�");
		width = sc.nextDouble();
		System.out.println("��ֱ����볤����ĸߣ�");
		height = sc.nextDouble();
		Cuboid cuboid = new Cuboid(length,width,height);
		System.out.println("������ĳ�Ϊ��"+cuboid.getLength());
		System.out.println("������Ŀ�Ϊ��"+cuboid.getWidth());
		System.out.println("������ĸ�Ϊ��"+cuboid.getHeight());
		System.out.println("����������Ϊ��" + cuboid.getVolume());
	}
}

//������
class Rectangle{
	private double length;
	private double width;
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
	}
	public double getLength() {
		return this.length;
	}
	public double getWidth() {
		return this.width;
	}
	
	//��������ķ���
	public double getArea() {
		return this.length * this.width;
	}
}

//��������̳о�����
class Cuboid extends Rectangle{
	private double height;
	public Cuboid(double length,double width,double height) {
		super(length,width);
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	//��������ķ���
	public double getVolume() {
		return getArea() * this.height;
	}	
}
