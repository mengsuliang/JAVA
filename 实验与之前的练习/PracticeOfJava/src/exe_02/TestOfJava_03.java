package exe_02;

import java.util.Scanner;

public class TestOfJava_03 {
	public static void main(String[] args) { 
		int i = 0, maxIndex = 0, minIndex = 0, check = -1;  
		String tmpStudentName;
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("����ѧ����������");
		num = input.nextInt();
		double[] javaScore = new double[num]; 
		String[] studentName = new String[num];
		for (i = 0; i < num; i++) {
			System.out.println("����" + (i + 1) + "��ѧ��������:"); 
			studentName[i] = input.next(); 
			System.out.println("����" + (i + 1) + "��ѧ���ĳɼ�:"); 
			javaScore[i] = input.nextDouble(); 
		}
		//�ҳ�Java�ɼ���ߺ�Java�ɼ����
		for (i = 1; i < num; i++) { 
			if (javaScore[i] > javaScore[maxIndex]) { 
				maxIndex = i; 
			} else if (javaScore[i] < javaScore[minIndex]) { 
				minIndex = i; 
			}
		} 
		//��ӡ�ɼ������
		for (i = 0; i < num; i++) { 
			if (javaScore[i] == javaScore[maxIndex]) {  
				System.out.println("Java��߷�ѧ��Ϊ:" + studentName[i] + " ����Ϊ:" + javaScore[i]);  
			} 	 
		} 
		//��ӡ�ɼ������
		for (i = 0; i < num; i++) {  
			if (javaScore[i] == javaScore[minIndex]) { 
				System.out.println("Java��ͷ�ѧ��Ϊ:" + studentName[i] + " ����Ϊ:" + javaScore[i]); 
			}  
		} 
		while (true) { 
			System.out.println("����Ҫ��ѯ��ѧ������������ exit �˳���:"); 
			tmpStudentName = input.next(); 
			if(tmpStudentName.equals("exit")) break ;  
				for (i = 0; i < num; i++) { 
					if (tmpStudentName.equals(studentName[i])) { 
						System.out.println(tmpStudentName + " �ĳɼ�Ϊ��" + javaScore[i]); 
						check = 1;  
						break;  
					}  
			}  
			if (check == -1) { 
				System.out.println("��ѧ�������ڣ�");  
			}  
			check = -1; 
		} 
	}
}