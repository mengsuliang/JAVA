package bbo;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test3 {
	public static void main(String[]args) {
		try {
			//输入流，从键盘输入年龄
			BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
			//提示输入年龄
			System.out.println("请输入年龄：");
			String b= a.readLine();
			//把String型转化为int型
			int age = Integer.parseInt(b);
			if(age>18) {System.out.println("你年龄大于18，要为自己的行为负责！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
