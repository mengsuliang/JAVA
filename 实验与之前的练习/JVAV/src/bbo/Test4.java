package bbo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test4 {
	public static void main(String[]args) {
		int i;
		try {
			//��ʾ�����ַ�
			System.out.println("��������7���ַ���a~g����");
			//���������Ӽ�������
			BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
			for(i=0;i<=7;i++) {
				
			String k = a.readLine();
			//��String��ת��Ϊchar�ͣ�Ҫʹ��char����
			char j = k.charAt(0);
			 if(j=='a') {System.out.println("����һ");}
				else if(j=='b') {System.out.println("���ڶ�");}
				else if(j=='c') {System.out.println("������");}
				else if(j=='d'){System.out.println("������");}
				else if(j=='e') {System.out.println("������");}
				else if(j=='f') {System.out.println("������");}
				else if(j=='g') {System.out.println("������");}
				else {System.out.println("��������!");
				}	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		

}
