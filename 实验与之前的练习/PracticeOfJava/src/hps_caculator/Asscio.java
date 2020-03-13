package hps_caculator;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class Asscio extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtHttpsgithubcom;
	private JTextField textField;
	private JTextField txtMaccom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Asscio dialog = new Asscio();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Asscio() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(6, 1, 0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("\u7B80\u6613\u8BA1\u7B97\u5668  \u7248\u672C 1.0 \n by 2019/10/25");
				label.setFont(new Font("ËÎÌå", Font.BOLD, 16));
				label.setForeground(Color.MAGENTA);
				panel.add(label);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JLabel label = new JLabel("\u4F5C\u8005\uFF1A");
				label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 14));
				panel.add(label);
			}
			{
				JLabel label = new JLabel("1800300916 \u9EC4\u4E15\u677E");
				label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 14));
				panel.add(label);
			}
		}
		{
			JPanel panel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			contentPanel.add(panel);
			{
				JLabel lblGithub = new JLabel("github\uFF1A");
				panel.add(lblGithub);
			}
			{
				txtHttpsgithubcom = new JTextField();
				txtHttpsgithubcom.setEditable(false);
				txtHttpsgithubcom.setText("https://github.com/1291945816");
				panel.add(txtHttpsgithubcom);
				txtHttpsgithubcom.setColumns(32);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel label = new JLabel("\u8054\u7CFB\u7535\u8BDD:");
				panel.add(label);
			}
			{
				textField = new JTextField();
				textField.setEditable(false);
				textField.setText("123456789");
				panel.add(textField);
				textField.setColumns(32);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			{
				JLabel lblEmail = new JLabel("Email:");
				panel.add(lblEmail);
			}
			{
				txtMaccom = new JTextField();
				txtMaccom.setEditable(false);
				txtMaccom.setText("mac1291945816@163.com");
				panel.add(txtMaccom);
				txtMaccom.setColumns(32);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JLabel label = new JLabel("\u8BE5\u4F5C\u54C1\u4EC5\u7528\u4E8E\u5185\u90E8\u4EA4\u6D41\u4F7F\u7528\uFF0C\u4E0D\u53EF\u7528\u4E8E\u5546\u4E1A\u7528\u9014");
				label.setForeground(Color.RED);
				label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 16));
				panel.add(label);
			}
		}
	}

}

