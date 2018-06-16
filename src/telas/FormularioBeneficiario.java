package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
//import javax.swing.JToggleButton;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
//import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JInternalFrame;

public class FormularioBeneficiario {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtM;
	private JTextField txtKg;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioBeneficiario window = new FormularioBeneficiario();
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
	public FormularioBeneficiario() {
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
		
		JLabel lblFormularioBeneficiario = new JLabel("FORMUL\u00C1RIO BENEFICI\u00C1RIO");
		lblFormularioBeneficiario.setForeground(Color.RED);
		lblFormularioBeneficiario.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFormularioBeneficiario.setBounds(253, 11, 260, 27);
		frame.getContentPane().add(lblFormularioBeneficiario);
		
		JLabel lblN = new JLabel("N\u00BA");
		lblN.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblN.setBounds(636, 11, 20, 14);
		frame.getContentPane().add(lblN);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 60, 46, 14);
		frame.getContentPane().add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(10, 74, 769, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento");
		lblDataDeNascimento.setBounds(10, 105, 141, 14);
		frame.getContentPane().add(lblDataDeNascimento);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 119, 124, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(194, 105, 46, 14);
		frame.getContentPane().add(lblSexo);
		
		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(320, 105, 46, 14);
		frame.getContentPane().add(lblPeso);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(527, 105, 46, 14);
		frame.getContentPane().add(lblIdade);
		
		txtM = new JTextField();
		txtM.setBounds(194, 119, 15, 20);
		frame.getContentPane().add(txtM);
		txtM.setColumns(10);
		
		txtKg = new JTextField();
		txtKg.setText("                             ");
		txtKg.setBounds(320, 119, 86, 20);
		frame.getContentPane().add(txtKg);
		txtKg.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(527, 119, 86, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDadosDoResponsvel = new JLabel("DADOS DO RESPONS\u00C1VEL (CASO O BENEFICI\u00C1RIO SEJA MENOR DE IDADE):");
		lblDadosDoResponsvel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDadosDoResponsvel.setBounds(10, 171, 415, 14);
		frame.getContentPane().add(lblDadosDoResponsvel);
		
		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setBounds(10, 196, 46, 14);
		frame.getContentPane().add(lblNome_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 210, 530, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblRg = new JLabel("RG");
		lblRg.setBounds(10, 241, 46, 14);
		frame.getContentPane().add(lblRg);
		
		textField_6 = new JTextField();
		textField_6.setBounds(10, 255, 124, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(144, 241, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		JLabel lblNis = new JLabel("NIS");
		lblNis.setBounds(280, 241, 46, 14);
		frame.getContentPane().add(lblNis);
		
		textField_7 = new JTextField();
		textField_7.setBounds(144, 255, 126, 20);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(280, 255, 126, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(10, 286, 65, 14);
		frame.getContentPane().add(lblEndereo);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(363, 286, 46, 14);
		frame.getContentPane().add(lblBairro);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(636, 286, 46, 14);
		frame.getContentPane().add(lblCep);
		
		JLabel lblMunicpio = new JLabel("Munic\u00EDpio");
		lblMunicpio.setBounds(10, 330, 65, 14);
		frame.getContentPane().add(lblMunicpio);
		
		textField_9 = new JTextField();
		textField_9.setBounds(636, 299, 141, 20);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(363, 299, 267, 20);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(10, 299, 341, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(10, 345, 455, 20);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(672, 11, 56, 18);
		frame.getContentPane().add(panel);
		
		JLabel lblKg_1 = new JLabel("Kg");
		lblKg_1.setBounds(416, 122, 32, 14);
		frame.getContentPane().add(lblKg_1);
		
		
		//Botão Salvar (Formulário Beneficiário)
		Button button = new Button("Salvar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
			
			
		});
		button.setActionCommand("Salvar");
		button.setBounds(612, 376, 70, 22);
		frame.getContentPane().add(button);
		
		JLabel lblKg = new JLabel("");
		lblKg.setIcon(new ImageIcon("D:\\BACK 29-03-18\\Recovery bass\\Recovered data 03-18 23_11_59\\Deep Scan result\\Lost Partition3(NTFS)\\ADS\\NASSAU\\TCC\\(LOGO) milk_in_the_handTransp.png"));
		lblKg.setBounds(10, 61, 769, 353);
		frame.getContentPane().add(lblKg);
	}
}
