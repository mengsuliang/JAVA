package sxt;

class people{
	/*
	 * ���췽����1��������������һ��     2���޷���ֵ     3���Զ�ִ��     4��������
	 */
	
	public people(int a,String n) {
		int age=a;
		String name=n;
		 System.out.println("����:"+name+"   ����:"+age);
	}
	//���췽��������
	public people(String n) {
		String name = n;
		System.out.println("����:"+name);
	}
	
}

public class Fh {
	public static void main(String []args) {
		people p = new people(18, "����");
		people s =new people("С����");
	}
	

}
