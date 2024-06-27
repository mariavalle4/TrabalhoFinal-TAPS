package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;


public class JanelaPrincipal extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout card;
	private JTextField textFieldCPF;
	private JTextField textFieldNome;
	private JTextField textFieldEndereco;
	private JTextField textFieldCPF1;
	private JTextField textFieldNome1;
	private JTextField textFieldEndereco1;
	private JButton buttonCadastrar;
	private JButton buttonLimpar;
	private JButton buttonCadastrar1;
	private JButton buttonLimpar1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setResizable(false);
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		JMenuItem itemCadastrar = new JMenuItem("Cadastrar");
		menuArquivo.add(itemCadastrar);
		itemCadastrar.addActionListener(this);
		
		JMenuItem itemConsultar = new JMenuItem("Consultar");
		menuArquivo.add(itemConsultar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		itemConsultar.addActionListener(this);

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		card = (CardLayout) contentPane.getLayout();
		
		JPanel panelCadastrar = new JPanel();
		panelCadastrar.setBackground(new Color(245, 171, 250));
		contentPane.add(panelCadastrar, "T1");
		panelCadastrar.setLayout(null);
		
		JLabel labelTeladeCadastro = new JLabel("TELA DE CADASTRO");
		labelTeladeCadastro.setBounds(5, 10, 142, 17);
		labelTeladeCadastro.setVerticalAlignment(SwingConstants.TOP);
		labelTeladeCadastro.setHorizontalAlignment(SwingConstants.LEFT);
		labelTeladeCadastro.setFont(new Font("Tahoma", Font.BOLD, 14));
		panelCadastrar.add(labelTeladeCadastro);
		
		JLabel labelCPF = new JLabel("CPF");
		labelCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labelCPF.setBounds(5, 43, 25, 13);
		panelCadastrar.add(labelCPF);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldCPF.setBounds(29, 39, 118, 19);
		panelCadastrar.add(textFieldCPF);
		textFieldCPF.setColumns(10);
		
		textFieldNome = new JTextField();
		textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldNome.setBounds(187, 39, 228, 19);
		panelCadastrar.add(textFieldNome);
		textFieldNome.setColumns(20);
		
		JLabel labelNome = new JLabel("Nome");
		labelNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labelNome.setBounds(152, 43, 29, 13);
		panelCadastrar.add(labelNome);
		
		JLabel labelEndereco = new JLabel("Endereço");
		labelEndereco.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labelEndereco.setBounds(5, 68, 46, 13);
		panelCadastrar.add(labelEndereco);
		
		textFieldEndereco = new JTextField();
		textFieldEndereco.setBounds(61, 65, 354, 19);
		panelCadastrar.add(textFieldEndereco);
		textFieldEndereco.setColumns(10);
		
		buttonCadastrar = new JButton("Cadastrar");
		buttonCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonCadastrar.setBounds(10, 200, 95, 21);
		panelCadastrar.add(buttonCadastrar);
		
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonLimpar.setBounds(115, 200, 103, 21);
		panelCadastrar.add(buttonLimpar);
		
		JPanel panelConsultar = new JPanel();
		panelConsultar.setBackground(new Color(134, 226, 234));
		contentPane.add(panelConsultar, "T2");
		panelConsultar.setLayout(null);
		
		JLabel labelTeladeConsulta = new JLabel("TELA DE CONSULTA");
		labelTeladeConsulta.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelTeladeConsulta.setBounds(10, 10, 159, 13);
		panelConsultar.add(labelTeladeConsulta);
		
		JLabel labelCPF1 = new JLabel("CPF");
		labelCPF1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labelCPF1.setBounds(10, 33, 30, 13);
		panelConsultar.add(labelCPF1);
		
		textFieldCPF1 = new JTextField();
		textFieldCPF1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldCPF1.setBounds(35, 30, 96, 19);
		panelConsultar.add(textFieldCPF1);
		textFieldCPF1.setColumns(10);
		
		JLabel labelNome1 = new JLabel("Nome");
		labelNome1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labelNome1.setBounds(141, 33, 30, 13);
		panelConsultar.add(labelNome1);
		
		textFieldNome1 = new JTextField();
		textFieldNome1.setEditable(false);
		textFieldNome1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldNome1.setBounds(174, 30, 242, 19);
		panelConsultar.add(textFieldNome1);
		textFieldNome1.setColumns(10);
		
		JLabel labelEndereco1 = new JLabel("Endereço");
		labelEndereco1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labelEndereco1.setBounds(10, 62, 53, 13);
		panelConsultar.add(labelEndereco1);
		
		textFieldEndereco1 = new JTextField();
		textFieldEndereco1.setEditable(false);
		textFieldEndereco1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textFieldEndereco1.setBounds(60, 59, 356, 19);
		panelConsultar.add(textFieldEndereco1);
		textFieldEndereco1.setColumns(10);
		
		buttonCadastrar1 = new JButton("Consultar");
		buttonCadastrar1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonCadastrar1.setBounds(10, 200, 86, 21);
		panelConsultar.add(buttonCadastrar1);
		
		buttonLimpar1 = new JButton("Limpar");
		buttonLimpar1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		buttonLimpar1.setBounds(106, 200, 79, 21);
		panelConsultar.add(buttonLimpar1);
	}
	
	public JTextField getTextFieldCPF() {
		return textFieldCPF;
	}

	public void setTextFieldCPF(JTextField textFieldCPF) {
		this.textFieldCPF = textFieldCPF;
	}

	public JTextField getTextFieldNome() {
		return textFieldNome;
	}

	public void setTextFieldNome(JTextField textFieldNome) {
		this.textFieldNome = textFieldNome;
	}

	public JTextField getTextFieldEndereco() {
		return textFieldEndereco;
	}

	public void setTextFieldEndereco(JTextField textFieldEndereco) {
		this.textFieldEndereco = textFieldEndereco;
	}

	public JTextField getTextFieldCPF1() {
		return textFieldCPF1;
	}

	public void setTextFieldCPF1(JTextField textFieldCPF1) {
		this.textFieldCPF1 = textFieldCPF1;
	}

	public JTextField getTextFieldNome1() {
		return textFieldNome1;
	}

	public void setTextFieldNome1(JTextField textFieldNome1) {
		this.textFieldNome1 = textFieldNome1;
	}

	public JTextField getTextFieldEndereco1() {
		return textFieldEndereco1;
	}

	public void setTextFieldEndereco1(JTextField textFieldEndereco1) {
		this.textFieldEndereco1 = textFieldEndereco1;
	}

	public JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}

	public JButton getButtonLimpar() {
		return buttonLimpar;
	}

	public void setButtonLimpar(JButton buttonLimpar) {
		this.buttonLimpar = buttonLimpar;
	}

	public JButton getButtonCadastrar1() {
		return buttonCadastrar1;
	}

	public void setButtonCadastrar1(JButton buttonCadastrar1) {
		this.buttonCadastrar1 = buttonCadastrar1;
	}

	public JButton getButtonLimpar1() {
		return buttonLimpar1;
	}

	public void setButtonLimpar1(JButton buttonLimpar1) {
		this.buttonLimpar1 = buttonLimpar1;
	}
	public void limpatelaCadastrar()
	{
		textFieldCPF.setText("");
		textFieldNome.setText("");
		textFieldEndereco.setText("");
	}
	public void limpatelaConsultar()
	{
		textFieldCPF1.setText("");
		textFieldNome1.setText("");
		textFieldEndereco1.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Cadastrar"))
		{
			card.show(contentPane, "T1");
		}
		else if(e.getActionCommand().equals("Consultar"))
		{
			card.show(contentPane, "T2");;
		}
	}
}
