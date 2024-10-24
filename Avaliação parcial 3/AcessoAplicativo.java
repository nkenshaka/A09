import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaPessoa {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Pessoas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = criarMenu();
        frame.setJMenuBar(menuBar);
        JPanel panelCadastro = new JPanel(new GridLayout(5, 2));
        JLabel rotuloRodape = new JLabel("Versão: 12.1.2024 Usuário: denys.silva Data de acesso: 20/09/2024 10:58");
        frame.add(rotuloRodape, BorderLayout.SOUTH);
        panelCadastro.add(new JLabel("Usuário:"));
        JTextField userText = new JTextField(20);
        panelCadastro.add(userText);
        panelCadastro.add(new JLabel("Senha:"));
        JPasswordField passwordText = new JPasswordField(20);
        panelCadastro.add(passwordText);
        JButton btnIncluir = new JButton("Incluir");
        panelCadastro.add(btnIncluir);
        frame.add(panelCadastro, BorderLayout.CENTER);
        btnIncluir.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passwordText.getPassword());
            if (username.equals("denys.silva") && password.equals("Teste@2024")) {
                JOptionPane.showMessageDialog(frame, "Acesso confirmado!");
            } else {
                JOptionPane.showMessageDialog(frame, "Usuário ou senha inválido!");
            }
        });
        frame.pack();
        frame.setVisible(true);
    }

    private static JMenuBar criarMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenuItem menuItemUsuarios = new JMenuItem("Usuários");
        JMenuItem menuItemPessoas = new JMenuItem("Pessoas");
        menuCadastro.add(menuItemUsuarios);
        menuCadastro.add(menuItemPessoas);
        menuBar.add(menuCadastro);
        return menuBar;
    }
}
