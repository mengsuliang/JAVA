package practice;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

import org.omg.CORBA_2_3.portable.OutputStream;
public class TestOfJava_1 {
	public static void main(String[] args) {
		
		File file = new File("hello.txt");
		
		if (file.exists()) {
			
			System.out.println("�Ƿ����ļ���"+file.isFile());//�ж��Ƿ����ļ�
			System.out.println("�Ƿ���·����"+file.isDirectory());//�ж��Ƿ���·�����ļ��У�
			System.out.println("�ļ�����"+file.getName());
			System.out.println("�ļ�·����"+file.getPath());
			System.out.println("�ļ�����·����"+file.getAbsolutePath());
			System.out.println("�ļ�������"+new File(file.getAbsoluteFile().getParent()));
//			file.setReadable(false);
//			file.setWritable(true);
//			file.setReadOnly();
			System.out.println("�ļ��Ƿ�ɶ���"+file.canRead());
			System.out.println("�ļ��Ƿ��д��"+file.canWrite());
//			System.out.println("�ļ��Ƿ����أ�"+file.isHidden());
//			System.out.println("����޸�ʱ�䣺"+file.lastModified());
//			file.delete();
//			System.out.println("�ļ�ɾ���ɹ�");
			try {
				FileInputStream fis = new FileInputStream(file);//�����ļ�������
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");//�����ļ���������Reader
				BufferedReader br = new BufferedReader(isr);//�������л����������
				
				String line;
				while ((line=br.readLine())!= null) {
					System.out.println(line);
				}
				
				br.close();
				isr.close();
				fis.close();	
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				
				File newFile = new File("newFile.txt");
				FileOutputStream fos = new FileOutputStream(newFile);
				OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
				BufferedWriter bw = new BufferedWriter(osw);
				
				bw.write("���������������������֮��������� ");
				bw.write("���������������������; ���뷨���� �ڶ������ 4 �� 6 ����С ���Բ����� 6 ��������;");
				bw.write(" ��������� 8 �� 6 ���Ĵ� ���Բ����� 6 ��������; ");
				bw.write(" ���ĸ���� 5 ��6 ����С �Ƚ���������Ȼ��� 4�Ƚ�, 5 ��4 �� ���Բ����� 4 ...");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}else {
			
			System.out.println("�ļ�������");
			
			try {
				
				file.createNewFile();
				System.out.println("�ļ����ɹ�����");
				
			} catch (IOException e) {
				System.out.println("�ļ��޷������ɹ�");
			}
			
		}
	}
}

