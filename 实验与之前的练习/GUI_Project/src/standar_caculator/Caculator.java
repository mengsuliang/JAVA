package standar_caculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.util.Stack;

import javax.swing.JTextArea;

public class Caculator extends JFrame{

	private JPanel contentPane;
	private JButton M1_Button;
	private JPanel menuPanel;
	private JPanel showProcessPanel;
	private JPanel operatePanel;
	private JMenuBar viewMenuBar;
	private JMenuBar editMenuBar;
	private JMenuBar helpMenuBar;
	private JMenu viewMenu;
	private JMenu editMenu;
	private JMenu helpMenu;
	private JMenuItem historyMenuItem;
	private JMenuItem settingMenuItem;
	private JMenuItem deleteAllMenuItem;
	private JMenuItem backupMenuItem;
	private JMenuItem helpUseingMenuItem;
	private JMenuItem contactMenuItem;
	private JTextArea showProcess;
	private JTextArea showResult;
	private JButton MC_Button;
	private JButton MR_Button;
	private JButton MS_Button;
	private JButton M_Button;
	private JButton CE_Button;
	private JButton Button_0;
	private JButton C_Button;
	private JButton add_Button;
	private JButton subtract_Button;
	private JButton Button_7;
	private JButton Button_8;
	private JButton Button_9;
	private JButton multiply_Button;
	private JButton divide_Button;
	private JButton Button_4;
	private JButton Button_5;
	private JButton Button_6;
	private JButton delivery_Button;
	private JButton point_Button;
	private JButton Button_1;
	private JButton Button_2;
	private JButton Button_3;
	private JButton delete_Button;
	private JButton equal_Button;
	private MyEvent listener;
	private String input;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caculator frame = new Caculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the frame.
	 */
	public Caculator() {
		setFont(new Font("΢���ź�", Font.PLAIN, 12));
		setTitle("��׼�ͼ�����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 436, 617);
		setResizable(false);//��ֹ��������
		setInScreenCenter();// ���õ�ǰ���ڴ�����Ļ����
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		listener = new MyEvent();
		
		menuPanel = new JPanel();
		menuPanel.setBounds(0, 0, 430, 37);
		menuPanel.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.add(menuPanel);
		menuPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));
		
		viewMenuBar = new JMenuBar();
		viewMenuBar.setBackground(SystemColor.inactiveCaptionBorder);
		menuPanel.add(viewMenuBar);
		
		viewMenu = new JMenu("�鿴(V)");
		viewMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		viewMenu.setBackground(SystemColor.inactiveCaptionBorder);
		viewMenuBar.add(viewMenu);
		
		historyMenuItem = new JMenuItem("��ʷ��¼");
		historyMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		viewMenu.add(historyMenuItem);
		
		settingMenuItem = new JMenuItem("��������");
		settingMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		viewMenu.add(settingMenuItem);
		
		editMenuBar = new JMenuBar();
		editMenuBar.setBackground(SystemColor.inactiveCaptionBorder);
		menuPanel.add(editMenuBar);
		
		editMenu = new JMenu("�༭(E)");
		editMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		editMenu.setBackground(SystemColor.inactiveCaptionBorder);
		editMenuBar.add(editMenu);
		
		deleteAllMenuItem = new JMenuItem("�����ʷ��¼");
		deleteAllMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		editMenu.add(deleteAllMenuItem);
		
		backupMenuItem = new JMenuItem("����������¼");
		backupMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		editMenu.add(backupMenuItem);
		
		helpMenuBar = new JMenuBar();
		helpMenuBar.setBackground(SystemColor.inactiveCaptionBorder);
		menuPanel.add(helpMenuBar);
		
		helpMenu = new JMenu("����(H)");
		helpMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		helpMenu.setBackground(SystemColor.inactiveCaptionBorder);
		helpMenuBar.add(helpMenu);
		
		helpUseingMenuItem = new JMenuItem("ʹ��˵��");
		helpUseingMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		helpMenu.add(helpUseingMenuItem);
		
		contactMenuItem = new JMenuItem("��ϵ����");
		contactMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		helpMenu.add(contactMenuItem);
		
		showProcessPanel = new JPanel();
		showProcessPanel.setBackground(SystemColor.inactiveCaptionBorder);
		showProcessPanel.setBounds(10, 48, 410, 156);
		contentPane.add(showProcessPanel);
		showProcessPanel.setLayout(null);
		
		showProcess = new JTextArea();
		showProcess.setFont(new Font("΢���ź�", Font.BOLD, 25));
		//�����ı�����ʾ�ķ���
		showProcess.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		showProcess.setEditable(false);
		showProcess.setBackground(SystemColor.inactiveCaptionBorder);
		showProcess.setText("0");
		showProcess.setBounds(0, 0, 410, 72);
		showProcessPanel.add(showProcess);
		
		showResult = new JTextArea();
		showResult.setFont(new Font("΢���ź�", Font.BOLD, 25));
		showResult.setEditable(false);
		showResult.setBackground(SystemColor.inactiveCaptionBorder);
		showResult.setBounds(0, 74, 410, 82);
		showProcessPanel.add(showResult);
		
		operatePanel = new JPanel();
		operatePanel.setBackground(new Color(240, 248, 255));
		operatePanel.setBounds(10, 217, 410, 352);
		contentPane.add(operatePanel);
		operatePanel.setLayout(new GridLayout(5, 5, 15, 15));
		
		MC_Button = new JButton("MC");
		MC_Button.setBackground(SystemColor.inactiveCaption);
		MC_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		MC_Button.addActionListener(listener);
		operatePanel.add(MC_Button);
		
		
		MR_Button = new JButton("MR");
		MR_Button.setBackground(SystemColor.inactiveCaption);
		MR_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(MR_Button);
		MR_Button.addActionListener(listener);
		
		MS_Button = new JButton("MS");
		MS_Button.setBackground(SystemColor.inactiveCaption);
		MS_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(MS_Button);
		MS_Button.addActionListener(listener);
		
		M_Button = new JButton("M+");
		M_Button.setBackground(SystemColor.inactiveCaption);
		M_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(M_Button);
		M_Button.addActionListener(listener);
		
		M1_Button = new JButton("M-");
		M1_Button.setBackground(SystemColor.inactiveCaption);
		M1_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(M1_Button);
		M1_Button.addActionListener(listener);
		
		CE_Button = new JButton("CE");
		CE_Button.setBackground(new Color(240, 248, 255));
		CE_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(CE_Button);
		CE_Button.addActionListener(listener);
		
		Button_0 = new JButton("0");
		Button_0.setBackground(SystemColor.activeCaption);
		Button_0.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(Button_0);
		Button_0.addActionListener(listener);
		
		C_Button = new JButton("C");
		C_Button.setBackground(new Color(240, 248, 255));
		C_Button.setIcon(null);
		C_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(C_Button);
		C_Button.addActionListener(listener);
		
		add_Button = new JButton("+");
		add_Button.setBackground(new Color(240, 248, 255));
		add_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(add_Button);
		add_Button.addActionListener(listener);
		
		subtract_Button = new JButton("-");
		subtract_Button.setBackground(new Color(240, 248, 255));
		subtract_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(subtract_Button);
		subtract_Button.addActionListener(listener);
		
		Button_7 = new JButton("7");
		Button_7.setBackground(SystemColor.activeCaption);
		Button_7.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(Button_7);
		Button_7.addActionListener(listener);
		
		Button_8 = new JButton("8");
		Button_8.setBackground(SystemColor.activeCaption);
		Button_8.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(Button_8);
		Button_8.addActionListener(listener);
		
		Button_9 = new JButton("9");
		Button_9.setBackground(SystemColor.activeCaption);
		Button_9.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(Button_9);
		Button_9.addActionListener(listener);
		
		multiply_Button = new JButton("*");
		multiply_Button.setBackground(new Color(240, 248, 255));
		multiply_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(multiply_Button);
		multiply_Button.addActionListener(listener);
		
		divide_Button = new JButton("/");
		divide_Button.setBackground(new Color(240, 248, 255));
		divide_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(divide_Button);
		divide_Button.addActionListener(listener);
		
		Button_4 = new JButton("4");
		Button_4.setBackground(SystemColor.activeCaption);
		Button_4.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(Button_4);
		Button_4.addActionListener(listener);
		
		Button_5 = new JButton("5");
		Button_5.setBackground(SystemColor.activeCaption);
		Button_5.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(Button_5);
		Button_5.addActionListener(listener);
		
		Button_6 = new JButton("6");
		Button_6.setBackground(SystemColor.activeCaption);
		Button_6.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(Button_6);
		Button_6.addActionListener(listener);
		
		delivery_Button = new JButton("%");
		delivery_Button.setBackground(new Color(240, 248, 255));
		delivery_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(delivery_Button);
		delivery_Button.addActionListener(listener);
		
		point_Button = new JButton(".");
		point_Button.setBackground(new Color(240, 248, 255));
		point_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(point_Button);
		point_Button.addActionListener(listener);
		
		Button_1 = new JButton("1");
		Button_1.setBackground(SystemColor.activeCaption);
		Button_1.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(Button_1);
		Button_1.addActionListener(listener);
		
		Button_2 = new JButton("2");
		Button_2.setBackground(SystemColor.activeCaption);
		Button_2.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(Button_2);
		Button_2.addActionListener(listener);
		
		Button_3 = new JButton("3");
		Button_3.setBackground(SystemColor.activeCaption);
		Button_3.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(Button_3);
		Button_3.addActionListener(listener);
		
		delete_Button = new JButton("Del");
		delete_Button.setBackground(new Color(240, 248, 255));
		delete_Button.setFont(new Font("΢���ź�", Font.PLAIN, 16));
		operatePanel.add(delete_Button);
		delete_Button.addActionListener(listener);
		
		equal_Button = new JButton("=");
		equal_Button.setBackground(new Color(240, 248, 255));
		equal_Button.setFont(new Font("΢���ź�", Font.PLAIN, 25));
		operatePanel.add(equal_Button);
		equal_Button.addActionListener(listener);
		
		input = "";
	}
	
	/**
	 * ���õ�ǰ���ڴ�����Ļ����
	 * 
	 */
	private void setInScreenCenter() {
		Toolkit tk=Toolkit.getDefaultToolkit();
		Dimension ds=tk.getScreenSize();
		int x=(ds.width-this.getWidth())/2;
		int y=(ds.height-this.getHeight())/2;
		this.setLocation(x,y);	
	}
	
	class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == CE_Button) {
				showProcess.setText("0");
				showResult.setText("");
				input = "";
			}
			if (e.getSource() == Button_0) {
				input = input + "0";
				showProcess.setText(input);
			}
			if (e.getSource() == Button_1) {
				input = input + "1";
				showProcess.setText(input);
			}
			if (e.getSource() == Button_2) {
				input = input + "2";
				showProcess.setText(input);		
			}
			if (e.getSource() == Button_3) {
				input = input + "3";
				showProcess.setText(input);
			}
			if (e.getSource() == Button_4) {
				input = input + "4";
				showProcess.setText(input);
			}
			if (e.getSource() == Button_5) {
				input = input + "5";
				showProcess.setText(input);
			}
			if (e.getSource() == Button_6) {
				input = input + "6";
				showProcess.setText(input);
			}
			if (e.getSource() == Button_7) {
				input = input + "7";
				showProcess.setText(input);
			}
			if (e.getSource() == Button_8) {
				input = input + "8";
				showProcess.setText(input);
			}
			if (e.getSource() == Button_9) {
				input = input + "9";
				showProcess.setText(input);
			}
			if (e.getSource() == add_Button) {
				input = input + "+";
				showProcess.setText(input);
			}
			if (e.getSource() == subtract_Button) {
				input = input + "-";
				showProcess.setText(input);
			}
			if (e.getSource() == multiply_Button) {
				input = input + "*";
				showProcess.setText(input);
			}
			if (e.getSource() == divide_Button) {
				input = input + "/";
				showProcess.setText(input);
			}
			if (e.getSource() == point_Button) {
				input = input + ".";
				showProcess.setText(input);
			}
			if (e.getSource()==delete_Button) {
				
			}
			if (e.getSource()==equal_Button) {
				showProcess.setText(input+"=");
				InfixToSuffix inToPostS = new InfixToSuffix(input);
				double result = inToPostS.inToPost();
				if(Math.abs(result-0xffffff) > 1e-6)
					showResult.setText(""+result);
				else {
					JOptionPane.showMessageDialog(null,"���������ı��ʽ�Ƿ�Ϸ���","������ʾ",JOptionPane.ERROR_MESSAGE);
				}
			}

			
		}
		
	}
	
	
	
	public class InfixToSuffix {
		 private String textString;

		public InfixToSuffix(String textString) {
			this.textString = textString;
		}
		/**
		 * ���ڼ���׺���ʽ�Ƿ���ȷ
		 * @return
		 */
		public boolean checkIsVaild() {
			int mark = 0,l = 0,r = 0;
			for(int i = 0;i < this.textString.length();i++) 
			{
				if(textString.charAt(i) == '.') {
					while(i < this.textString.length() &&(textString.charAt(i) != '-' && textString.charAt(i) != '+' && textString.charAt(i) != '*' &&textString.charAt(i) != '/') ) {
						if(textString.charAt(i) == '.')mark ++;
						i++;
					}
					if(mark > 1) return false;
					mark = 0;
					i--;
				}else if (textString.charAt(i) == '-' || textString.charAt(i) == '+' || textString.charAt(i) == '*' || textString.charAt(i) == '/' ) 
				{
					if(i == 0) return false;
					if(i+1 >= textString.length() ) 
					{
						return false;
					}else {
						if(textString.charAt(i-1) != ')' &&textString.charAt(i+1) != '(' &&(textString.charAt(i-1)>'9'||textString.charAt(i-1)< '0'|| textString.charAt(i+1)< '0'||textString.charAt(i+1)> '9' ))  return false;
					}
					
				}else if(textString.charAt(i) == '(') {
					l++;
					
					if(i+1 >= textString.length()) return false;
					if(i != 0) {
						if((textString.charAt(i-1)>= '0' && textString.charAt(i-1) <= '9')|| textString.charAt(i+1) > '9'|| textString.charAt(i+1) < '0') return false;
					}else {
						if(textString.charAt(i+1) > '9'|| textString.charAt(i+1) < '0') return false;
					}
				}else if (textString.charAt(i) == ')') {
					r++;
					if(i== 0) return false;
					if(i < textString.length()-1) {
						if((textString.charAt(i+1)>= '0' && textString.charAt(i+1) <= '9')|| textString.charAt(i-1) > '9'|| textString.charAt(i-1) < '0') return false;
					}else if(textString.length()-1 == i ){
						if(textString.charAt(i-1)>'9'||textString.charAt(i-1)<'0') return false;
						
					}
					
				}
			}
			if(l != r) return false;
			return true;
			
		}

		// �����ж����ȼ�
		/**
		 * 
		 * @param left ����ջ�е������
		 * ]
		 * @param right ����Ŀǰ�������
		 * 
		 * @return
		 */
		public int judgeCha(char left, char right) {
			if (left == '+' || left == '-')
				return 1;
			else if (left == '*' || left == '/')
				return 0;
			else if (left == '(')
				return 1;
			return -1;

		}
		public double caculate(double left,double right,char opr) {
			switch (opr) {
			case '+':
				return left+right;
			case '-':
				return left-right;
			case '*':
				return left * right;
			case '/':
				if(right != 0) {
					return left/right; 
				}
				
			}
			return 0xfffff;
			
		}
		//������׺���ʽ��ֵ����׺->��׺->���㣩
		//return ���
		public double inToPost() {
			//����ַ����Ƿ�Ϸ�
			if(!checkIsVaild()) return 0xffffff;
			//����һ��ջ  �洢����
			Stack<Double> stack = new Stack<Double>();
			//�洢����
			Stack<Character> stack2 = new Stack<Character>();
			String string = "";
			for(int i = 0 ;i < textString.length();i++) 
			{
				
				if((i < textString.length())&&((this.textString.charAt(i) >= '0' && this.textString.charAt(i) <= '9')|| this.textString.charAt(i) == '.')){
					//System.out.print(this.textString.charAt(i));
					while((i < textString.length())&&((this.textString.charAt(i) >= '0' && this.textString.charAt(i) <= '9')|| this.textString.charAt(i) == '.')){
						string += this.textString.charAt(i);
						i++;
					}
					//������ѹ��ջ��
					stack.push(Double.valueOf(string));
					string = "";
					i--;
					
				}else if (this.textString.charAt(i) == '(') {
					//��������ѹ��ջ��
					stack2.push(Character.valueOf(this.textString.charAt(i)));
					
				}else if(this.textString.charAt(i) == ')') {
					/**
					 * ����ջ��Ԫ��  ������ Ȼ���������ջ��
					 *
					 */
					while(stack2.peek()!='(') 
					{
						//��������������
						double right = stack.peek();
						stack.pop();
						double left = stack.peek();
						stack.pop();
						//���㵯��������������  Ȼ�󽫽�����ջ��
						if(Math.abs(caculate(left, right, stack2.peek())- 0xfffff) > 1e-6)
							stack.push(caculate(left, right, stack2.peek()));
						stack2.pop();
					}
					//����������
					stack2.pop();
				}else if (stack2.empty()||this.judgeCha(stack2.peek(), this.textString.charAt(i)) == 1) {
					/**
					 * �˿�˵��ջ�е�Ԫ�ط����ȼ��ϵ�  ѹջ
					 */
					stack2.push(this.textString.charAt(i));
					
				}else  if(this.judgeCha(stack2.peek(), this.textString.charAt(i)) == 0){
					do 
					{
						double right = stack.peek();
						stack.pop();
						double left = stack.peek();
						stack.pop();
						//�����ѹ��ջ��
						stack.push(this.caculate(left, right, stack2.peek()));
						stack2.pop();
						
					}while(!stack2.empty() && this.judgeCha(stack2.peek(), this.textString.charAt(i)) == 0); //Ҫô��������Ԫ��  Ҫô����ջ��
					//����ǰԪ��ѹ��ջ�� 
					stack2.push(this.textString.charAt(i));
				
			}	
		}
		while(!stack2.empty()) 
		{
			double right = stack.peek();
			stack.pop();
			double left = stack.peek();
			stack.pop();
			//���㵯��������������  Ȼ�󽫽�����ջ��
			if(Math.abs(caculate(left, right, stack2.peek())- 0xfffff) > 1e-6)
				stack.push(caculate(left, right, stack2.peek()));
			stack2.pop();
			
		}
		return stack.peek();
	}

	}
	
}
