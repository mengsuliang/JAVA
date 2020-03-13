package hps_caculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Dialog;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Caculator extends JFrame  {

	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caculator frame = new Caculator();
					frame.setTitle("���׼�����");
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);

					
					
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 568);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//�˵��� �µ� ����
		JMenu menu = new JMenu("����");
		menuBar.add(menu);
		
		JLabel label = new JLabel("������");
		label.setFont(new Font("΢���ź�", Font.BOLD, 15));
		menu.add(label);
		
		JSeparator separator = new JSeparator();
		menu.add(separator);
		
		JMenuItem menuItem = new JMenuItem("��׼");
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("��ѧ");

		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("����Ա");
		menu.add(menuItem_2);
		
		JLabel label_1 = new JLabel("ת����");
		label_1.setFont(new Font("΢���ź�", Font.BOLD, 15));
		menu.add(label_1);
		
		JSeparator separator_1 = new JSeparator();
		menu.add(separator_1);
		
		JMenuItem menuItem_3 = new JMenuItem("����");
		menu.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("�¶�");
		menu.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("ʱ��");
		menu.add(menuItem_5);
		
		JMenu menu_1 = new JMenu("����&&��ϵ����");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_6 = new JMenuItem("��ϵ����");
		menu_1.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("����");
		menu_1.add(menuItem_7);
		menuItem_7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Asscio dialogAsscio= new Asscio();
				dialogAsscio.setTitle("����");
				//����ͬһJavaӦ�ó��������еĶ��㴰�ڣ������Լ��Ķ��㴰�ڳ��⣩
				dialogAsscio.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
				dialogAsscio.setVisible(true);
				
				
			}
		});
		
		textField = new JTextField();
		textField.setDisabledTextColor(Color.BLUE);
		textField.setSelectionColor(Color.BLACK);
		textField.setMinimumSize(new Dimension(5, 10));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("΢���ź�", Font.BOLD, 15));
		textField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textField.setText("��׼�ͼ�����");
		textField.setEnabled(false);
		textField.setEditable(false);
		menuBar.add(textField);
		textField.setColumns(5);
	
		//�����
		contentPane = new Panel();
		setContentPane(contentPane);
		
		//ʵ��ҳ����л�
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(menuItem_1.getText()+"�ͼ�����");
				contentPane.removeAll();
				contentPane = new Panel1();
				setContentPane(contentPane);
				setVisible(false);
				setVisible(true);
				
				
			}
		});
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText(menuItem.getText()+"�ͼ�����");
				contentPane.removeAll();
				contentPane = new Panel();
				//��������� Ҳ�������ø����ΪJFrame��ܵ��������
				setContentPane(contentPane);
				setVisible(false);
				setVisible(true);
			}
		});
		
		
	}
	

}
