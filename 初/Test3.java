package bbo;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test3 {
	public static void main(String[]args) {
		try {
			//���������Ӽ�����������
			BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
			//��ʾ��������
			System.out.println("���������䣺");
			String b= a.readLine();
			//��String��ת��Ϊint��
			int age = Integer.parseInt(b);
			if(age>18) {System.out.println("���������18��ҪΪ�Լ�����Ϊ����");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
