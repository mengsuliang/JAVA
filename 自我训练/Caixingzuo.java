package com.cxample;

import java.util.Calendar;
import java.util.Scanner;

public class Caixingzuo {
	public static void main(String[] args) {//�������
        Start ks = new Start();//���ó���ʼ��Start,������st����
        ks.st();
    }
}

class Start{//����ʼ��
    public void st(){
        System.out.println("�����ո�ʽ��19xx xx xx\n �����������գ�");
        Scanner sr = new Scanner(System.in);
        //�����ꡢ�¡���
        int year = sr.nextInt();
        int month = sr.nextInt();
        int date = sr.nextInt();
        Rq r = new Rq();// �����ܼ���
        r.rq(year,month,date);//�����������ݴ����ܼ����rq������
        Xinz tc = new Xinz();// ����������
        tc.xinz(month,date);//���������ݴ����������xinz������
        System.out.println("\n�Ƿ��������ʦ��������\n1������\t2���˳�");
        Scanner sr1 = new Scanner(System.in);
        int o = sr1.nextInt();
        if (o==1){
            Start qd = new Start();//����1 ���ó���ʼ��
            qd.st();
        }else if (o!=1) {//������1�˳�
            System.out.println("��ʦΪ"+tc.getI()+"�˿�������");
            System.out.println("�˳�������ѯ��Goodbye!");
        }
    }
}

class Rq{//�ܼ���
    public void rq(int year,int month,int date){
        Calendar c = Calendar.getInstance();//��������Calender������
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.DATE,date);
        int week = c.get(Calendar.DAY_OF_WEEK);
        switch (week)
        {
            case 1:
                System.out.println("������");
                break;
            case 2:
                System.out.println("����һ");
                break;
            case 3:
                System.out.println("���ڶ�");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("������");
                break;
            case 7:
                System.out.println("������");
                break;
        }
    }
     }

     class Xinz{//������
      public static int i = 0;//���徲̬����i��iΪͳ�Ƶ�������������
         public void xinz(int month,int data){
             i++;//���ô˷�����������
             switch (month){
                 case 1:{
                     if(data>=20){
                         System.out.println("ˮƿ��");
                     }else {
                         System.out.println("Ħ����");
                     }
                     break;
                 }

                 case 2:{
                     if(data>=19){
                         System.out.println("˫����");
                     }else {
                         System.out.println("ˮƿ��");
                     }
                     break;
                 }

                 case 3:{
                     if(data>=21){
                         System.out.println("������");
                     }else {
                         System.out.println("˫����");
                     }
                     break;
                 }

                 case 4:{
                     if(data>=20){
                         System.out.println("��ţ��");
                     }else {
                         System.out.println("������");
                     }
                     break;
                 }

                 case 5:{
                     if(data>=21){
                         System.out.println("˫����");
                     }else {
                         System.out.println("��ţ��");
                     }
                     break;
                 }

                 case 6:{
                     if (data>=21){
                         System.out.println("��з��");
                     }else {
                         System.out.println("��ţ��");
                     }
                     break;
                 }

                 case 7:{
                     if(data>=23){
                         System.out.println("ʨ����");
                     }else {
                         System.out.println("��з��");
                     }
                     break;
                 }

                 case 8:{
                     if(data>=20){
                         System.out.println("��Ů��");
                     }else {
                         System.out.println("��з��");
                     }
                     break;
                 }

                 case 9:{
                     if(data>=23){
                         System.out.println("�����");
                     }else {
                         System.out.println("��Ů��");
                     }
                     break;
                 }

                 case 10:{
                     if(data>=23){
                         System.out.println("��Ы��");
                     }else {
                         System.out.println("�����");
                     }
                     break;
                 }

                 case 11:{
                     if(data>=22){
                         System.out.println("������");
                     }else {
                         System.out.println("��Ы��");
                     }
                     break;
                 }

                 case 12:{
                     if(data>=22){
                         System.out.println("Ħ����");
                     }else {
                         System.out.println("������");
                     }
                     break;
                 }

             }
         }

         public  int getI() {  //����ͳ�Ƶ��ô���
             return i;
         }
}
