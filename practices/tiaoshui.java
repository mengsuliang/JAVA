package com.cxample;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1����ˮ������8����ί��֡��˶�Ա�ĳɼ���8���ɼ�ȥ��һ����߷֣�ȥ��һ����ͷ֣�ʣ�µ�6��������ƽ���־������÷֡�ʹ��һά����ʵ�ִ�ֹ��ܡ�
 * 2����Ѵ���߷ֵ���ί����ͷֵ���ί�������
*/

public class tiaoshui {
	public static void main(String[]args) {
		Referee rf = new Referee();
		try {
			while (true) {
				System.out.println("��ˮ����ϵͳ");
				System.out.println("1����������");
				System.out.println("2���鿴�÷�");
				System.out.println("3���鿴��߷�����ͷ�");
				System.out.println("0���˳�");
				Scanner sr =new Scanner(System.in);
				int num = sr.nextInt();
				//��������
				if(num==1) {
					System.out.println("�������������:");
					int j = sr.nextInt();
					for(int i=0;i<j;i++) {
						System.out.println("�������"+(i+1)+"λ��������:");
						String name = sr.next();
						System.out.println(name+"��������������:");
						float fraction = sr.nextFloat();
						Dive dive = new Dive(name,fraction);
						rf.addDive(dive);
						System.out.println("��"+(i+1)+"λ����"+name+"���Ϊ:"+fraction);
					}
				}
				//�鿴�÷�
				else if(num==2) {
					rf.View();
				}
				//�鿴��߷ֺ���ͷ�
				else if(num==3){
					rf.Cal();
				}
				//�˳�ϵͳ
				else if(num==0){
					System.out.println("�������˳�ϵͳ");
					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Referee{
	private ArrayList<Dive> a1=null;
	//���캯������ʼ����Ա����
	public Referee() {
		a1 = new ArrayList<Dive>();
	}
	
	//�������
	public void addDive(Dive dive) {
		a1.add(dive);
	}
	
	//�鿴ѡ�ֵ÷�
	public void View() {
		float allnum=0f,pjnum=0f;
		//����
		for(int i=0;i<a1.size()-1;i++) {
			for(int j=1;j<a1.size()-i;j++) {
				Dive dive1 = a1.get(j-1);
				Dive dive2 = a1.get(j);
				//����
				if(dive1.getFraction()<dive2.getFraction()) {
					a1.set(j,dive1);
					a1.set(j-1,dive2);
				}
			}
		}
		
		//ȥ����߷ֺ���ͷ֣��ó�ѡ�ֵ÷�
		for(int i=1;i<a1.size()-1;i++){
			Dive dive=a1.get(i);
			allnum=dive.getFraction()+allnum;
		}
		pjnum=allnum/(a1.size()-2);
		System.out.println("��ˮѡ�ֵ÷�Ϊ��"+pjnum);
	}	
	//�ҳ���߷ֺ���ͷ�
	public void Cal(){
		//����
		for(int i=0;i<a1.size()-1;i++){
			for(int j=1;j<a1.size()-i;j++){
				Dive dive1=a1.get(j-1);
				Dive dive2=a1.get(j);
				//����
				if(dive1.getFraction()<dive2.getFraction()){
					a1.set(j, dive1);
					a1.set(j-1, dive2);
				}
			}
		}
		//�ҳ���߷�����ͷ�
		for (int i = 1; i < a1.size()-1; i++) {
			if(i==0) {
				Dive dive=a1.get(i);
				System.out.println("�����ߵĲ�����:"+dive.getName()+"\t����Ϊ:"+dive.getFraction());
			}else if (i==a1.size()-1) {
				Dive dive=a1.get(i);
				System.out.println("�����͵Ĳ�����:"+dive.getName()+"\t����Ϊ:"+dive.getFraction());
			}
		}
		
		
	}
	
	}

//������Ϣ��
class Dive{
	private String name;
	private float fraction;
	public Dive (String name,float fraction){
		this.name=name;
		this.fraction=fraction;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFraction(){
		return fraction;
	}
	public void setFraction(float fraction) {
		this.fraction=fraction;
	}	
	
}
