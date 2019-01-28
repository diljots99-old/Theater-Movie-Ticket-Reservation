package main_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 490);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewEmployee = new JMenuItem("New Employee");
		mntmNewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new view.New_emp().setVisible(true);
			}
		});
		mnFile.add(mntmNewEmployee);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		JMenuItem mntmLogOut = new JMenuItem("Log out");
		mntmLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login().setVisible(true);
				dispose();
			}
		});
		mnFile.add(mntmLogOut);
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Movie");
		menuBar.add(mnEdit);
		
		JMenuItem mntmAddMovie = new JMenuItem("Add Movie");
		mntmAddMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new view.Add_Movie().setVisible(true);
			}
		});
		mnEdit.add(mntmAddMovie);
		
		JMenu mnSource = new JMenu("Ticket");
		menuBar.add(mnSource);
		
		JMenuItem mntmPrice = new JMenuItem("Price");
		mntmPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new view.Price().setVisible(true);
			}
		});
		mnSource.add(mntmPrice);
		
		JMenu mnWindow = new JMenu("About");
		menuBar.add(mnWindow);
		
		JMenuItem mntmInfo = new JMenuItem("Info");
		mntmInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"DeeJay ");
			}
		});
		mnWindow.add(mntmInfo);
		
		JMenu mnNewMenu = new JMenu("Help");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mnNewMenu.add(mntmHelp);
		
		JMenuItem mntmContactSupport = new JMenuItem("Contact Support");
		mntmContactSupport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null," Contact = +91-94648-16599\nif number unavaliable the burn your computer");
			}
		});
		mnNewMenu.add(mntmContactSupport);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
