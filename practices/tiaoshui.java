package com.cxample;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 1、跳水比赛，8个评委打分。运动员的成绩是8个成绩去掉一个最高分，去掉一个最低分，剩下的6个分数的平均分就是最后得分。使用一维数组实现打分功能。
 * 2、请把打最高分的评委和最低分的评委打出来。
*/

public class tiaoshui {
	public static void main(String[]args) {
		Referee rf = new Referee();
		try {
			while (true) {
				System.out.println("跳水评分系统");
				System.out.println("1、裁判评分");
				System.out.println("2、查看得分");
				System.out.println("3、查看最高分与最低分");
				System.out.println("0、退出");
				Scanner sr =new Scanner(System.in);
				int num = sr.nextInt();
				//裁判评分
				if(num==1) {
					System.out.println("请裁判输入人数:");
					int j = sr.nextInt();
					for(int i=0;i<j;i++) {
						System.out.println("请输入第"+(i+1)+"位裁判名字:");
						String name = sr.next();
						System.out.println(name+"裁判请输入评分:");
						float fraction = sr.nextFloat();
						Dive dive = new Dive(name,fraction);
						rf.addDive(dive);
						System.out.println("第"+(i+1)+"位裁判"+name+"打分为:"+fraction);
					}
				}
				//查看得分
				else if(num==2) {
					rf.View();
				}
				//查看最高分和最低分
				else if(num==3){
					rf.Cal();
				}
				//退出系统
				else if(num==0){
					System.out.println("已正常退出系统");
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
	//构造函数，初始化成员变量
	public Referee() {
		a1 = new ArrayList<Dive>();
	}
	
	//加入裁判
	public void addDive(Dive dive) {
		a1.add(dive);
	}
	
	//查看选手得分
	public void View() {
		float allnum=0f,pjnum=0f;
		//遍历
		for(int i=0;i<a1.size()-1;i++) {
			for(int j=1;j<a1.size()-i;j++) {
				Dive dive1 = a1.get(j-1);
				Dive dive2 = a1.get(j);
				//排序
				if(dive1.getFraction()<dive2.getFraction()) {
					a1.set(j,dive1);
					a1.set(j-1,dive2);
				}
			}
		}
		
		//去掉最高分和最低分，得出选手得分
		for(int i=1;i<a1.size()-1;i++){
			Dive dive=a1.get(i);
			allnum=dive.getFraction()+allnum;
		}
		pjnum=allnum/(a1.size()-2);
		System.out.println("跳水选手得分为："+pjnum);
	}	
	//找出最高分和最低分
	public void Cal(){
		//遍历
		for(int i=0;i<a1.size()-1;i++){
			for(int j=1;j<a1.size()-i;j++){
				Dive dive1=a1.get(j-1);
				Dive dive2=a1.get(j);
				//排序
				if(dive1.getFraction()<dive2.getFraction()){
					a1.set(j, dive1);
					a1.set(j-1, dive2);
				}
			}
		}
		//找出最高分与最低分
		for (int i = 1; i < a1.size()-1; i++) {
			if(i==0) {
				Dive dive=a1.get(i);
				System.out.println("打分最高的裁判是:"+dive.getName()+"\t分数为:"+dive.getFraction());
			}else if (i==a1.size()-1) {
				Dive dive=a1.get(i);
				System.out.println("打分最低的裁判是:"+dive.getName()+"\t分数为:"+dive.getFraction());
			}
		}
		
		
	}
	
	}

//裁判信息类
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
