package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
//import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormularioAgente {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioAgente window = new FormularioAgente();
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
	public FormularioAgente() {
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
		frame.getContentPane().setLayout(null);
		
		JLabel lblFormulrioAgente = new JLabel("FORMUL\u00C1RIO AGENTE");
		lblFormulrioAgente.setForeground(Color.RED);
		lblFormulrioAgente.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFormulrioAgente.setBounds(318, 11, 193, 27);
		frame.getContentPane().add(lblFormulrioAgente);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 60, 46, 14);
		frame.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(10, 74, 586, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFone = new JLabel("Fone");
		lblFone.setBounds(606, 60, 46, 14);
		frame.getContentPane().add(lblFone);
		
		textField_1 = new JTextField();
		textField_1.setBounds(606, 74, 173, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 105, 31, 14);
		frame.getContentPane().add(lblCpf);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 119, 141, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 150, 73, 14);
		frame.getContentPane().add(lblEndereo);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 166, 341, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(361, 150, 46, 14);
		frame.getContentPane().add(lblBairro);
		
		textField_4 = new JTextField();
		textField_4.setBounds(361, 166, 267, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(638, 150, 46, 14);
		frame.getContentPane().add(lblCep);
		
		textField_5 = new JTextField();
		textField_5.setBounds(638, 166, 141, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCrasReferncia = new JLabel("CRAS Refer\u00EAncia");
		lblCrasReferncia.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCrasReferncia.setBounds(10, 197, 122, 14);
		frame.getContentPane().add(lblCrasReferncia);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 212, 455, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblGerarAcesso = new JLabel("GERAR ACESSO");
		lblGerarAcesso.setForeground(new Color(25, 25, 112));
		lblGerarAcesso.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblGerarAcesso.setBounds(627, 295, 100, 14);
		frame.getContentPane().add(lblGerarAcesso);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(599, 320, 31, 14);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(599, 368, 53, 14);
		frame.getContentPane().add(lblSenha);
		
		textField_7 = new JTextField();
		textField_7.setBounds(599, 337, 151, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(599, 382, 151, 20);
		frame.getContentPane().add(passwordField);
		
		
		//Botão Salvar (Formulário Agente)
		Button button = new Button("Salvar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(641, 408, 70, 22);
		frame.getContentPane().add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\BACK 29-03-18\\Recovery bass\\Recovered data 03-18 23_11_59\\Deep Scan result\\Lost Partition3(NTFS)\\ADS\\NASSAU\\TCC\\(LOGO) milk_in_the_handTransp.png"));
		label.setBounds(10, 61, 769, 353);
		frame.getContentPane().add(label);
	}

}
