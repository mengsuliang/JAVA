package sxt;

import java.util.Scanner;

public class CaiQuanYouxi {

	public static void main(String[] args) {
		Kais.jingcyx();//调用开始游戏

	}

}
//开始退出游戏类
class Kais{
	public static void jingcyx() {
		System.out.println("是否开始猜拳游戏?按1开始，按0退出");
		Scanner sr = new Scanner(System.in);
		int x = sr.nextInt();
		switch (x) {
		case 0:
			System.out.println("已退出游戏！");
			break;
		case 1:
			System.out.println("游戏说明：0代表石头，1代表剪刀，2代表布");
			Caiquan.caiquan();
			break;
		default:
			System.out.println("输入错误，请重新输入！");
			Kais.jingcyx();
			break;
		}
	}
}

//猜拳游戏
class Caiquan{
	public static void caiquan() {
		int a1 = 0,b1 = 0,c1 = 0;
		System.out.println("请输入想玩的盘数：");
		Scanner p = new Scanner(System.in);
		int ps = p.nextInt();
		for(int i=1;i<=ps;i++) {
			System.out.println("游戏已开始，请出拳！");
			Scanner m = new Scanner(System.in);
			int a = m.nextInt();//玩家出拳
			//Random n = new Random(2);//随机函数
			int b = (int) (0+Math.random()*(3-1+1));//随机产生0-2的int数，电脑出拳
			if(a==b) {
				a1++;
				System.out.println("打平！");
			}else if((a-b)==-1 || (a-b)==2) {
				b1++;
				System.out.println("你赢了！");
			}else {
				c1++;
				System.out.println("你输了！");
			}	
		}
		
		System.out.println("平:"+a1+"\n赢:"+b1+"\n输:"+c1+"\n一共玩了"+(a1+b1+c1)+"局");
		Kais.jingcyx();
	}
}
