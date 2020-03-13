package hps_caculator;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Panel extends JPanel {
	public Panel() {
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		
		
		
		//ÓÃÓÚÏÔÊ¾µÄÎÄ±¾Óò
		JTextArea txtrrn = new JTextArea();
		txtrrn.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		//ÉèÖÃÎÄ±¾µÄÏÔÊ¾µÄ·½Ïò
		txtrrn.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		txtrrn.setColumns(100);
		txtrrn.setEditable(false);
		txtrrn.setText("\n0");
		txtrrn.setRows(2);
		panel.add(txtrrn);
		
		
		//ÓÃÓÚ´æ·ÅÁíÍâÁ½ÐÐ
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		//ÕâÒ»ÐÐÓÃÓÚÉú³ÉMC¡¢Mr
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(0, 6, 1, 1));
		
		JButton btnNewButton = new JButton("MC");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("MR");
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("M+");
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("M-");
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("MS");
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("M^");
		panel_2.add(btnNewButton_5);
		
		//²Ù×÷ÊýºÍÔËËã·ûµÄÃæ°å
		JPanel panel_3 = new JPanel();
		panel_3.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel_3.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(0, 4, 2, 2));
		
		JButton btnNewButton_6 = new JButton("%");
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("¡Ì");
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("(");
		panel_3.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_8.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_9 = new JButton(")");
		panel_3.add(btnNewButton_9);
		
		btnNewButton_9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_9.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_10 = new JButton("CE");
		btnNewButton_10.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("C");
		btnNewButton_11.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_11);
		//Çå¿Õ°´Å¥
		btnNewButton_11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtrrn.setText("\n0");
			}
		});
		
		//É¾³ý°´Å¥
		JButton btnNewButton_12 = new JButton("Del");
		btnNewButton_12.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				if(linStrings[0].length() > 0)
					txtrrn.setText(linStrings[0].substring(0,linStrings[0].length()-1)+"\n"+linStrings[1]);
			}
		});
		
		//³ýºÅ
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_13);
		btnNewButton_13.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
					txtrrn.setText(linStrings[0]+btnNewButton_13.getText()+"\n"+linStrings[1]);
			}
		});
		
		//Êý×Ö7
		JButton btnNewButton_14 = new JButton("7");
		btnNewButton_14.setBackground(Color.GREEN);
		btnNewButton_14.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_14);
		btnNewButton_14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_14.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_15 = new JButton("8");
		btnNewButton_15.setBackground(Color.GREEN);
		btnNewButton_15.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_15);
		btnNewButton_15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_15.getText()+"\n"+linStrings[1]);
			}
		});
		
		
		JButton btnNewButton_16 = new JButton("9");
		btnNewButton_16.setBackground(Color.GREEN);
		btnNewButton_16.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_16);
		btnNewButton_16.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_16.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_17 = new JButton("*");
		btnNewButton_17.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_17);
		btnNewButton_17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_17.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_18 = new JButton("4");
		btnNewButton_18.setBackground(Color.GREEN);
		btnNewButton_18.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_18);
		btnNewButton_18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_18.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_19 = new JButton("5");
		btnNewButton_19.setBackground(Color.GREEN);
		btnNewButton_19.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_19);
		btnNewButton_19.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_19.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_20 = new JButton("6");
		btnNewButton_20.setBackground(Color.GREEN);
		btnNewButton_20.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_20);
		btnNewButton_20.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_20.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_22 = new JButton("-");
		btnNewButton_22.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_22);
		btnNewButton_22.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_22.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_21 = new JButton("1");
		btnNewButton_21.setBackground(Color.GREEN);
		btnNewButton_21.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_21);
		btnNewButton_21.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_21.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_23 = new JButton("2");
		btnNewButton_23.setBackground(Color.GREEN);
		btnNewButton_23.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_23);
		
		btnNewButton_23.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_23.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_24 = new JButton("3");
		btnNewButton_24.setBackground(Color.GREEN);
		btnNewButton_24.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_24);
		
		btnNewButton_24.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_24.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_25 = new JButton("+");
		btnNewButton_25.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
		panel_3.add(btnNewButton_25);
		btnNewButton_25.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_25.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_26 = new JButton("+/-");
		panel_3.add(btnNewButton_26);
		
		JButton btnNewButton_27 = new JButton("0");
		btnNewButton_27.setBackground(Color.GREEN);
		btnNewButton_27.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		panel_3.add(btnNewButton_27);
		btnNewButton_27.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_27.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_28 = new JButton(".");
		btnNewButton_28.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		panel_3.add(btnNewButton_28);
		btnNewButton_28.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				txtrrn.setText(linStrings[0]+btnNewButton_28.getText()+"\n"+linStrings[1]);
			}
		});
		
		JButton btnNewButton_29 = new JButton("=");
		btnNewButton_29.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		panel_3.add(btnNewButton_29);
		btnNewButton_29.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linStrings = txtrrn.getText().split("\n");
				InfixSuffix inToPost = new InfixSuffix(linStrings[0]);
				double ab = inToPost.inToPost();
				if(Math.abs(ab-0xffffff)>1e-6) 
					txtrrn.setText(linStrings[0]+"\n"+ab);
				else {
					JOptionPane.showMessageDialog(null,"´íÎóÌáÊ¾: ¼ì²éÄúÊäÈëµÄ±í´ïÊ½ÊÇ·ñºÏ·¨£¿","´íÎó",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		
		txtrrn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode() ;
				String[] lineStrings = txtrrn.getText().split("\n");
				if((keyCode >= 48 && keyCode <= 57)||(keyCode >= 96 && keyCode <= 105))
					txtrrn.setText(lineStrings[0]+String.valueOf(e.getKeyChar())+"\n"+lineStrings[1]);
				else if (keyCode <= 111 && keyCode > 105 || keyCode == KeyEvent.VK_ENTER) {
					char op;
					int mark = -1;
					double ab=-4;
					op = ' ';
					if(keyCode == 10) {
						lineStrings = txtrrn.getText().split("\n");
						lineStrings[0]=lineStrings[0].replace(" ", "");
						InfixSuffix inToPostS = new InfixSuffix(lineStrings[0]);
						 ab = inToPostS.inToPost();
						if(Math.abs(ab-0xffffff) > 1e-6) {
							mark = 1;
						}
						else {
							JOptionPane.showMessageDialog(null,"´íÎóÌáÊ¾: ¼ì²éÄúÊäÈëµÄ±í´ïÊ½ÊÇ·ñºÏ·¨£¿","´íÎó",JOptionPane.ERROR_MESSAGE);
						}
						
					}
					switch(e.getKeyChar()) {
					case '+': op = '+';break;
					case '-': op = '-';break;
					case '/': op = '/';break;
					case '*': op = '*';break;
					}
					if(mark == 1){
						txtrrn.setText(lineStrings[0]+"\n"+ab);
					}else {
						txtrrn.setText(lineStrings[0]+op+"\n"+lineStrings[1]);
					}
					
				}else if (keyCode == KeyEvent.VK_BACK_SPACE) {
					 lineStrings = txtrrn.getText().split("\n");
					if(lineStrings[0].length() > 0)
						txtrrn.setText(lineStrings[0].substring(0, lineStrings[0].length()-1)+"\n"+lineStrings[1]);
					
				}
			}
		});
		
		
		
		
		
		
		
	}
	

}

