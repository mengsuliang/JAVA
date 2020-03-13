package exe_01;

import java.util.Scanner;
public class TestOfJava_02 {
	
	public static void main(String[] args) {
		double length,width,height;
		Scanner sc = new Scanner(System.in);
		System.out.println("请分别输入长方体的长：");
		length = sc.nextDouble();
		System.out.println("请分别输入长方体的宽：");
		width = sc.nextDouble();
		System.out.println("请分别输入长方体的高：");
		height = sc.nextDouble();
		Cuboid cuboid = new Cuboid(length,width,height);
		System.out.println("长方体的长为："+cuboid.getLength());
		System.out.println("长方体的宽为："+cuboid.getWidth());
		System.out.println("长方体的高为："+cuboid.getHeight());
		System.out.println("长方体的体积为：" + cuboid.getVolume());
	}
}

//矩形类
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
	
	//计算面积的方法
	public double getArea() {
		return this.length * this.width;
	}
}

//长方体类继承矩形类
class Cuboid extends Rectangle{
	private double height;
	public Cuboid(double length,double width,double height) {
		super(length,width);
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	//计算体积的方法
	public double getVolume() {
		return getArea() * this.height;
	}	
}
