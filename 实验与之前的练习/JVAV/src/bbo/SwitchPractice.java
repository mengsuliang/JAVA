package bbo;
import java.io.*;
import java.util.zip.InflaterInputStream;

public class SwitchPractice {
	public static void main(String[]args) {
		int i; 
		try {
			//���������Ӽ�������
			BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
			//��ʾ�����ַ�
			System.out.println("��������1���ַ���a~g����");
			String k = a.readLine();
			switch (k) {
			case "a":
				System.out.println("����һ");
				break;
			case "b":
				System.out.println("���ڶ�");
				break;
			case "c":
				System.out.println("������");
				break;
			case "d":
				System.out.println("������");
				break;
			case "e":
				System.out.println("������");
				break;
			case "f":
				System.out.println("������");
				break;
			case "g":
				System.out.println("������");
				break;

			default:
				System.out.println("��������!");
				break;
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
