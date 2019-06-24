package bbo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test4 {
	public static void main(String[]args) {
		int i;
		try {
			//提示输入字符
			System.out.println("任意输入7个字符（a~g）：");
			//输入流，从键盘输入
			BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
			for(i=0;i<=7;i++) {
				
			String k = a.readLine();
			//把String型转换为char型，要使用char数组
			char j = k.charAt(0);
			 if(j=='a') {System.out.println("星期一");}
				else if(j=='b') {System.out.println("星期二");}
				else if(j=='c') {System.out.println("星期三");}
				else if(j=='d'){System.out.println("星期四");}
				else if(j=='e') {System.out.println("星期五");}
				else if(j=='f') {System.out.println("星期六");}
				else if(j=='g') {System.out.println("星期天");}
				else {System.out.println("输入有误!");
				}	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		

}
