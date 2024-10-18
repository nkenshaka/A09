package apresentacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




public class ControladorLogin implements ActionListener {
	// Propriedades da classe
	private JTextField txtUsuario = null;
	private JTextField txtSenha = null;

	// Método construtor da classe
	public ControladorLogin(JTextField txtUsuario, JTextField txtSenha) {
		super();
		this.txtUsuario = txtUsuario;
		this.txtSenha = txtSenha;

	}

	// Método implementado da interface
	public void actionPerformed(ActionEvent e) {
		// Críticas de dados
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

