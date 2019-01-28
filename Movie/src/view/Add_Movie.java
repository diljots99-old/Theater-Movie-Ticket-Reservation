package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import connector.My_function;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Add_Movie extends JFrame {

	private JPanel contentPane;
	private JTextField mname;
	private JTextField aname;
	private JTextField mdesc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Movie frame = new Add_Movie();
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
	public Add_Movie() {
		setTitle("Theatre Ticket Reservation Application");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 650, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddMovie = new JLabel("Add Movie");
		lblAddMovie.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAddMovie.setBounds(204, 28, 127, 25);
		contentPane.add(lblAddMovie);
		
		JLabel lblMovieName = new JLabel("Movie Name");
		lblMovieName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMovieName.setBounds(72, 92, 141, 25);
		contentPane.add(lblMovieName);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblType.setBounds(72, 137, 115, 35);
		contentPane.add(lblType);
		
		JLabel lblActorName = new JLabel("Artist Name");
		lblActorName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblActorName.setBounds(72, 191, 115, 35);
		contentPane.add(lblActorName);
		
		JLabel lblMovieDescription = new JLabel("Movie Description");
		lblMovieDescription.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMovieDescription.setBounds(72, 256, 154, 25);
		contentPane.add(lblMovieDescription);
		
		mname = new JTextField();
		mname.setBounds(254, 95, 96, 19);
		contentPane.add(mname);
		mname.setColumns(10);
		
		aname = new JTextField();
		aname.setColumns(10);
		aname.setBounds(254, 199, 96, 19);
		contentPane.add(aname);
		
		mdesc = new JTextField();
		mdesc.setColumns(10);
		mdesc.setBounds(254, 259, 311, 58);
		contentPane.add(mdesc);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Bollywood", "Hollywood", "Pollywood", "Bhojpuri"}));
		comboBox.setBounds(254, 154, 96, 21);
		contentPane.add(comboBox);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String movie_name=mname.getText();
				String type=(String) comboBox.getItemAt(comboBox.getSelectedIndex());
				String artist=aname.getText();
				String movie_description=mdesc.getText();
				if(movie_name.isEmpty()||type.isEmpty()||artist.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Fill all field");
			}
				else if(type.equals("Select")) {
					JOptionPane.showMessageDialog(null,"Please select some Movie Type");
				}
				else {
					boolean status=My_function.addMovie(movie_name, artist, type, movie_description);
					if(status)
					{
					JOptionPane.showMessageDialog(null, "Your Data Saved");
					dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Your Data cannot Saved");
						dispose();
					}
					
				}
					
			}});
		btnSubmit.setBounds(128, 335, 85, 21);
		contentPane.add(btnSubmit);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(280, 335, 85, 21);
		contentPane.add(btnExit);
		
		JLabel label = new JLabel("*");
		label.setForeground(Color.RED);
		label.setBounds(210, 260, 45, 13);
		contentPane.add(label);
		
		JLabel lbloptional = new JLabel("*=optional");
		lbloptional.setForeground(Color.RED);
		lbloptional.setBounds(82, 299, 96, 13);
		contentPane.add(lbloptional);
	}
}
