package sxt;

import java.util.Scanner;

public class CaiQuanYouxi {

	public static void main(String[] args) {
		Kais.jingcyx();//���ÿ�ʼ��Ϸ

	}

}
//��ʼ�˳���Ϸ��
class Kais{
	public static void jingcyx() {
		System.out.println("�Ƿ�ʼ��ȭ��Ϸ?��1��ʼ����0�˳�");
		Scanner sr = new Scanner(System.in);
		int x = sr.nextInt();
		switch (x) {
		case 0:
			System.out.println("���˳���Ϸ��");
			break;
		case 1:
			System.out.println("��Ϸ˵����0����ʯͷ��1���������2����");
			Caiquan.caiquan();
			break;
		default:
			System.out.println("����������������룡");
			Kais.jingcyx();
			break;
		}
	}
}

//��ȭ��Ϸ
class Caiquan{
	public static void caiquan() {
		int a1 = 0,b1 = 0,c1 = 0;
		System.out.println("�����������������");
		Scanner p = new Scanner(System.in);
		int ps = p.nextInt();
		for(int i=1;i<=ps;i++) {
			System.out.println("��Ϸ�ѿ�ʼ�����ȭ��");
			Scanner m = new Scanner(System.in);
			int a = m.nextInt();//��ҳ�ȭ
			//Random n = new Random(2);//�������
			int b = (int) (0+Math.random()*(3-1+1));//�������0-2��int�������Գ�ȭ
			if(a==b) {
				a1++;
				System.out.println("��ƽ��");
			}else if((a-b)==-1 || (a-b)==2) {
				b1++;
				System.out.println("��Ӯ�ˣ�");
			}else {
				c1++;
				System.out.println("�����ˣ�");
			}	
		}
		
		System.out.println("ƽ:"+a1+"\nӮ:"+b1+"\n��:"+c1+"\nһ������"+(a1+b1+c1)+"��");
		Kais.jingcyx();
	}
}
