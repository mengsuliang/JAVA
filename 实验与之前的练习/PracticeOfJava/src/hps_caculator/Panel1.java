package hps_caculator;


import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Panel1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel1() {
		setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();

		textArea.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textArea.setEditable(false);
		textArea.setColumns(64);
		textArea.setRows(2);
		textArea.setText("\n0");
		textArea.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		add(textArea, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(1, 5, 1, 1));
		
		JButton btnMc = new JButton("MC");
		panel_1.add(btnMc);
		
		JButton btnMr = new JButton("MR");
		panel_1.add(btnMr);
		
		JButton btnM = new JButton("M+");
		panel_1.add(btnM);
		
		JButton btnM_1 = new JButton("M-");
		panel_1.add(btnM_1);
		
		JButton btnMs = new JButton("MS");
		panel_1.add(btnMs);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 5, 0, 0));
		
		JButton btnX = new JButton("X^2");
		panel_2.add(btnX);
		
		JButton btnXy = new JButton("X^y");
		panel_2.add(btnXy);
		
		JButton btnSin = new JButton("sin");
		panel_2.add(btnSin);
		
		JButton btnCos = new JButton("cos");
		panel_2.add(btnCos);
		
		JButton btnTan = new JButton("tan");
		panel_2.add(btnTan);
		
		JButton btnx = new JButton("\u221Ax");
		panel_2.add(btnx);
		
		JButton btnx_1 = new JButton("10^x");
		panel_2.add(btnx_1);
		
		JButton btnLog = new JButton("log");
		panel_2.add(btnLog);
		
		JButton btnExp = new JButton("Exp");
		panel_2.add(btnExp);
		
		JButton btnMod = new JButton("Mod");
		panel_2.add(btnMod);
		
		JButton btnnd = new JButton("2nd");
		panel_2.add(btnnd);
		
		JButton btnCe = new JButton("CE");
		btnCe.setFont(new Font("ËÎÌå", Font.BOLD, 18));
		panel_2.add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		panel_2.add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText("\n0");
				
			}
		});
		
		JButton btnDel = new JButton("del");
		btnDel.setFont(new Font("ËÎÌå", Font.BOLD, 18));
		panel_2.add(btnDel);
		btnDel .addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] lineStrings = textArea.getText().split("\n");
				if(lineStrings[0].length() > 0)
					textArea.setText(lineStrings[0].substring(0, lineStrings[0].length()-1)+"\n"+lineStrings[1]);
			}
		});
		
		JButton button = new JButton("/");
		button.setFont(new Font("ËÎÌå", Font.BOLD, 18));
		panel_2.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+"/"+"\n"+lineStrings[1]);
			}
		});
		
		
		JButton button_1 = new JButton("\u03C0");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text=new String(Double.toString(Math.PI));
				textArea.setText("\n"+text);
				
			}
		});
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_2.getText()+"\n"+lineStrings[1]);
			}
		});
		button_2.setBackground(Color.ORANGE);
		button_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_3.getText()+"\n"+lineStrings[1]);
			}
		});
		button_3.setBackground(Color.ORANGE);
		button_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("9");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_4.getText()+"\n"+lineStrings[1]);
				
			}
		});
		button_4.setBackground(Color.ORANGE);
		button_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		panel_2.add(button_4);
		
		JButton btnX_1 = new JButton("*");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+btnX_1.getText()+"\n"+lineStrings[1]);
			}
		});
		btnX_1.setFont(new Font("ËÎÌå", Font.BOLD, 18));
		panel_2.add(btnX_1);
		
		JButton btnN = new JButton("n!");
		panel_2.add(btnN);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_5.getText()+"\n"+lineStrings[1]);
			}
		});
		button_5.setBackground(Color.ORANGE);
		button_5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_6.getText()+"\n"+lineStrings[1]);
			}
		});
		button_6.setBackground(Color.ORANGE);
		button_6.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		panel_2.add(button_6);
		
		JButton button_7 = new JButton("6");
		button_7.setBackground(Color.ORANGE);
		button_7.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		panel_2.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_7.getText()+"\n"+lineStrings[1]);
				
			}
		});
		
		JButton button_8 = new JButton("-");
		button_8.setFont(new Font("ËÎÌå", Font.BOLD, 18));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				String text =lineStrings[0]+button_8.getText()+"\n"+lineStrings[1];
				textArea.setText(text);
				
				
			}
		});
		panel_2.add(button_8);
		JButton button_9 = new JButton("+/-");
		panel_2.add(button_9);
		
		JButton button_10 = new JButton("1");
		button_10.setBackground(Color.ORANGE);
		button_10.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		panel_2.add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_10.getText()+"\n"+lineStrings[1]);
			}
		});
		
		JButton button_11 = new JButton("2");
		button_11.setBackground(Color.ORANGE);
		button_11.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		panel_2.add(button_11);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_11.getText()+"\n"+lineStrings[1]);
			}
		});
		
		JButton button_12 = new JButton("3");
		button_12.setBackground(Color.ORANGE);
		button_12.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		panel_2.add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_12.getText()+"\n"+lineStrings[1]);
			}
		});
		
		JButton button_13 = new JButton("+");
		button_13.setFont(new Font("ËÎÌå", Font.BOLD, 18));
		panel_2.add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_13.getText()+"\n"+lineStrings[1]);
			}
		});
		
		JButton button_14 = new JButton("(");
		panel_2.add(button_14);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_14.getText()+"\n"+lineStrings[1]);
			}
		});
		
		JButton button_15 = new JButton(")");
		panel_2.add(button_15);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_15.getText()+"\n"+lineStrings[1]);
			}
		});
		
		JButton button_16 = new JButton("0");
		button_16.setBackground(Color.ORANGE);
		button_16.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 18));
		panel_2.add(button_16);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_16.getText()+"\n"+lineStrings[1]);
			}
		});
		
		JButton button_17 = new JButton(".");
		button_17.setFont(new Font("ËÎÌå", Font.BOLD, 20));
		panel_2.add(button_17);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] lineStrings = textArea.getText().split("\n");
				textArea.setText(lineStrings[0]+button_17.getText()+"\n"+lineStrings[1]);
			}
		});
		
		//¼ÆËã±í´ïÊ½ È»ºó½«½á¹û½øÐÐ×ª»»
		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] lineStrings = textArea.getText().split("\n");
				lineStrings[0]=lineStrings[0].replace(" ", "");
				InfixSuffix inToPostS = new InfixSuffix(lineStrings[0]);
				double ab = inToPostS.inToPost();
				if(Math.abs(ab-0xffffff) > 1e-6)
					textArea.setText(lineStrings[0]+"\n"+ab);
				else {
					JOptionPane.showMessageDialog(null,"´íÎóÌáÊ¾: ¼ì²éÄúÊäÈëµÄ±í´ïÊ½ÊÇ·ñºÏ·¨£¿","´íÎó",JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		button_18.setFont(new Font("ËÎÌå", Font.BOLD, 20));
		panel_2.add(button_18);
		
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode() ;
				String[] lineStrings = textArea.getText().split("\n");
				if((keyCode >= 48 && keyCode <= 57)||(keyCode >= 96 && keyCode <= 105) || keyCode == 110)
					textArea.setText(lineStrings[0]+String.valueOf(e.getKeyChar())+"\n"+lineStrings[1]);
				else if (keyCode <= 111 && keyCode > 105 || keyCode == KeyEvent.VK_ENTER) {
					char op;
					int mark = -1;
					double ab=-4;
					op = ' ';
					if(keyCode == 10) {
						lineStrings = textArea.getText().split("\n");
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
						textArea.setText(lineStrings[0]+"\n"+ab);
					}else {
						textArea.setText(lineStrings[0]+op+"\n"+lineStrings[1]);
					}
					
				}else if (keyCode == KeyEvent.VK_BACK_SPACE) {
					 lineStrings = textArea.getText().split("\n");
					if(lineStrings[0].length() > 0)
						textArea.setText(lineStrings[0].substring(0, lineStrings[0].length()-1)+"\n"+lineStrings[1]);
					
				}
			}
		});
		

	}

}

