import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Produto {
	
	private String usuario = "";
	private String senha = "";

	

	public Produto() {
		super();
	}
	
	public Produto(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;

	}
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String Usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String Senha) {
		this.senha = senha;
	}

}
public class VisaoProduto extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel lblUsuario = new JLabel("Usuário: ");
	private JTextField txtUsuario = new JTextField();
	
	private JLabel lblSenha = new JLabel("Senha: ");
	private JTextField txtSenha = new JTextField();

	private JButton btnLogin = new JButton("Login");
	private JButton btnSair = new JButton("Sair");
	
	
	public static void main(String[] args) {
		new VisaoProduto().setVisible(true);
	}
	

	public VisaoProduto() {
		
		setTitle("Acesso ao aplicativo");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		
		lblUsuario.setBounds(10, 10, 200, 20);
		add(lblUsuario);
		txtUsuario.setBounds(10, 30, 200, 20);
		add(txtUsuario);
		
		
		lblSenha.setBounds(10, 60, 200, 20);
		add(lblSenha);
		txtSenha.setBounds(10, 80, 200, 20);
		add(txtSenha);

	
		btnLogin.setBounds(200, 120, 100, 30);
		add(btnLogin);
		btnLogin.addActionListener(new ControladorLogin(txtUsuario, txtSenha));

		btnSair.setBounds(60, 120, 100, 30);
		add(btnSair);
		btnSair.addActionListener(new ControladorSair());
	}
}
public class ControladorSair implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
public class ControladorLogin implements ActionListener {

	private JTextField txtUsuario = null;
	private JTextField txtSenha = null;

	
	public ControladorLogin(JTextField txtUsuario, JTextField txtSenha) {
		super();
		this.txtUsuario = txtUsuario;
		this.txtSenha = txtSenha;

	}

	
	public void actionPerformed(ActionEvent e) {
		
		if (txtUsuario.getText().equals("")|| txtSenha.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campos obrigatório!");
			return;
		}
		if (txtUsuario.getText().equals("denys.silva") && txtSenha.getText().equals("Teste@2024")) {
			JOptionPane.showMessageDialog(null, "Sucesso ao fazer o Login!");
			System.exit(0);
		}else {
			JOptionPane.showMessageDialog(null, "Credenciais inválidas!");
		}
	}
}
