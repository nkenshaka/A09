package apresentacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class VisaoProduto extends JFrame {
	// Propiedades da classe
	private static final long serialVersionUID = 1L;
	
	private JLabel lblUsuario = new JLabel("Usuário: ");
	private JTextField txtUsuario = new JTextField();
	
	private JLabel lblSenha = new JLabel("Senha: ");
	private JTextField txtSenha = new JTextField();

	private JButton btnLogin = new JButton("Login");
	private JButton btnSair = new JButton("Sair");
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new VisaoProduto().setVisible(true);
	}
	
	// Método construtor da classe
	public VisaoProduto() {
		// Confuguração da janela
		setTitle("Acesso ao aplicativo");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		// Usuario
		lblUsuario.setBounds(10, 10, 200, 20);
		add(lblUsuario);
		txtUsuario.setBounds(10, 30, 200, 20);
		add(txtUsuario);
		
		// Senha
		lblSenha.setBounds(10, 60, 200, 20);
		add(lblSenha);
		txtSenha.setBounds(10, 80, 200, 20);
		add(txtSenha);

		// Botões
		btnLogin.setBounds(200, 120, 100, 30);
		add(btnLogin);
		btnLogin.addActionListener(new ControladorLogin(txtUsuario, txtSenha));

		btnSair.setBounds(60, 120, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
