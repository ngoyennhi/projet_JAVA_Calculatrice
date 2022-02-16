package java_Projet_Calculatrice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class CalculatriceSamSar {

	//Attribut prive: frame de type JFame
	// Cela permet de créer une frame c'est à dire le cadre de l'application.
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	//Methode main qui est lancer pour l'execution du programme
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatriceSamSar window = new CalculatriceSamSar();
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
	// Constructeur qui est appele dans le main 
	public CalculatriceSamSar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//Methode initialize qui est appele dans le constructeur
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_container = new JPanel();
		panel_container.setBackground(Color.PINK);
		panel_container.setForeground(Color.BLACK);
		frame.getContentPane().add(panel_container, BorderLayout.CENTER);
		panel_container.setLayout(new MigLayout("", "[100][100][100][][100][100][100]", "[50][50][50][50][50][50]"));
		
		JLabel label_title = new JLabel("Hello SamSar!");
		panel_container.add(label_title, "cell 3 3,alignx center,aligny center");
		
	}

}
