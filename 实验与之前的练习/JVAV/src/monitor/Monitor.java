package monitor;

import java.util.Scanner;

public class Monitor {
	public static void main(String[] args) {
	       Start s = new Start();
	       s.start();
	    }
	}

	class Start{
	    public void start(){
	        //�趨ͶƱ����
	        System.out.println("�趨ͶƱ������");
	        Scanner sr = new Scanner(System.in);
	        int a = sr.nextInt();
	        System.out.println("�������һλ��ѡ�˵����֣�\n");
	        Scanner sr1 = new Scanner(System.in);
	        String i1 = sr1.nextLine();//���̽����ַ���
	        System.out.println("������ڶ�λ��ѡ�˵����֣�\n");
	        Scanner sr2 = new Scanner(System.in);
	        String i2 = sr2.nextLine();
	        System.out.println("���������λ��ѡ�˵����֣�\n");
	        Scanner sr3 = new Scanner(System.in);
	        String i3 = sr3.nextLine();
	        System.out.println("����ѡ�ٽ���"+a+"�˲��룡");
	        System.out.println("1��"+i1+"\t2��"+i2+"\t3��"+i3);
	        Xuanju t = new Xuanju();
	        t.tp(a,i1,i2,i3);
	    }
	}

	class Xuanju{
	    public void tp(int a,String i1,String i2,String i3){
	        int j1=0,j2=0,j3=0,qq=0;//��Ʊ��
	        for(int i=1;i<=a;i++){//ͳ��ͶƱ
	            System.out.println("��ͶƱ��ͶƱ�밴1,2,3");
	            Scanner tp = new Scanner(System.in);
	            int b = tp.nextInt();
	            System.out.println("����"+i+"��ͶƱ");
	            switch (b){
	                case 1:
	                    j1++;
	                    break;
	                case 2:
	                    j2++;
	                    break;
	                case 3:
	                    j3++;
	                    break;
	                    default:
	                        qq++;
	                        break;
	            }
	        }
	        if (j1>j2 && j1>j3){
	            System.out.println(i1+"��"+j1+"Ʊ\n"+i2+"��"+j2+"Ʊ\n"+i3+"��"+j3+"Ʊ\n"+"��ȨƱ��"+qq);
	            System.out.println("��ϲ"+i1+"��ѡ�೤");
	        }else if(j1<j2 && j2>j3){
	            System.out.println(i1+"��"+j1+"Ʊ\n"+i2+"��"+j2+"Ʊ\n"+i3+"��"+j3+"Ʊ\n"+"��ȨƱ��"+qq);
	            System.out.println("��ϲ"+i2+"��ѡ�೤");
	        }else if(j3>j1 && j2<j3){
	            System.out.println(i1+"��"+j1+"Ʊ\n"+i2+"��"+j2+"Ʊ\n"+i3+"��"+j3+"Ʊ\n"+"��ȨƱ��"+qq);
	            System.out.println("��ϲ"+i3+"��ѡ�೤");
	        }else{
	            System.out.println(i1+"��"+j1+"Ʊ\n"+i2+"��"+j2+"Ʊ\n"+i3+"��"+j3+"Ʊ\n"+"��ȨƱ��"+qq);
	            System.out.println("��ͬ��Ʊ����ͶƱ��Ч����ͶƱ��");
	            Start s = new Start();
	            s.start();
	        }
	    }	

}
