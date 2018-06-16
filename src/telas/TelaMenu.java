package telas;

import java.awt.EventQueue;
//import java.awt.Image;

import javax.swing.JFrame;
//import javax.swing.JMenuBar;
import javax.swing.JButton;
//import javax.swing.JMenuItem;
//import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
//import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//@SuppressWarnings("unused")
public class TelaMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu window = new TelaMenu();
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
	public TelaMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 805, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnMaster = new JButton("Master");
		btnMaster.setBounds(10, 11, 89, 23);
		btnMaster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
			
			//Formulário Master
			
			
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnMaster);
		
		JButton btnAgente = new JButton("Agente");
		btnAgente.setBounds(109, 11, 89, 23);
		frame.getContentPane().add(btnAgente);
		
		JButton btnBeneficirio = new JButton("Benefici\u00E1rio");
		btnBeneficirio.setBounds(208, 11, 104, 23);
		frame.getContentPane().add(btnBeneficirio);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\BACK 29-03-18\\Recovery bass\\Recovered data 03-18 23_11_59\\Deep Scan result\\Lost Partition3(NTFS)\\ADS\\NASSAU\\TCC\\(LOGO) milk_in_the_fandoOK.png"));
		label.setBounds(20, 68, 769, 353);
		frame.getContentPane().add(label);
		//ImageIcon imagem= new ImageIcon (TelaMenu.class.getResource("/MilkInTheHand/(LOGO_fundo) milk_in_the_hand"));
	}
}
