package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JTextFieldDateEditor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Digital_payment extends JFrame {

	private JPanel contentPane;
	private JTextField Paytm_no;
	private JTextField Number;
	private JTextField VaildThru;
	private JTextField CVV;
	public static String selecter = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Digital_payment frame = new Digital_payment();
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
	public Digital_payment() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 948, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTotalAmountTo = new JLabel("Total Amount  to pay = " + SeatLayout.TotalPrice);
		lblTotalAmountTo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalAmountTo.setBounds(41, 98, 593, 21);
		contentPane.add(lblTotalAmountTo);

		JLabel lblDigitalPaymentMethod = new JLabel("Digital Payment Method");
		lblDigitalPaymentMethod.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDigitalPaymentMethod.setBounds(332, 21, 225, 46);
		contentPane.add(lblDigitalPaymentMethod);

		JLabel lblSelectPaymentMethod = new JLabel("Select Payment Method");
		lblSelectPaymentMethod.setBounds(68, 145, 169, 21);
		contentPane.add(lblSelectPaymentMethod);

		JLabel Paytm = new JLabel("Enter Paytm Number");
		Paytm.setBounds(68, 211, 130, 13);
		contentPane.add(Paytm);
		Paytm.setVisible(false);

		JLabel MobiKwik = new JLabel("Enter MobiKwik Number");
		MobiKwik.setBounds(68, 207, 169, 21);
		contentPane.add(MobiKwik);
		MobiKwik.setVisible(false);

		JLabel Card = new JLabel("Card Number");
		Card.setBounds(68, 211, 119, 13);
		contentPane.add(Card);
		Card.setVisible(false);

		JLabel PhonePe = new JLabel("Enter PhonePe Number ");
		PhonePe.setBounds(68, 211, 154, 13);
		contentPane.add(PhonePe);
		PhonePe.setVisible(false);

		JLabel VaildThruLa = new JLabel("Vaild Thru");
		VaildThruLa.setBounds(68, 270, 63, 13);
		contentPane.add(VaildThruLa);

		JLabel CVVLabel = new JLabel("CVV");
		CVVLabel.setBounds(332, 270, 45, 13);
		contentPane.add(CVVLabel);

		JTextField Number_1 = new JTextField();
		Number_1.setBounds(294, 208, 452, 19);
		contentPane.add(Number_1);
		Number_1.setColumns(10);
		Number_1.setVisible(false);

		JTextField VaildThru = new JTextField();
		VaildThru.setBounds(157, 267, 96, 19);
		contentPane.add(VaildThru);
		VaildThru.setColumns(10);

		JTextField CVV = new JTextField();
		CVV.setBounds(433, 267, 96, 19);
		contentPane.add(CVV);
		CVV.setColumns(10);
		CVV.setVisible(false);
		VaildThru.setVisible(false);
		CVVLabel.setVisible(false);
		VaildThruLa.setVisible(false);

		JComboBox methodSelecter = new JComboBox();
		methodSelecter.setModel(new DefaultComboBoxModel(
				new String[] { "Select", "Credit Card", "Debit Card", "PayTM", "MobiKwik", "PhonePe" }));
		methodSelecter.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				selecter = (String) methodSelecter.getSelectedItem();
				if (selecter.equals("PayTM")) {
					Number_1.setVisible(true);
					Paytm.setVisible(true);
					MobiKwik.setVisible(false);
					Card.setVisible(false);
					PhonePe.setVisible(false);
					CVV.setVisible(false);
					VaildThru.setVisible(false);
					CVVLabel.setVisible(false);
					VaildThruLa.setVisible(false);
					CVV.setText(" ");
					VaildThru.setText(" ");
					CVV.disable();
					VaildThru.disable();
				} else if (selecter.equals("MobiKwik")) {
					Number_1.setVisible(true);
					MobiKwik.setVisible(true);
					Paytm.setVisible(false);
					Card.setVisible(false);
					PhonePe.setVisible(false);
					CVV.setVisible(false);
					VaildThru.setVisible(false);
					CVVLabel.setVisible(false);
					VaildThruLa.setVisible(false);
					CVV.setText(" ");
					VaildThru.setText(" ");
					CVV.disable();
					VaildThru.disable();
				} else if ((selecter.equals("Credit Card") || selecter.equals("Debit Card"))) {
					Number_1.setVisible(true);
					Card.setVisible(true);
					MobiKwik.setVisible(false);
					Paytm.setVisible(false);
					PhonePe.setVisible(false);
					CVV.setVisible(true);
					VaildThru.setVisible(true);
					CVVLabel.setVisible(true);
					VaildThruLa.setVisible(true);

				} else if (selecter.equals("PhonePe")) {

					Number_1.setVisible(true);
					PhonePe.setVisible(true);
					MobiKwik.setVisible(false);
					Paytm.setVisible(false);
					Card.setVisible(false);
					CVV.setVisible(false);
					VaildThru.setVisible(false);
					CVVLabel.setVisible(false);
					VaildThruLa.setVisible(false);
					CVV.setText(" ");
					VaildThru.setText(" ");
					CVV.disable();
					VaildThru.disable();
				}
			}
		});
		methodSelecter.setBounds(294, 145, 452, 21);
		contentPane.add(methodSelecter);

		JButton btnNewButton = new JButton("Proceed");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((((VaildThru.getText().equals(""))) || ((CVV.getText().equals(""))))) {
					JOptionPane.showMessageDialog(null, "Please enter your Card details carefully", "error",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (((Number_1.getText().equals("")))) {
					JOptionPane.showMessageDialog(null, "Please enter your " + selecter + " details carefully", "error",
							JOptionPane.INFORMATION_MESSAGE);
				} 
				
				else {
					new PrintRecipt().setVisible(true);
					/*JOptionPane.showMessageDialog(null, "Your Payment Has been Complete via " + selecter);
					int ix = JOptionPane.showConfirmDialog(null, "Do you want to book Another Ticket");
					if (ix == 0) {
						dispose();

						new Seat_availability().setVisible(true);

					} else if (ix == 1) {

						dispose();
					} else if (ix == 2) {

					}*/
				}
				
				
			}
		});
		btnNewButton.setBounds(200, 347, 85, 21);
		contentPane.add(btnNewButton);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Are you sure to exit");
				System.out.println(i);
				if (i <= 0) {
					dispose();
					new Confirm_Booking().setVisible(true);
				} else if (i == 1 || i == 2) {

				}
			}
		});
		btnExit.setBounds(444, 347, 85, 21);
		contentPane.add(btnExit);

	}
}
