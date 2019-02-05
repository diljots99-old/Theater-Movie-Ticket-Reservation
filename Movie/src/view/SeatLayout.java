package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class SeatLayout extends JFrame {
	public static SeatLayout seatLayout = new SeatLayout();
	public static int EcoCount = 0;
	public static int SilverCount = 0;
	public static int GoldCount = 0;
	public static int TotalPrice = 0;
	public static String Seatcounter[] = null;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeatLayout frame = new SeatLayout();
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
	public SeatLayout() {

		EcoCount = 0;
		SilverCount = 0;
		GoldCount = 0;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 996, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		final JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setForeground(new Color(0, 255, 255));
		panel.setBounds(68, 10, 581, 10);
		contentPane.add(panel);

		JLabel lblScreenThisWay = new JLabel("Screen this Way");
		lblScreenThisWay.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblScreenThisWay.setBounds(249, 30, 192, 30);
		contentPane.add(lblScreenThisWay);

		JLabel lblEconomySeats = new JLabel("Economy Seats");
		lblEconomySeats.setBounds(34, 65, 90, 13);
		contentPane.add(lblEconomySeats);

		JLabel lblSilverSeats = new JLabel("Silver Seats");
		lblSilverSeats.setBounds(34, 219, 69, 13);
		contentPane.add(lblSilverSeats);

		JLabel lblGoldSeats = new JLabel("Gold Seats");
		lblGoldSeats.setBounds(34, 362, 69, 13);
		contentPane.add(lblGoldSeats);

		JPanel panel_Eco = new JPanel();
		panel_Eco.setBounds(44, 99, 640, 112);
		contentPane.add(panel_Eco);
		panel_Eco.setLayout(null);

		JToggleButton A1 = new JToggleButton("A1");
		A1.setBounds(0, 0, 30, 30);
		panel_Eco.add(A1);
		A1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A1.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));
		A1.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));

		JToggleButton B1 = new JToggleButton("");
		B1.setBounds(0, 40, 30, 30);
		panel_Eco.add(B1);
		B1.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));
		B1.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));

		final JToggleButton C1 = new JToggleButton("");
		C1.setBounds(0, 80, 30, 30);
		panel_Eco.add(C1);
		C1.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		final JToggleButton A2 = new JToggleButton("");
		A2.setBounds(40, 0, 30, 30);
		panel_Eco.add(A2);
		A2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

				A2.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));

			}
		});

		A2.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		final JToggleButton B2 = new JToggleButton("");
		B2.setBounds(40, 40, 30, 30);
		panel_Eco.add(B2);
		B2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

				B2.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));

			}
		});

		B2.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C2 = new JToggleButton("");
		C2.setBounds(40, 80, 30, 30);
		panel_Eco.add(C2);
		C2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C2.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C2.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A3 = new JToggleButton("");
		A3.setBounds(80, 0, 30, 30);
		panel_Eco.add(A3);
		A3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A3.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A3.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B3 = new JToggleButton("");
		B3.setBounds(80, 40, 30, 30);
		panel_Eco.add(B3);
		B3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B3.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B3.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C3 = new JToggleButton("");
		C3.setBounds(80, 80, 30, 30);
		panel_Eco.add(C3);
		C3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C3.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C3.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A4 = new JToggleButton("");
		A4.setBounds(120, 0, 30, 30);
		panel_Eco.add(A4);
		A4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A4.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A4.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B4 = new JToggleButton("");
		B4.setBounds(120, 40, 30, 30);
		panel_Eco.add(B4);
		B4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B4.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B4.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C4 = new JToggleButton("");
		C4.setBounds(120, 80, 30, 30);
		panel_Eco.add(C4);
		C4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C4.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C4.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A5 = new JToggleButton("");
		A5.setBounds(160, 0, 30, 30);
		panel_Eco.add(A5);
		A5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A5.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A5.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B5 = new JToggleButton("");
		B5.setBounds(160, 40, 30, 30);
		panel_Eco.add(B5);
		B5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B5.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B5.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C5 = new JToggleButton("");
		C5.setBounds(160, 80, 30, 30);
		panel_Eco.add(C5);
		C5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C5.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C5.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A6 = new JToggleButton("");
		A6.setBounds(200, 0, 30, 30);
		panel_Eco.add(A6);
		A6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A6.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A6.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B6 = new JToggleButton("");
		B6.setBounds(200, 40, 30, 30);
		panel_Eco.add(B6);
		B6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B6.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B6.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C6 = new JToggleButton("");
		C6.setBounds(200, 80, 30, 30);
		panel_Eco.add(C6);
		C6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C6.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C6.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A7 = new JToggleButton("");
		A7.setBounds(242, 0, 30, 30);
		panel_Eco.add(A7);
		A7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A7.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A7.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B7 = new JToggleButton("");
		B7.setBounds(242, 40, 30, 30);
		panel_Eco.add(B7);
		B7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B7.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B7.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C7 = new JToggleButton("");
		C7.setBounds(242, 80, 30, 30);
		panel_Eco.add(C7);
		C7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C7.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C7.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B8 = new JToggleButton("");
		B8.setBounds(282, 40, 30, 30);
		panel_Eco.add(B8);
		B8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B8.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B8.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C8 = new JToggleButton("");
		C8.setBounds(282, 80, 30, 30);
		panel_Eco.add(C8);
		C8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C8.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C8.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A8 = new JToggleButton("");
		A8.setBounds(282, 2, 30, 30);
		panel_Eco.add(A8);
		A8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A8.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A8.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B9 = new JToggleButton("");
		B9.setBounds(327, 40, 30, 30);
		panel_Eco.add(B9);
		B9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B9.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B9.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C9 = new JToggleButton("");
		C9.setBounds(327, 80, 30, 30);
		panel_Eco.add(C9);
		C9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C9.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C9.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A9 = new JToggleButton("");
		A9.setBounds(322, 2, 30, 30);
		panel_Eco.add(A9);
		A9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A9.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A9.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B10 = new JToggleButton("");
		B10.setBounds(367, 40, 30, 30);
		panel_Eco.add(B10);
		B10.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B10.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B10.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C10 = new JToggleButton("");
		C10.setBounds(367, 80, 30, 30);
		panel_Eco.add(C10);
		C10.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C10.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C10.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A10 = new JToggleButton("");
		A10.setBounds(365, 2, 30, 30);
		panel_Eco.add(A10);
		A10.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A10.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A10.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B11 = new JToggleButton("");
		B11.setBounds(410, 40, 30, 30);
		panel_Eco.add(B11);
		B11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B11.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B11.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C11 = new JToggleButton("");
		C11.setBounds(410, 80, 30, 30);
		panel_Eco.add(C11);
		C11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C11.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C11.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A11 = new JToggleButton("");
		A11.setBounds(405, 2, 30, 30);
		panel_Eco.add(A11);
		A11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A11.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A11.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B12 = new JToggleButton("");
		B12.setBounds(450, 40, 30, 30);
		panel_Eco.add(B12);
		B12.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B12.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B12.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C12 = new JToggleButton("");
		C12.setBounds(450, 80, 30, 30);
		panel_Eco.add(C12);
		C12.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C12.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C12.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A12 = new JToggleButton("");
		A12.setBounds(445, 2, 30, 30);
		panel_Eco.add(A12);
		A12.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A12.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A12.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B13 = new JToggleButton("");
		B13.setBounds(490, 40, 30, 30);
		panel_Eco.add(B13);
		B13.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B13.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B13.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C13 = new JToggleButton("");
		C13.setBounds(490, 80, 30, 30);
		panel_Eco.add(C13);
		C13.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C13.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C13.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A13 = new JToggleButton("");
		A13.setBounds(485, 2, 30, 30);
		panel_Eco.add(A13);
		A13.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A13.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A13.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B14 = new JToggleButton("");
		B14.setBounds(530, 40, 30, 30);
		panel_Eco.add(B14);
		B14.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B14.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B14.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C14 = new JToggleButton("");
		C14.setBounds(530, 80, 30, 30);
		panel_Eco.add(C14);
		C14.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C14.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C14.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A14 = new JToggleButton("");
		A14.setBounds(525, 2, 30, 30);
		panel_Eco.add(A14);
		A14.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A14.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A14.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B15 = new JToggleButton("");
		B15.setBounds(570, 40, 30, 30);
		panel_Eco.add(B15);
		B15.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B15.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B15.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C15 = new JToggleButton("");
		C15.setBounds(570, 80, 30, 30);
		panel_Eco.add(C15);
		C15.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C15.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		C15.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton A16 = new JToggleButton("");
		A16.setBounds(610, 0, 30, 30);
		panel_Eco.add(A16);
		A16.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A16.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A16.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton B16 = new JToggleButton("");
		B16.setBounds(610, 40, 30, 30);
		panel_Eco.add(B16);
		B16.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		B16.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		B16.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton C16 = new JToggleButton("");
		C16.setBounds(610, 82, 30, 30);
		panel_Eco.add(C16);
		C16.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		C16.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		JToggleButton A15 = new JToggleButton("");
		A15.setBounds(570, 2, 30, 30);
		panel_Eco.add(A15);
		A15.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});
		A15.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		A15.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));
		C16.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));
		C1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;
					C1.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;
					C1.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

				}
			}
		});
		B1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					EcoCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					EcoCount -= 1;

				}

			}
		});

		JPanel panel_Silver = new JPanel();
		panel_Silver.setBounds(44, 243, 640, 110);
		contentPane.add(panel_Silver);
		panel_Silver.setLayout(null);

		JToggleButton D1 = new JToggleButton("");
		D1.setBounds(0, 1, 30, 30);
		panel_Silver.add(D1);
		D1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D1.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D1.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton F1 = new JToggleButton("");
		F1.setBounds(0, 40, 30, 30);
		panel_Silver.add(F1);
		F1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		F1.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		F1.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_49 = new JToggleButton("");
		toggleButton_49.setBounds(0, 80, 30, 30);
		panel_Silver.add(toggleButton_49);
		toggleButton_49.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_49.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_49.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D2 = new JToggleButton("");
		D2.setBounds(40, 0, 30, 30);
		panel_Silver.add(D2);
		D2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D2.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D2.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_51 = new JToggleButton("");
		toggleButton_51.setBounds(40, 40, 30, 30);
		panel_Silver.add(toggleButton_51);
		toggleButton_51.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_51.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_51.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_52 = new JToggleButton("");
		toggleButton_52.setBounds(40, 80, 30, 30);
		panel_Silver.add(toggleButton_52);
		toggleButton_52.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_52.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_52.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D3 = new JToggleButton("");
		D3.setBounds(80, 0, 30, 30);
		panel_Silver.add(D3);
		D3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D3.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D3.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_54 = new JToggleButton("");
		toggleButton_54.setBounds(80, 40, 30, 30);
		panel_Silver.add(toggleButton_54);
		toggleButton_54.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_54.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_54.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_55 = new JToggleButton("");
		toggleButton_55.setBounds(80, 80, 30, 30);
		panel_Silver.add(toggleButton_55);
		toggleButton_55.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_55.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_55.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D4 = new JToggleButton("");
		D4.setBounds(120, 0, 30, 30);
		panel_Silver.add(D4);
		D4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D4.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D4.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_57 = new JToggleButton("");
		toggleButton_57.setBounds(120, 40, 30, 30);
		panel_Silver.add(toggleButton_57);
		toggleButton_57.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_57.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_57.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_58 = new JToggleButton("");
		toggleButton_58.setBounds(120, 80, 30, 30);
		panel_Silver.add(toggleButton_58);
		toggleButton_58.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_58.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_58.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D5 = new JToggleButton("");
		D5.setBounds(160, 0, 30, 30);
		panel_Silver.add(D5);
		D5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D5.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D5.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_60 = new JToggleButton("");
		toggleButton_60.setBounds(160, 40, 30, 30);
		panel_Silver.add(toggleButton_60);
		toggleButton_60.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_60.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_60.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_61 = new JToggleButton("");
		toggleButton_61.setBounds(160, 80, 30, 30);
		panel_Silver.add(toggleButton_61);
		toggleButton_61.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_61.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_61.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D6 = new JToggleButton("");
		D6.setBounds(200, 0, 30, 30);
		panel_Silver.add(D6);
		D6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D6.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D6.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_63 = new JToggleButton("");
		toggleButton_63.setBounds(200, 40, 30, 30);
		panel_Silver.add(toggleButton_63);
		toggleButton_63.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_63.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_63.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_64 = new JToggleButton("");
		toggleButton_64.setBounds(200, 80, 30, 30);
		panel_Silver.add(toggleButton_64);
		toggleButton_64.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_64.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_64.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D7 = new JToggleButton("");
		D7.setBounds(242, 0, 30, 30);
		panel_Silver.add(D7);
		D7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D7.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D7.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_66 = new JToggleButton("");
		toggleButton_66.setBounds(242, 40, 30, 30);
		panel_Silver.add(toggleButton_66);
		toggleButton_66.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_66.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_66.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_67 = new JToggleButton("");
		toggleButton_67.setBounds(242, 80, 30, 30);
		panel_Silver.add(toggleButton_67);
		toggleButton_67.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_67.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_67.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D8 = new JToggleButton("");
		D8.setBounds(282, 0, 30, 30);
		panel_Silver.add(D8);
		D8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D8.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D8.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_69 = new JToggleButton("");
		toggleButton_69.setBounds(282, 40, 30, 30);
		panel_Silver.add(toggleButton_69);
		toggleButton_69.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_69.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_69.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_70 = new JToggleButton("");
		toggleButton_70.setBounds(282, 80, 30, 30);
		panel_Silver.add(toggleButton_70);
		toggleButton_70.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_70.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_70.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D9 = new JToggleButton("");
		D9.setBounds(327, 0, 30, 30);
		panel_Silver.add(D9);
		D9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D9.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D9.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_72 = new JToggleButton("");
		toggleButton_72.setBounds(327, 40, 30, 30);
		panel_Silver.add(toggleButton_72);
		toggleButton_72.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_72.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_72.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_73 = new JToggleButton("");
		toggleButton_73.setBounds(327, 80, 30, 30);
		panel_Silver.add(toggleButton_73);
		toggleButton_73.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_73.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_73.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D10 = new JToggleButton("");
		D10.setBounds(367, 0, 30, 30);
		panel_Silver.add(D10);
		D10.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D10.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D10.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_75 = new JToggleButton("");
		toggleButton_75.setBounds(367, 40, 30, 30);
		panel_Silver.add(toggleButton_75);
		toggleButton_75.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_75.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_75.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_76 = new JToggleButton("");
		toggleButton_76.setBounds(367, 80, 30, 30);
		panel_Silver.add(toggleButton_76);
		toggleButton_76.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_76.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_76.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D11 = new JToggleButton("");
		D11.setBounds(410, 0, 30, 30);
		panel_Silver.add(D11);
		D11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D11.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D11.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_78 = new JToggleButton("");
		toggleButton_78.setBounds(410, 40, 30, 30);
		panel_Silver.add(toggleButton_78);
		toggleButton_78.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_78.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_78.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_79 = new JToggleButton("");
		toggleButton_79.setBounds(410, 80, 30, 30);
		panel_Silver.add(toggleButton_79);
		toggleButton_79.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_79.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_79.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D12 = new JToggleButton("");
		D12.setBounds(450, 0, 30, 30);
		panel_Silver.add(D12);
		D12.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D12.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D12.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_81 = new JToggleButton("");
		toggleButton_81.setBounds(450, 40, 30, 30);
		panel_Silver.add(toggleButton_81);
		toggleButton_81.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_81.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_81.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_82 = new JToggleButton("");
		toggleButton_82.setBounds(450, 80, 30, 30);
		panel_Silver.add(toggleButton_82);
		toggleButton_82.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_82.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_82.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D13 = new JToggleButton("");
		D13.setBounds(490, 0, 30, 30);
		panel_Silver.add(D13);
		D13.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D13.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D13.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_84 = new JToggleButton("");
		toggleButton_84.setBounds(490, 40, 30, 30);
		panel_Silver.add(toggleButton_84);
		toggleButton_84.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_84.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_84.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_85 = new JToggleButton("");
		toggleButton_85.setBounds(490, 80, 30, 30);
		panel_Silver.add(toggleButton_85);
		toggleButton_85.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_85.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_85.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D14 = new JToggleButton("");
		D14.setBounds(530, 0, 30, 30);
		panel_Silver.add(D14);
		D14.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D14.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D14.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_87 = new JToggleButton("");
		toggleButton_87.setBounds(530, 40, 30, 30);
		panel_Silver.add(toggleButton_87);
		toggleButton_87.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_87.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_87.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_88 = new JToggleButton("");
		toggleButton_88.setBounds(530, 80, 30, 30);
		panel_Silver.add(toggleButton_88);
		toggleButton_88.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_88.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_88.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D15 = new JToggleButton("");
		D15.setBounds(570, 0, 30, 30);
		panel_Silver.add(D15);
		D15.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D15.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D15.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_90 = new JToggleButton("");
		toggleButton_90.setBounds(570, 40, 30, 30);
		panel_Silver.add(toggleButton_90);
		toggleButton_90.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_90.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_90.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_91 = new JToggleButton("");
		toggleButton_91.setBounds(570, 80, 30, 30);
		panel_Silver.add(toggleButton_91);
		toggleButton_91.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_91.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_91.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton D16 = new JToggleButton("");
		D16.setBounds(610, 0, 30, 30);
		panel_Silver.add(D16);
		D16.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		D16.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		D16.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_93 = new JToggleButton("");
		toggleButton_93.setBounds(610, 40, 30, 30);
		panel_Silver.add(toggleButton_93);
		toggleButton_93.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_93.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_93.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_94 = new JToggleButton("");
		toggleButton_94.setBounds(610, 80, 30, 30);
		panel_Silver.add(toggleButton_94);
		toggleButton_94.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					SilverCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					SilverCount -= 1;

				}

			}
		});
		toggleButton_94.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_94.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JPanel panel_Gold = new JPanel();
		panel_Gold.setBounds(44, 385, 640, 110);
		contentPane.add(panel_Gold);
		panel_Gold.setLayout(null);

		JToggleButton toggleButton_95 = new JToggleButton("");
		toggleButton_95.setBounds(0, 0, 30, 30);
		panel_Gold.add(toggleButton_95);
		toggleButton_95.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_95.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_95.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_96 = new JToggleButton("");
		toggleButton_96.setBounds(0, 40, 30, 30);
		panel_Gold.add(toggleButton_96);
		toggleButton_96.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_96.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_96.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_97 = new JToggleButton("");
		toggleButton_97.setBounds(0, 80, 30, 30);
		panel_Gold.add(toggleButton_97);
		toggleButton_97.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_97.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_97.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_98 = new JToggleButton("");
		toggleButton_98.setBounds(40, 0, 30, 30);
		panel_Gold.add(toggleButton_98);
		toggleButton_98.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_98.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_98.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_99 = new JToggleButton("");
		toggleButton_99.setBounds(40, 40, 30, 30);
		panel_Gold.add(toggleButton_99);
		toggleButton_99.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_99.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_99.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_100 = new JToggleButton("");
		toggleButton_100.setBounds(40, 80, 30, 30);
		panel_Gold.add(toggleButton_100);
		toggleButton_100.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_100.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_100.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_101 = new JToggleButton("");
		toggleButton_101.setBounds(80, 0, 30, 30);
		panel_Gold.add(toggleButton_101);
		toggleButton_101.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_101.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_101.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_102 = new JToggleButton("");
		toggleButton_102.setBounds(80, 40, 30, 30);
		panel_Gold.add(toggleButton_102);
		toggleButton_102.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_102.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_102.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_103 = new JToggleButton("");
		toggleButton_103.setBounds(80, 80, 30, 30);
		panel_Gold.add(toggleButton_103);
		toggleButton_103.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_103.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_103.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_104 = new JToggleButton("");
		toggleButton_104.setBounds(120, 0, 30, 30);
		panel_Gold.add(toggleButton_104);
		toggleButton_104.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_104.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_104.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_105 = new JToggleButton("");
		toggleButton_105.setBounds(120, 40, 30, 30);
		panel_Gold.add(toggleButton_105);
		toggleButton_105.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_105.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_105.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_106 = new JToggleButton("");
		toggleButton_106.setBounds(120, 80, 30, 30);
		panel_Gold.add(toggleButton_106);
		toggleButton_106.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_106.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_106.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_107 = new JToggleButton("");
		toggleButton_107.setBounds(160, 0, 30, 30);
		panel_Gold.add(toggleButton_107);
		toggleButton_107.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_107.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_107.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_108 = new JToggleButton("");
		toggleButton_108.setBounds(160, 40, 30, 30);
		panel_Gold.add(toggleButton_108);
		toggleButton_108.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_108.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_108.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_109 = new JToggleButton("");
		toggleButton_109.setBounds(160, 80, 30, 30);
		panel_Gold.add(toggleButton_109);
		toggleButton_109.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_109.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_109.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_110 = new JToggleButton("");
		toggleButton_110.setBounds(200, 0, 30, 30);
		panel_Gold.add(toggleButton_110);
		toggleButton_110.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_110.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_110.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_111 = new JToggleButton("");
		toggleButton_111.setBounds(200, 40, 30, 30);
		panel_Gold.add(toggleButton_111);
		toggleButton_111.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_111.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_111.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_112 = new JToggleButton("");
		toggleButton_112.setBounds(200, 80, 30, 30);
		panel_Gold.add(toggleButton_112);
		toggleButton_112.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_112.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_112.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_113 = new JToggleButton("");
		toggleButton_113.setBounds(242, 0, 30, 30);
		panel_Gold.add(toggleButton_113);
		toggleButton_113.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_113.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_113.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_114 = new JToggleButton("");
		toggleButton_114.setBounds(242, 40, 30, 30);
		panel_Gold.add(toggleButton_114);
		toggleButton_114.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_114.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_114.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_115 = new JToggleButton("");
		toggleButton_115.setBounds(242, 80, 30, 30);
		panel_Gold.add(toggleButton_115);
		toggleButton_115.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_115.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_115.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_116 = new JToggleButton("");
		toggleButton_116.setBounds(282, 0, 30, 30);
		panel_Gold.add(toggleButton_116);
		toggleButton_116.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_116.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_116.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_117 = new JToggleButton("");
		toggleButton_117.setBounds(282, 40, 30, 30);
		panel_Gold.add(toggleButton_117);
		toggleButton_117.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_117.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_117.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_118 = new JToggleButton("");
		toggleButton_118.setBounds(282, 80, 30, 30);
		panel_Gold.add(toggleButton_118);
		toggleButton_118.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_118.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_118.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_119 = new JToggleButton("");
		toggleButton_119.setBounds(327, 0, 30, 30);
		panel_Gold.add(toggleButton_119);
		toggleButton_119.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_119.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_119.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_120 = new JToggleButton("");
		toggleButton_120.setBounds(327, 40, 30, 30);
		panel_Gold.add(toggleButton_120);
		toggleButton_120.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_120.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_120.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_121 = new JToggleButton("");
		toggleButton_121.setBounds(327, 80, 30, 30);
		panel_Gold.add(toggleButton_121);
		toggleButton_121.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_121.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_121.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_122 = new JToggleButton("");
		toggleButton_122.setBounds(367, 0, 30, 30);
		panel_Gold.add(toggleButton_122);
		toggleButton_122.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_122.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_122.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_123 = new JToggleButton("");
		toggleButton_123.setBounds(367, 40, 30, 30);
		panel_Gold.add(toggleButton_123);
		toggleButton_123.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_123.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_123.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_124 = new JToggleButton("");
		toggleButton_124.setBounds(367, 80, 30, 30);
		panel_Gold.add(toggleButton_124);
		toggleButton_124.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_124.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_124.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_125 = new JToggleButton("");
		toggleButton_125.setBounds(410, 0, 30, 30);
		panel_Gold.add(toggleButton_125);
		toggleButton_125.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_125.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_125.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_126 = new JToggleButton("");
		toggleButton_126.setBounds(410, 40, 30, 30);
		panel_Gold.add(toggleButton_126);
		toggleButton_126.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_126.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_126.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_127 = new JToggleButton("");
		toggleButton_127.setBounds(410, 80, 30, 30);
		panel_Gold.add(toggleButton_127);
		toggleButton_127.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_127.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_127.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_128 = new JToggleButton("");
		toggleButton_128.setBounds(450, 0, 30, 30);
		panel_Gold.add(toggleButton_128);
		toggleButton_128.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_128.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_128.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_129 = new JToggleButton("");
		toggleButton_129.setBounds(450, 40, 30, 30);
		panel_Gold.add(toggleButton_129);
		toggleButton_129.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_129.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_129.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_130 = new JToggleButton("");
		toggleButton_130.setBounds(450, 80, 30, 30);
		panel_Gold.add(toggleButton_130);
		toggleButton_130.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_130.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_130.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_131 = new JToggleButton("");
		toggleButton_131.setBounds(490, 0, 30, 30);
		panel_Gold.add(toggleButton_131);
		toggleButton_131.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_131.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_131.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_132 = new JToggleButton("");
		toggleButton_132.setBounds(490, 40, 30, 30);
		panel_Gold.add(toggleButton_132);
		toggleButton_132.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_132.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_132.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_133 = new JToggleButton("");
		toggleButton_133.setBounds(490, 80, 30, 30);
		panel_Gold.add(toggleButton_133);
		toggleButton_133.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_133.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_133.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_134 = new JToggleButton("");
		toggleButton_134.setBounds(530, 0, 30, 30);
		panel_Gold.add(toggleButton_134);
		toggleButton_134.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_134.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_134.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_135 = new JToggleButton("");
		toggleButton_135.setBounds(530, 40, 30, 30);
		panel_Gold.add(toggleButton_135);
		toggleButton_135.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_135.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_135.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_136 = new JToggleButton("");
		toggleButton_136.setBounds(530, 80, 30, 30);
		panel_Gold.add(toggleButton_136);
		toggleButton_136.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_136.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_136.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_137 = new JToggleButton("");
		toggleButton_137.setBounds(570, 0, 30, 30);
		panel_Gold.add(toggleButton_137);
		toggleButton_137.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_137.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_137.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_138 = new JToggleButton("");
		toggleButton_138.setBounds(570, 40, 30, 30);
		panel_Gold.add(toggleButton_138);
		toggleButton_138.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_138.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_138.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_139 = new JToggleButton("");
		toggleButton_139.setBounds(570, 80, 30, 30);
		panel_Gold.add(toggleButton_139);
		toggleButton_139.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_139.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_139.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_140 = new JToggleButton("");
		toggleButton_140.setBounds(610, 0, 30, 30);
		panel_Gold.add(toggleButton_140);
		toggleButton_140.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_140.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_140.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_141 = new JToggleButton("");
		toggleButton_141.setBounds(610, 40, 30, 30);
		panel_Gold.add(toggleButton_141);
		toggleButton_141.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_141.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_141.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JToggleButton toggleButton_142 = new JToggleButton("");
		toggleButton_142.setBounds(610, 80, 30, 30);
		panel_Gold.add(toggleButton_142);
		toggleButton_142.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					GoldCount += 1;

				} else if (e.getStateChange() == ItemEvent.DESELECTED) {
					GoldCount -= 1;

				}

			}
		});
		toggleButton_142.setSelectedIcon(new ImageIcon(SeatLayout.class.getResource("/images/download--1-.jpg")));
		toggleButton_142.setIcon(new ImageIcon(SeatLayout.class.getResource("/images/Webp.net-resizeimage.jpg")));

		JLabel lblMovieName = new JLabel("Movie Name :- " + Seat_availability.moName);
		lblMovieName.setBounds(34, 527, 407, 13);
		contentPane.add(lblMovieName);

		JLabel lblTiming = new JLabel("Timing:- " + Seat_availability.timming);
		lblTiming.setBounds(34, 565, 112, 13);
		contentPane.add(lblTiming);

		JLabel lblTicketType = new JLabel("Ticket Type:- " + Seat_availability.moType);
		lblTicketType.setBounds(273, 565, 128, 13);
		contentPane.add(lblTicketType);

		JLabel lblPriceOf = new JLabel("Price of " + Seat_availability.moType + " ticket = " + Seat_availability.pRice);
		lblPriceOf.setBounds(519, 565, 165, 13);
		contentPane.add(lblPriceOf);

		final JTextPane textPane = new JTextPane();
		textPane.setBounds(716, 174, 266, 201);
		contentPane.add(textPane);
		
		

		JButton btnShowTotalPrice = new JButton("Show Total Price");
		btnShowTotalPrice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.out.println("Gold= "+GoldCount+" ECo= "+EcoCount+" Silver "+SilverCount);
				if (Seat_availability.moType.equals("Gold")) {
					textPane.setText("Gold Ticket = " + GoldCount + "*" + Seat_availability.GPrice + " = "
							+ GoldCount * Seat_availability.GPrice + "" + "\n\n\n\nTotal = "
							+ ((GoldCount * Seat_availability.GPrice)));
					textPane.setEditable(false);
				} else if (Seat_availability.moType.equals("Eco")) {
					textPane.setText("Economy Ticket = " + EcoCount + "*" + Seat_availability.EPrice + " = "
							+ EcoCount * Seat_availability.EPrice);
					textPane.setEditable(false);
				} else if (Seat_availability.moType.equals("Silver")) {
					textPane.setText("Silver Ticket =" + SilverCount + "*" + Seat_availability.SPrice + " = "
							+ SilverCount * Seat_availability.SPrice);
					textPane.setEditable(false);

				}
				TotalPrice = (GoldCount * Seat_availability.GPrice) + (EcoCount * Seat_availability.EPrice)
						+ (SilverCount * Seat_availability.SPrice);

				System.out.println(TotalPrice);
			}
		});
		btnShowTotalPrice.setBounds(790, 108, 143, 21);
		contentPane.add(btnShowTotalPrice);

		JButton btnConfirmingBooking = new JButton("Confirming Booking");
		btnConfirmingBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int ix = 5;
				if (Seat_availability.moType.equals("Gold")) {
					ix = JOptionPane.showConfirmDialog(null, "Gold Ticket = " + GoldCount + "*"
							+ Seat_availability.GPrice + " = " + GoldCount * Seat_availability.GPrice);
					TotalPrice = (GoldCount * Seat_availability.GPrice);
				} else if (Seat_availability.moType.equals("Eco")) {
					ix = JOptionPane.showConfirmDialog(null, "Economy Ticket = " + EcoCount + "*"
							+ Seat_availability.EPrice + " = " + EcoCount * Seat_availability.EPrice);
					TotalPrice = (EcoCount * Seat_availability.EPrice);
				} else if (Seat_availability.moType.equals("Silver")) {
					ix = JOptionPane.showConfirmDialog(null, "Silver Ticket =" + SilverCount + "*"
							+ Seat_availability.SPrice + " = " + SilverCount * Seat_availability.SPrice);
					TotalPrice = (SilverCount * Seat_availability.SPrice);
				}
				/*
				 * ix=JOptionPane.showConfirmDialog(null,"Economy Ticket = " + EcoCount + "*" +
				 * Seat_availability.EPrice + " = " + EcoCount * Seat_availability.EPrice + "\n"
				 * + "Silver Ticket =" + SilverCount + "*" + Seat_availability.SPrice + " = " +
				 * SilverCount * Seat_availability.SPrice + "\n" + "Gold Ticket = " + GoldCount
				 * + "*" + Seat_availability.GPrice + " = " + GoldCount *
				 * Seat_availability.GPrice + "" + "\n\n\n\nTotal = " + ((GoldCount *
				 * Seat_availability.GPrice) + (EcoCount * Seat_availability.EPrice) +
				 * (SilverCount *
				 * Seat_availability.SPrice))+"\n Do you Want to proceed to Payment");
				 */
				TotalPrice = (GoldCount * Seat_availability.GPrice) + (EcoCount * Seat_availability.EPrice)
						+ (SilverCount * Seat_availability.SPrice);

				if (ix == 0) {
					new Confirm_Booking().setVisible(true);
					dispose();
				} else if (ix == 1 || ix == 2) {
					JOptionPane.showMessageDialog(null, "NO payable amount");
				}

			}
		});
		btnConfirmingBooking.setBounds(773, 425, 160, 21);
		contentPane.add(btnConfirmingBooking);

		JLabel toggleButton = new JLabel("1");
		toggleButton.setHorizontalAlignment(SwingConstants.CENTER);
		toggleButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton.setBounds(44, 497, 30, 30);
		contentPane.add(toggleButton);

		JLabel toggleButton_1 = new JLabel("2");
		toggleButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		toggleButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_1.setBounds(84, 497, 30, 30);
		contentPane.add(toggleButton_1);

		JLabel toggleButton_2 = new JLabel("3");
		toggleButton_2.setHorizontalAlignment(SwingConstants.CENTER);
		toggleButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_2.setBounds(124, 497, 30, 30);
		contentPane.add(toggleButton_2);

		JLabel toggleButton_3 = new JLabel("4");
		toggleButton_3.setHorizontalAlignment(SwingConstants.CENTER);
		toggleButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_3.setBounds(164, 497, 30, 30);
		contentPane.add(toggleButton_3);

		JLabel toggleButton_143 = new JLabel("5");
		toggleButton_143.setHorizontalAlignment(SwingConstants.CENTER);
		toggleButton_143.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_143.setBounds(204, 497, 30, 30);
		contentPane.add(toggleButton_143);

		JLabel toggleButton_144 = new JLabel("6");
		toggleButton_144.setHorizontalAlignment(SwingConstants.CENTER);
		toggleButton_144.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_144.setBounds(244, 497, 30, 30);
		contentPane.add(toggleButton_144);

		JLabel toggleButton_145 = new JLabel("7");
		toggleButton_145.setHorizontalAlignment(SwingConstants.CENTER);
		toggleButton_145.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_145.setBounds(286, 497, 30, 30);
		contentPane.add(toggleButton_145);

		JLabel toggleButton_146 = new JLabel("8");
		toggleButton_146.setHorizontalAlignment(SwingConstants.CENTER);
		toggleButton_146.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_146.setBounds(326, 497, 30, 30);
		contentPane.add(toggleButton_146);

		JLabel label = new JLabel("9");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(372, 497, 30, 30);
		contentPane.add(label);

		JLabel label_1 = new JLabel("10");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(412, 497, 30, 30);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("11");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_2.setBounds(452, 497, 30, 30);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("12");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_3.setBounds(492, 497, 30, 30);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("13");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_4.setBounds(532, 497, 30, 30);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("14");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(572, 497, 30, 30);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("15");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(614, 497, 30, 30);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("16");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_7.setBounds(654, 497, 30, 30);
		contentPane.add(label_7);

		JLabel toggleButton_147 = new JLabel("A");
		toggleButton_147.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_147.setHorizontalAlignment(SwingConstants.CENTER);
		toggleButton_147.setBounds(10, 99, 30, 30);
		contentPane.add(toggleButton_147);

		JLabel toggleButton_148 = new JLabel("B");
		toggleButton_148.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_148.setHorizontalAlignment(SwingConstants.CENTER);
		toggleButton_148.setBounds(10, 139, 30, 30);
		contentPane.add(toggleButton_148);

		JLabel toggleButton_149 = new JLabel("C");
		toggleButton_149.setFont(new Font("Tahoma", Font.BOLD, 14));
		toggleButton_149.setHorizontalAlignment(SwingConstants.CENTER);
		toggleButton_149.setBounds(10, 179, 30, 30);
		contentPane.add(toggleButton_149);

		JLabel label_8 = new JLabel("D");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_8.setBounds(10, 243, 30, 30);
		contentPane.add(label_8);

		JLabel label_9 = new JLabel("E");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_9.setBounds(10, 323, 30, 30);
		contentPane.add(label_9);

		JLabel label_10 = new JLabel("F");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_10.setBounds(10, 283, 30, 30);
		contentPane.add(label_10);

		JLabel label_11 = new JLabel("G");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_11.setBounds(10, 385, 30, 30);
		contentPane.add(label_11);

		JLabel label_12 = new JLabel("H");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_12.setBounds(10, 465, 30, 30);
		contentPane.add(label_12);

		JLabel label_13 = new JLabel("I");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_13.setBounds(10, 425, 30, 30);
		contentPane.add(label_13);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Are you sure to exit");
				System.out.println(i);
				if (i <= 0) {
					dispose();
					new Seat_availability().setVisible(true);
				} else if (i == 1 || i == 2) {

				}
			}
		});
		btnExit.setBounds(790, 472, 135, 21);
		contentPane.add(btnExit);

		
			
		
		if (Seat_availability.moType.equals("Gold")) {
			panel_Gold.isShowing();
			panel_Eco.show(false);
			panel_Silver.show(false);
		} else if (Seat_availability.moType.equals("Eco")) {
			panel_Gold.show(false);
			panel_Eco.isShowing();
			panel_Silver.show(false);

		} else if (Seat_availability.moType.equals("Silver")) {
			panel_Silver.isShowing();
			panel_Eco.show(false);
			panel_Gold.show(false);
		}

	}
}
