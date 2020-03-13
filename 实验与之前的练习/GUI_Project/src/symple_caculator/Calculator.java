package symple_caculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 1800300404蒙素靓 2019/11/11
 */
public class Calculator extends JFrame {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setSize(400, 500);
	}
	
	String mainTitle;
	
	JPanel mainPanel;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	JPanel panel6;
	
	JLabel title;	
	JLabel operation1;
	JLabel operation2;
	JLabel result;
	
	JTextField txt1;
	JTextField txt2;
	JTextField txt3;
	
	JButton addButton;
	JButton subButton;
	JButton allResetButton;
	
	MyActionListener listener;
	
	public Calculator() 
	{
		init();
	}
	
	private void init() {
		
		mainTitle = "简易计算器";
		
		mainPanel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		
		title = new JLabel("简易计算器");
		operation1 = new JLabel("运算数一");
		operation2 = new JLabel("运算数二");
		result = new JLabel("运算结果");
		
		txt1 = new JTextField(20);
		txt2 = new JTextField(20);
		txt3 = new JTextField(20);
		
		addButton = new JButton("相加");
		subButton = new JButton("相减");
		allResetButton = new JButton("全部清零");
		
		listener = new MyActionListener();
		
		setTitle(mainTitle);
		
		mainPanel.setLayout(new GridLayout(6,1));//顶层容器设为网格布局
		add(mainPanel);
		mainPanel.add(panel1);
		mainPanel.add(panel2);
		mainPanel.add(panel3);
		mainPanel.add(panel4);
		mainPanel.add(panel5);
		mainPanel.add(panel6);
		
		panel1.setLayout(new FlowLayout());
		panel1.add(title);
		
		panel2.setLayout(new FlowLayout());
		panel2.add(operation1);
		panel2.add(txt1);
		
		panel3.setLayout(new FlowLayout());
		panel3.add(operation2);
		panel3.add(txt2);
		
		panel4.setLayout(new FlowLayout());
		panel4.add(result);
		panel4.add(txt3);
		
		panel5.setLayout(new FlowLayout());
		panel5.add(addButton);
		panel5.add(subButton);
		
		panel6.setLayout(new FlowLayout());
		panel6.add(allResetButton);
		
		//监听按钮
		addButton.addActionListener(listener);
		subButton.addActionListener(listener);
		allResetButton.addActionListener(listener);
		
		pack();//屏幕适配
		setInScreenCenter();// 设置当前窗口处于屏幕正中
//		setResizable(false);//禁止窗口伸缩
		setVisible(true);	
	}
	
	/**
	 * 设置当前窗口处于屏幕正中
	 * 
	 */
	private void setInScreenCenter() {
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension ds=tk.getScreenSize();
		int x=(ds.width-this.getWidth())/2;
		int y=(ds.height-this.getHeight())/2;
		this.setLocation(x,y);	
	}
	
	class MyActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			String s1 = txt1.getText();
			String s2 = txt2.getText();
			boolean isDigit1 = false;//判断运算数一含有非法字符的标记
			boolean isDigit2 = false;//判断运算数二含有非法字符的标记
			for (int i = 0; i < s1.length(); i++) {
				if (!Character.isDigit(s1.charAt(i)) && (s1.charAt(i) != 46)) {//判断不是数字且不是小数点
					isDigit1 = true;
					break;
				}
				
			}
			for (int i = 0; i < s2.length(); i++) {
				if (!Character.isDigit(s2.charAt(i)) && (s2.charAt(i) != 46)) {//判断不是数字且不是小数点
					isDigit2 = true;
					break;
				}
			}
			
			if(e.getSource()==addButton) {//相加操作
				
				int count1 = 0;
				int count2 = 0;
				int startFlag1 = 0;
				int startFlag2 = 0;
				int endFlag1 = 0;
				int endFlag2 = 0;
				for(int i = 0;i < s1.length();i++){
					if (i == 0) {
						if (s1.charAt(i)=='.') {
							startFlag1 = 1;
						}
					}
		            if(s1.charAt(i) == '.'){
		                count1 ++ ;
		                continue;
		            }
		            if (i== s1.length()-2) {
						if (s1.charAt(i)=='.') {
							endFlag1 = 1;
						}
					}
		        }
		        for (int j = 0; j < s2.length(); j++) {
		        	if (j == 0) {
						if (s2.charAt(j)=='.') {
							startFlag2 = 1;
						}
					}
		        	if(s2.charAt(j) == '.'){
		                count2 ++ ;
		                continue;
		        	}
		        	if (j== s2.length()-2) {
						if (s1.charAt(j)=='.') {
							endFlag2 = 1;
						}
					}
				}
				if ((s1.equals("") || s2.equals("")) || (s1.equals("") && s2.equals(""))) {
					JOptionPane.showMessageDialog(null, "运算数要输入完整！");
				}else if (isDigit1 || isDigit2) {
					JOptionPane.showMessageDialog(null, "运算数不得包含小数点和数字以外的其他字符！");
				}else if ((count1 > 1) || (count2 > 1)) {
					JOptionPane.showMessageDialog(null, "小数点只能为一个！");
				}else if ((startFlag1 == 1)||(startFlag2 == 1)) {
					JOptionPane.showMessageDialog(null, "小数点不能位于开头！");
				}else if ((endFlag1 == 1)||(endFlag2 == 1)) {
					JOptionPane.showMessageDialog(null, "小数点不能位于结尾！");
				}else {
					double num1 = Double.parseDouble(s1);
					double num2 = Double.parseDouble(s2);
					double num3 = num1 + num2;
					txt3.setText(Double.toString(num3));
				}

			}
			
			if (e.getSource()==subButton) {//相减操作
				int count3 = 0;
				int count4 = 0;
				int startFlag3 = 0;
				int startFlag4 = 0;
				int endFlag3 = 0;
				int endFlag4 = 0;
				for(int i1 = 0;i1 < s1.length();i1++){
					if (i1 == 0) {
						if (s1.charAt(i1)=='.') {
							startFlag3 = 1;
						}
					}
		            if(s1.charAt(i1) == '.'){
		                count3 ++ ;
		                continue;
		            }
		            if (i1== s1.length()-2) {
						if (s1.charAt(i1)=='.') {
							endFlag3 = 1;
						}
					}
		        }
		        for (int j1 = 0; j1 < s2.length(); j1++) {
		        	if (j1 == 0) {
						if (s2.charAt(j1)=='.') {
							startFlag4 = 1;
						}
					}
		        	if(s2.charAt(j1) == '.'){
		                count4 ++ ;
		                continue;
		        	}
		        	if (j1== s2.length()-2) {
						if (s2.charAt(j1)=='.') {
							endFlag4 = 1;
						}
					}
				}
		        
				if ((s1.equals("") || s2.equals("")) || (s1.equals("") && s2.equals(""))) {
					JOptionPane.showMessageDialog(null, "运算数要输入完整！");
				}else if (isDigit1 || isDigit2) {
					JOptionPane.showMessageDialog(null, "运算数不得包含小数点和数字以外的其他字符！");
				}else if ((count3 > 1) || (count4 > 1)) {
					JOptionPane.showMessageDialog(null, "小数点只能为一个！");	
				}else if ((startFlag3 == 1)||(startFlag4 == 1)) {
					JOptionPane.showMessageDialog(null, "小数点不能位于开头！");
				}else if ((endFlag3 == 1)||(endFlag4 == 1)) {
					JOptionPane.showMessageDialog(null, "小数点不能位于结尾！");
				}else {
					double num1 = Double.parseDouble(s1);
					double num2 = Double.parseDouble(s2);
					double num3 = num1 - num2;
					txt3.setText(Double.toString(num3));
				}
				
			}
			
			if (e.getSource()==allResetButton) {//全部清零操作
				txt1.setText("");
				txt2.setText("");
				txt3.setText("");
			}
			
		}
		
	}
}
