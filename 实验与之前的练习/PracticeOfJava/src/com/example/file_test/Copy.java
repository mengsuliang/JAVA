package com.example.file_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Copy {
	public static void main(String[] args) {		
		int c;		
		byte buf[]=new byte[10]; //����һ���ֽڻ�����		
		File file = new File("test.txt");
		try {
			file.createNewFile();
			System.out.println("�ļ������ɹ�");
		} catch (IOException e1) {
			System.out.println("�ļ�δ�����ɹ�");
		}
		File newFile = new File("newTest.txt");		
		try{			
			FileInputStream fis=new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(newFile);		
			while((c = fis.read(buf))!=-1){	
				fos.write(buf, 0, c);
			}
			fos.flush();
	        fis.close();
	        fos.close(); 
         
         }
		catch (IOException e) {
		e.printStackTrace();
		}  		
		
	} 
	
}

