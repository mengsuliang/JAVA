package bbo;
import java.io.*;
public class Test {
	public static void main(String[]args)
	{
		 try {
			//輸入流，从键盘接受数
			 InputStreamReader isr = new InputStreamReader(System.in);
			 BufferedReader br = new BufferedReader(isr);
			 //给出提示
			 System.out.println("请输入第一个数");
			 //从控制台读取一行数据
			 String a1 = br.readLine();
			 System.out.println("请输入第二个数");
			 String a2 = br.readLine();
			 //把String转为float
			 float num1 = Float.parseFloat(a1);
			 float num2 = Float.parseFloat(a2);
			 if(num1>num2) {System.out.println("第一个数大");}
			 if(num1==num2) {System.out.println("相等");}
			 if(num1<num2) {System.out.println("第二个数大");}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
