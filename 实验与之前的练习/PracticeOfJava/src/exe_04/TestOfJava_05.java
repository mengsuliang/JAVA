package exe_04;

import java.util.Scanner;

public class TestOfJava_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("��������Ĵ�С:"); 
		int totalNum = input.nextInt(); 
		int[] number = new int[totalNum]; 
		int tmpValue; 
		int i = 0; 
		while (true) { 
			tmpValue = input.nextInt(); 
			number[i] = tmpValue; 
			i++;  
		} 
	}

}
