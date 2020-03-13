package exe_02;

import java.util.Scanner;

public class TestOfJava_03 {
	public static void main(String[] args) { 
		int i = 0, maxIndex = 0, minIndex = 0, check = -1;  
		String tmpStudentName;
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("输入学生的总数：");
		num = input.nextInt();
		double[] javaScore = new double[num]; 
		String[] studentName = new String[num];
		for (i = 0; i < num; i++) {
			System.out.println("输入" + (i + 1) + "号学生的姓名:"); 
			studentName[i] = input.next(); 
			System.out.println("输入" + (i + 1) + "号学生的成绩:"); 
			javaScore[i] = input.nextDouble(); 
		}
		//找出Java成绩最高和Java成绩最低
		for (i = 1; i < num; i++) { 
			if (javaScore[i] > javaScore[maxIndex]) { 
				maxIndex = i; 
			} else if (javaScore[i] < javaScore[minIndex]) { 
				minIndex = i; 
			}
		} 
		//打印成绩最高者
		for (i = 0; i < num; i++) { 
			if (javaScore[i] == javaScore[maxIndex]) {  
				System.out.println("Java最高分学生为:" + studentName[i] + " 分数为:" + javaScore[i]);  
			} 	 
		} 
		//打印成绩最低者
		for (i = 0; i < num; i++) {  
			if (javaScore[i] == javaScore[minIndex]) { 
				System.out.println("Java最低分学生为:" + studentName[i] + " 分数为:" + javaScore[i]); 
			}  
		} 
		while (true) { 
			System.out.println("输入要查询的学生姓名（输入 exit 退出）:"); 
			tmpStudentName = input.next(); 
			if(tmpStudentName.equals("exit")) break ;  
				for (i = 0; i < num; i++) { 
					if (tmpStudentName.equals(studentName[i])) { 
						System.out.println(tmpStudentName + " 的成绩为：" + javaScore[i]); 
						check = 1;  
						break;  
					}  
			}  
			if (check == -1) { 
				System.out.println("该学生不存在！");  
			}  
			check = -1; 
		} 
	}
}