package java_Projet_Calculatrice;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CalculatorSamSar {

	//Private attribute: frame of type JFrame // This allows you to create a frame, i.e. the framework of the application.
	private JFrame frame;
	
	private double firstNum;
	private double secondNum;
	private double result;
	// the operations + - * ÷
	private String symbole;
	
	// variables of boutons M+ M- MRC
	private int k = 1;
	private static double m1;	

	/**
	 * Launch the application.
	 */
	// Main method which is launched for the execution of the program
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorSamSar window = new CalculatorSamSar();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	// Constructor which is called in the main
	public CalculatorSamSar() {
		calculatriceBtn();
	}

	private void calculatriceBtn() {
		frame = new JFrame("Calculator SamSar");
		frame.getContentPane().setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.GRAY);
		panel.setBorder(null);
		panel.setBackground(Color.DARK_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(21, 27, 303, 80);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		// display screen 
		JLabel displayScreen = new JLabel();
		displayScreen.setBounds(6, 6, 291, 68);
		panel_1.add(displayScreen);
		displayScreen.setHorizontalAlignment(SwingConstants.RIGHT);
		displayScreen.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		displayScreen.setForeground(Color.BLACK);
		displayScreen.setBackground(Color.BLACK);
		
		/**
		 * Block of the buttons	
		 */
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 150, 338, 327);
		panel.add(panel_2);		
		
		/**
		 * The Buttons of Numbers
		 */
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = displayScreen.getText() + btn0.getText();
				displayScreen.setText(EnterNumber); 
			}
		});
		
		
				JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = displayScreen.getText() + btn1.getText();
				displayScreen.setText(EnterNumber); 
			}
			
		});		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = displayScreen.getText() + btn2.getText();
				displayScreen.setText(EnterNumber); 
			}
		});		
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = displayScreen.getText() + btn3.getText();
				displayScreen.setText(EnterNumber); 
			}
		});
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = displayScreen.getText() + btn4.getText();
				displayScreen.setText(EnterNumber); 
			}
		}); 
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = displayScreen.getText() + btn5.getText();
				displayScreen.setText(EnterNumber); 
			}
		}); 
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = displayScreen.getText() + btn6.getText();
				displayScreen.setText(EnterNumber); 
			}
		}); 
		
		JButton btn7 = new JButton("7");
		 btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String EnterNumber = displayScreen.getText() + btn7.getText();
					displayScreen.setText(EnterNumber); 
				}
			}); 
		 
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = displayScreen.getText() + btn8.getText();
				displayScreen.setText(EnterNumber); 
			}
		});  
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = displayScreen.getText() + btn9.getText();
				displayScreen.setText(EnterNumber); 
			}
		}); 
 		
		// Button DOT , ex: 23.34 , 123.23
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(displayScreen.getText()=="") {
					displayScreen.setText("ERROR");
				}
				else {
					String EnterNumber = displayScreen.getText() + ".";
					displayScreen.setText(EnterNumber); 
				}
			}
		});
		
		/**
		 * The Buttons of Fonctions
		 */
		
		// button CE : backSpace
		JButton btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if(displayScreen.getText().length() > 0) {
					// get Text from Screen 
					StringBuilder strB = new StringBuilder(displayScreen.getText()); 
					// delete one by one character of Text
					strB.deleteCharAt(displayScreen.getText().length()-1);
					backSpace = strB.toString();
					displayScreen.setText(backSpace);
				}
			}
		}); 
		
		// button ON_C : to reset at 0 / to start calcul 
		JButton btnON_C = new JButton("ON/C");
		btnON_C.setForeground(Color.RED);
		btnON_C.setBackground(Color.RED);
		btnON_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displayScreen.setText("");
			firstNum = 0;
			secondNum = 0;
			result = 0;
			symbole = "";
			}
		}); 
		
		// button Percent %
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(displayScreen.getText());
				displayScreen.setText(String.valueOf(firstNum/100));
			}
		}); 	
		
		// button SQRT 
		JButton btnSQRT = new JButton("√A");
		btnSQRT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(displayScreen.getText());
				displayScreen.setText(String.valueOf(Math.sqrt(firstNum)));
			}
		}); 
		
		// button subtract
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				symbole = "-";
			}
		});
		
		// button add
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				symbole = "+";
			}
		});
		
		// button multiply
		JButton btnMulti = new JButton("x");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(displayScreen.getText());
				displayScreen.setText("");
				symbole = "x";
			}
		});
		
		// button to convert a number into negatif or positive 
		JButton btnPlusSub = new JButton("+/-");
		btnPlusSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops  = Double.parseDouble(String.valueOf(displayScreen.getText()));
				ops = ops*(-1);
				displayScreen.setText(String.valueOf(ops));
				symbole = "+/-";
			}
		});
		
	// button divide
		JButton btnDev = new JButton("÷");
		btnDev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			      try{
			          firstNum = Double.parseDouble(displayScreen.getText());
			          displayScreen.setText("");
				symbole = "÷";
			        } catch(ArithmeticException z) {
			        	displayScreen.setText("0");
			        }
			}
		});
		
		// button egal : it has the relationship with the process of the buttons + - * ÷
		JButton btnEgal = new JButton("=");
		btnEgal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result = 0;
				secondNum = Double.parseDouble(displayScreen.getText());
				if(symbole == "+") {
					result = firstNum + secondNum;
					displayScreen.setText(String.valueOf(result));
					
				} else if (symbole == "-") {
					result = firstNum - secondNum;
					displayScreen.setText(String.valueOf(result));
	
				} else if (symbole == "x") {
					result = firstNum*secondNum;
					displayScreen.setText(String.valueOf(result));
				
				} else if (symbole == "÷") {
					result = firstNum/secondNum;
					displayScreen.setText(String.valueOf(result));
				} 
			}
		});
		
		/**
		 *  the buttons "memory" 
		 */
		
		// Button MRC: to show the result memoried
		JButton btnMRC = new JButton("MRC");
		btnMRC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   displayScreen.setText("");
				   displayScreen.setText(displayScreen.getText() + m1);
			}
			
		}); 

		// Button M+ to add a value into memory 
		JButton btnM_plus = new JButton("M+");
		btnM_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(displayScreen.getText() == "") {
					m1 = 0;
					displayScreen.setText(" ");
					} 
				else {
					if(k==1) {
					m1 = Double.parseDouble(displayScreen.getText());
					k++;
				} else {
					m1+=Double.parseDouble(displayScreen.getText());
					displayScreen.setText(" ");
				
		            }   }}

			}); 
		
		// Button M- to subtract a value from memory 
		
		JButton btnM_sub = new JButton("M-");
		btnM_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(displayScreen.getText() == "") {
					m1 = 0;
					displayScreen.setText(" ");
					} 
				else {
				if(k==1) {
					m1 = Double.parseDouble(displayScreen.getText());
					k++;
				} else {
					m1-=Double.parseDouble(displayScreen.getText());
					displayScreen.setText(" ");
				
		            }   } }
			}); 
		
// The grid position of the buttons
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_panel_2.createSequentialGroup()
								.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(btnPercent, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addGap(6)
								.addComponent(btnSQRT, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel_2.createSequentialGroup()
								.addComponent(btnMRC, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnM_plus, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnM_sub, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnCE, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnON_C, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(btnMulti, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_2.createSequentialGroup()
											.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_panel_2.createSequentialGroup()
											.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(btnDot, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
											.addGap(6)
											.addComponent(btnPlusSub, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnPlus, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDev, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnSub, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnEgal, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(8, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnON_C, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnCE, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnM_sub, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnM_plus, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnMRC, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btn7, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn8, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(btn9, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPercent, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSQRT, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(btn4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn6, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnMulti, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(btn1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(btn3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addComponent(btn0, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDot, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnPlusSub, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(btnDev, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(btnSub, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(btnEgal, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnPlus, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))))
					.addGap(192))
		);
		panel_2.setLayout(gl_panel_2);
		frame.setBounds(10, 10, 350, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
