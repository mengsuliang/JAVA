package bbo;
import java.io.*;
public class Test {
	public static void main(String[]args)
	{
		 try {
			//ݔ�������Ӽ��̽�����
			 InputStreamReader isr = new InputStreamReader(System.in);
			 BufferedReader br = new BufferedReader(isr);
			 //������ʾ
			 System.out.println("�������һ����");
			 //�ӿ���̨��ȡһ������
			 String a1 = br.readLine();
			 System.out.println("������ڶ�����");
			 String a2 = br.readLine();
			 //��StringתΪfloat
			 float num1 = Float.parseFloat(a1);
			 float num2 = Float.parseFloat(a2);
			 if(num1>num2) {System.out.println("��һ������");}
			 if(num1==num2) {System.out.println("���");}
			 if(num1<num2) {System.out.println("�ڶ�������");}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
