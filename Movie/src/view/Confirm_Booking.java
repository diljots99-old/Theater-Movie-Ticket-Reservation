package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Confirm_Booking extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Confirm_Booking frame = new Confirm_Booking();
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
	public Confirm_Booking() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 727, 318);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPayment = new JLabel("Select Payment Method\r\n");
		lblPayment.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPayment.setBounds(239, 10, 227, 32);
		contentPane.add(lblPayment);
		
		final JRadioButton rdbtnDigitalTransfercreditdebitCarddigital = new JRadioButton("Digital Transfer(Credit/Debit card,Digital Wallets,etc)");
		buttonGroup.add(rdbtnDigitalTransfercreditdebitCarddigital);
		rdbtnDigitalTransfercreditdebitCarddigital.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnDigitalTransfercreditdebitCarddigital.setBounds(115, 113, 411, 21);
		contentPane.add(rdbtnDigitalTransfercreditdebitCarddigital);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=JOptionPane.showConfirmDialog(null,"Are you sure to exit");
				System.out.println(i);
				if(i<=0) {
					dispose();
					new SeatLayout().setVisible(true);
				}
				else if (i==1||i==2) {
					
				}
			}
		});
		btnExit.setBounds(341, 220, 85, 21);
		contentPane.add(btnExit);
		
		JLabel lblTotalAmountTo = new JLabel("Total Amount to pay = "+SeatLayout.TotalPrice);
		lblTotalAmountTo.setBounds(239, 52, 240, 19);
		contentPane.add(lblTotalAmountTo);
		
		
       final JRadioButton rdbCash = new JRadioButton("Cash");
		JButton btnProceed = new JButton("Proceed");
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnDigitalTransfercreditdebitCarddigital.isSelected()) {
				new Digital_payment().setVisible(true);
				dispose();
				}
				else if(rdbCash.isSelected()) {
					new PrintRecipt().setVisible(true);
					/*JOptionPane.showMessageDialog(null,"Collect Cash from Customer");
					int ix=JOptionPane.showConfirmDialog(null,"Do you want to book Another Ticket");
					if(ix==0) {
						new Seat_availability().setVisible(true);
						
					}
					else if (ix==1) {
						dispose();
					}
					else if(ix==2) {
					
				}*/
				
			}
		}});
		
		buttonGroup.add(rdbCash);
		rdbCash.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbCash.setBounds(115, 77, 76, 21);
		contentPane.add(rdbCash);
		btnProceed.setBounds(99, 220, 85, 21);
		contentPane.add(btnProceed);
	}
}
