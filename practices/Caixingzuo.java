package com.cxample;

import java.util.Calendar;
import java.util.Scanner;

public class Caixingzuo {
	public static void main(String[] args) {//程序入口
        Start ks = new Start();//调用程序开始类Start,并启用st方法
        ks.st();
    }
}

class Start{//程序开始类
    public void st(){
        System.out.println("年月日格式：19xx xx xx\n 请输入年月日：");
        Scanner sr = new Scanner(System.in);
        //输入年、月、日
        int year = sr.nextInt();
        int month = sr.nextInt();
        int date = sr.nextInt();
        Rq r = new Rq();// 调用周几类
        r.rq(year,month,date);//将年月日数据传给周几类的rq方法中
        Xinz tc = new Xinz();// 调用星座类
        tc.xinz(month,date);//将月日数据传给星座类的xinz方法中
        System.out.println("\n是否继续让巫师看星座？\n1、继续\t2、退出");
        Scanner sr1 = new Scanner(System.in);
        int o = sr1.nextInt();
        if (o==1){
            Start qd = new Start();//输入1 调用程序开始类
            qd.st();
        }else if (o!=1) {//不等于1退出
            System.out.println("巫师为"+tc.getI()+"人看过星座");
            System.out.println("退出星座查询，Goodbye!");
        }
    }
}

class Rq{//周几类
    public void rq(int year,int month,int date){
        Calendar c = Calendar.getInstance();//调用日期Calender抽象类
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.DATE,date);
        int week = c.get(Calendar.DAY_OF_WEEK);
        switch (week)
        {
            case 1:
                System.out.println("星期日");
                break;
            case 2:
                System.out.println("星期一");
                break;
            case 3:
                System.out.println("星期二");
                break;
            case 4:
                System.out.println("星期三");
                break;
            case 5:
                System.out.println("星期四");
                break;
            case 6:
                System.out.println("星期五");
                break;
            case 7:
                System.out.println("星期六");
                break;
        }
    }
     }

     class Xinz{//星座类
      public static int i = 0;//定义静态变量i，i为统计调用人数计数器
         public void xinz(int month,int data){
             i++;//调用此方法计数累器
             switch (month){
                 case 1:{
                     if(data>=20){
                         System.out.println("水瓶座");
                     }else {
                         System.out.println("摩羯座");
                     }
                     break;
                 }

                 case 2:{
                     if(data>=19){
                         System.out.println("双鱼座");
                     }else {
                         System.out.println("水瓶座");
                     }
                     break;
                 }

                 case 3:{
                     if(data>=21){
                         System.out.println("白羊座");
                     }else {
                         System.out.println("双鱼座");
                     }
                     break;
                 }

                 case 4:{
                     if(data>=20){
                         System.out.println("金牛座");
                     }else {
                         System.out.println("白羊座");
                     }
                     break;
                 }

                 case 5:{
                     if(data>=21){
                         System.out.println("双子座");
                     }else {
                         System.out.println("金牛座");
                     }
                     break;
                 }

                 case 6:{
                     if (data>=21){
                         System.out.println("巨蟹座");
                     }else {
                         System.out.println("金牛座");
                     }
                     break;
                 }

                 case 7:{
                     if(data>=23){
                         System.out.println("狮子座");
                     }else {
                         System.out.println("巨蟹座");
                     }
                     break;
                 }

                 case 8:{
                     if(data>=20){
                         System.out.println("处女座");
                     }else {
                         System.out.println("巨蟹座");
                     }
                     break;
                 }

                 case 9:{
                     if(data>=23){
                         System.out.println("天秤座");
                     }else {
                         System.out.println("处女座");
                     }
                     break;
                 }

                 case 10:{
                     if(data>=23){
                         System.out.println("天蝎座");
                     }else {
                         System.out.println("天秤座");
                     }
                     break;
                 }

                 case 11:{
                     if(data>=22){
                         System.out.println("射手座");
                     }else {
                         System.out.println("天蝎座");
                     }
                     break;
                 }

                 case 12:{
                     if(data>=22){
                         System.out.println("摩羯座");
                     }else {
                         System.out.println("射手座");
                     }
                     break;
                 }

             }
         }

         public  int getI() {  //返回统计调用次数
             return i;
         }
}
