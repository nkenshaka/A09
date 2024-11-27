import java.awt.*;
import javax.swing.*;

public class CadastroUsuario {

    public CadastroUsuario(JFrame principal) {
        this(principal, 600, 300);
    }

    public CadastroUsuario(JFrame principal, int width, int height) {
        this(principal, width, height, new String[]{"Usuário", "Senha", "Email", "Ativo"});
    }

    public CadastroUsuario(JFrame principal, int width, int height, String[] labels) {
        JDialog cadastroUsuarios = new JDialog(principal, "Cadastro de Usuários", true);
        cadastroUsuarios.setSize(width, height);
        cadastroUsuarios.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Cadastro de Usuários", SwingConstants.CENTER);
        cadastroUsuarios.add(titulo, BorderLayout.NORTH);

        JPanel painelCampos = new JPanel(new GridLayout(labels.length, 2, 5, 5));
        for (String label : labels) {
            painelCampos.add(new JLabel(label + ":"));
            if (label.equals("Senha")) {
                painelCampos.add(new JPasswordField(15));
            } else if (label.equals("Ativo")) {
                JRadioButton radioAtivo = new JRadioButton();
                painelCampos.add(radioAtivo);
            } else {
                painelCampos.add(new JTextField());
            }
        }

        JPanel painelBotoes = BotoesCrud.criarPainelBotoes(cadastroUsuarios);

        cadastroUsuarios.add(painelCampos, BorderLayout.CENTER);
        cadastroUsuarios.add(painelBotoes, BorderLayout.SOUTH);
        cadastroUsuarios.setLocationRelativeTo(principal);
        cadastroUsuarios.setVisible(true);
    }
}