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
			
			System.out.println("是否是文件："+file.isFile());//判断是否是文件
			System.out.println("是否是路径："+file.isDirectory());//判断是否是路径（文件夹）
			System.out.println("文件名："+file.getName());
			System.out.println("文件路径："+file.getPath());
			System.out.println("文件绝对路径："+file.getAbsolutePath());
			System.out.println("文件父级："+new File(file.getAbsoluteFile().getParent()));
//			file.setReadable(false);
//			file.setWritable(true);
//			file.setReadOnly();
			System.out.println("文件是否可读："+file.canRead());
			System.out.println("文件是否可写："+file.canWrite());
//			System.out.println("文件是否隐藏："+file.isHidden());
//			System.out.println("最后修改时间："+file.lastModified());
//			file.delete();
//			System.out.println("文件删除成功");
			try {
				FileInputStream fis = new FileInputStream(file);//创建文件输入流
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");//创建文件输入流的Reader
				BufferedReader br = new BufferedReader(isr);//创建带有缓冲的输入流
				
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
				
				bw.write("二叉排序树就是中序遍历之后是有序的 ");
				bw.write("构造二叉排序树步骤如下; 插入法构造 第二个结点 4 比 6 来的小 所以插入在 6 的左子树;");
				bw.write(" 第三个结点 8 比 6 来的大 所以插入在 6 的右子树; ");
				bw.write(" 第四个结点 5 比6 来得小 先进入左子树然后跟 4比较, 5 比4 大 所以插入在 4 ...");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}else {
			
			System.out.println("文件不存在");
			
			try {
				
				file.createNewFile();
				System.out.println("文件被成功创建");
				
			} catch (IOException e) {
				System.out.println("文件无法创建成功");
			}
			
		}
	}
}

