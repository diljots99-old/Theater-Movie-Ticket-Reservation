package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import connector.My_function;
import db.Connectivity;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Price extends JFrame {

	private JPanel contentPane;
	private JTextField txtGold;
	private JTextField txtSilver;
	private JTextField txtEco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Price frame = new Price();
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
	public Price() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 641, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movie Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(96, 79, 142, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Movie Type");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(96, 129, 142, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ticket Class \r\nand Price");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(96, 176, 173, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblPrice.setBounds(260, 34, 75, 25);
		contentPane.add(lblPrice);
		
		JComboBox movie_name = new JComboBox();
		movie_name.setBounds(323, 81, 228, 21);
		contentPane.add(movie_name);
		
		Connection con= Connectivity.dbConnect();
		try {
			Statement st=con.createStatement();
			String qry="select movie_name from addmovie";
			ResultSet rst=st.executeQuery(qry);
			while(rst.next())
			{
				movie_name.addItem(rst.getString(1));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
		
		
		
		JComboBox movie_type = new JComboBox();
		movie_type.setModel(new DefaultComboBoxModel(new String[] {"Bollywood", "Hollywood", "Pollywood", "Bhojpuri"}));
		movie_type.setBounds(323, 129, 228, 21);
		contentPane.add(movie_type);
		
	
		
		txtGold = new JTextField();
		txtGold.setBounds(455, 177, 96, 19);
		contentPane.add(txtGold);
		txtGold.setColumns(10);
		
		txtSilver = new JTextField();
		txtSilver.setBounds(455, 212, 96, 19);
		contentPane.add(txtSilver);
		txtSilver.setColumns(10);
		
		txtEco = new JTextField();
		txtEco.setBounds(455, 249, 96, 19);
		contentPane.add(txtEco);
		txtEco.setColumns(10);
		
		
		JCheckBox chckbxGold = new JCheckBox("Gold");
		chckbxGold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGold.isSelected()==true) {
					txtGold.enable();
					
					txtSilver.disable();
					txtEco.disable();
				
		
				}
				else if(chckbxGold.isSelected()==false)
				{
					txtGold.setText("");
					txtGold.disable();
				}
			}
		});
		chckbxGold.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxGold.setBounds(323, 176, 93, 21);
		contentPane.add(chckbxGold);
		
		JCheckBox chkSilver = new JCheckBox("Silver");
		chkSilver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkSilver.isSelected()==true) {
				txtSilver.enable();
				txtEco.disable();
				txtGold.disable();
				}
				else if(chkSilver.isSelected()==false)
				{
					txtSilver.setText("");
					txtSilver.disable();
					
				}
			}
		});
		chkSilver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chkSilver.setBounds(323, 211, 93, 21);
		contentPane.add(chkSilver);
		
		JCheckBox chkEco = new JCheckBox("Economy");
		chkEco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkEco.isSelected()==true)
				{
				txtSilver.disable();;
				txtEco.enable();
				txtGold.disable();
				}
				else if(chkEco.isSelected()==false)
				{
					txtEco.setText("");
					txtEco.disable();
					txtGold.disable();
					txtSilver.disable();
				}
				
			}
		});
		chkEco.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chkEco.setBounds(323, 248, 123, 21);
		contentPane.add(chkEco);
		
	
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Movie_Name=(String) movie_name.getItemAt(movie_name.getSelectedIndex());
			String Movie_Type=(String) movie_type.getItemAt(movie_type.getSelectedIndex());
			String Price_Gold=txtGold.getText();
			String Price_Silver=txtSilver.getText();
			String Price_Eco=txtEco.getText();
			boolean status=My_function.price(Movie_Name,Movie_Type,Price_Gold,Price_Silver,Price_Eco);
			if(status)
			{
				JOptionPane.showMessageDialog(null,"Data stored","Price stored",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Data not stored","Price stored",JOptionPane.INFORMATION_MESSAGE);
			}
				
				
			}
		});
		btnNewButton.setForeground(UIManager.getColor("MenuItem.selectionBackground"));
		btnNewButton.setBackground(UIManager.getColor("Menu.selectionBackground"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(166, 320, 110, 21);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnExit.setForeground(UIManager.getColor("MenuItem.selectionBackground"));
		btnExit.setBackground(UIManager.getColor("Menu.selectionBackground"));
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(336, 320, 110, 21);
		contentPane.add(btnExit);
	}
}
