package bbo;
import java.io.*;
import java.util.zip.InflaterInputStream;

public class SwitchPractice {
	public static void main(String[]args) {
		int i; 
		try {
			//输入流，从键盘输入
			BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
			//提示输入字符
			System.out.println("任意输入1个字符（a~g）：");
			String k = a.readLine();
			switch (k) {
			case "a":
				System.out.println("星期一");
				break;
			case "b":
				System.out.println("星期二");
				break;
			case "c":
				System.out.println("星期三");
				break;
			case "d":
				System.out.println("星期四");
				break;
			case "e":
				System.out.println("星期五");
				break;
			case "f":
				System.out.println("星期六");
				break;
			case "g":
				System.out.println("星期天");
				break;

			default:
				System.out.println("输入有误!");
				break;
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
