package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PrintRecipt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintRecipt frame = new PrintRecipt();
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
	public PrintRecipt() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 664, 779);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrintRecipt = new JLabel("Print Recipt");
		lblPrintRecipt.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrintRecipt.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrintRecipt.setBounds(10, 10, 630, 42);
		contentPane.add(lblPrintRecipt);
		
		JLabel lblPvrCinemas = new JLabel("PVR Cinemas");
		lblPvrCinemas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPvrCinemas.setBounds(10, 62, 630, 13);
		contentPane.add(lblPvrCinemas);
		
		JLabel lblChandigarh = new JLabel("Chandigarh");
		lblChandigarh.setHorizontalAlignment(SwingConstants.CENTER);
		lblChandigarh.setBounds(10, 85, 630, 13);
		contentPane.add(lblChandigarh);
		
		JLabel lblMovieTickects = new JLabel("Movie Tickects");
		lblMovieTickects.setHorizontalAlignment(SwingConstants.CENTER);
		lblMovieTickects.setBounds(10, 108, 630, 13);
		contentPane.add(lblMovieTickects);
		
		JLabel lblMovieName = new JLabel("Movie Name");
		lblMovieName.setBounds(55, 152, 106, 13);
		contentPane.add(lblMovieName);
		
		JLabel label = new JLabel("****************************************************************************************************");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 131, 630, 13);
		contentPane.add(label);
		
		JLabel lblSeat = new JLabel("Seat\r\n");
		lblSeat.setBounds(55, 185, 106, 13);
		contentPane.add(lblSeat);
		
		JLabel label_2 = new JLabel("Movie Name");
		label_2.setBounds(55, 214, 106, 13);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Movie Name");
		label_3.setBounds(55, 242, 106, 13);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Movie Name");
		label_4.setBounds(55, 274, 106, 13);
		contentPane.add(label_4);
		
	}
}
