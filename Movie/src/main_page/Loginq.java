package main_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import connector.My_function;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Loginq extends JFrame {

	private JPanel contentPane;
	private JTextField textUser;
	private JPasswordField textPws;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLgin = new JLabel("Login");
		lblLgin.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblLgin.setBounds(254, 31, 76, 36);
		contentPane.add(lblLgin);
		
		JLabel UserName = new JLabel("User Name");
		UserName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		UserName.setBounds(75, 90, 103, 20);
		contentPane.add(UserName);
		
		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Password.setBounds(75, 130, 87, 20);
		contentPane.add(Password);
		
		JLabel Panel = new JLabel("Panel");
		Panel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Panel.setBounds(75, 170, 76, 20);
		contentPane.add(Panel);
		
		textUser = new JTextField();
		textUser.setBounds(252, 94, 215, 19);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		textPws = new JPasswordField();
		textPws.setBounds(254, 134, 213, 19);
		contentPane.add(textPws);
		
		JComboBox panel = new JComboBox();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel.setModel(new DefaultComboBoxModel(new String[] {"Please Select panel", "admin", "employee"}));
		panel.setBounds(254, 173, 213, 21);
		contentPane.add(panel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Connection con=db.Connectivity.dbConnect();
				
				String username=textUser.getText();
				String password=textPws.getText();
				String pannel=(String) panel.getItemAt(panel.getSelectedIndex());
				if(pannel.equals("Please Select panel"))
				{
					JOptionPane.showMessageDialog(null,"Please Select Panel");
				}
					
				else if(pannel.equals("admin")) {
				boolean status=My_function.verifyUser(username,password,pannel);
				if(status) {
					new Main().setVisible(true);
					dispose();}
				else {
					JOptionPane.showMessageDialog(null,"Wrong Credintials");
				}
				
				}
				else if(pannel.equals("employee")) {
					boolean status=My_function.verifyUser(username,password,pannel);
					if(status) {
						new MainEmployee().setVisible(true);
						dispose();
						}
					else {
					JOptionPane.showMessageDialog(null,"Wrong Credintials");
					}
			
				
				}}}
		);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLogin.setBounds(93, 241, 85, 21);
		contentPane.add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCancel.setBounds(349, 241, 118, 21);
		contentPane.add(btnCancel);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textUser.setText(null);
			textPws.setText(null);
			
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBounds(230, 244, 85, 21);
		contentPane.add(btnReset);
	}
}
