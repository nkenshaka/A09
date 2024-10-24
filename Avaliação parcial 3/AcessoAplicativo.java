import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicativo extends JFrame {
    public static void main(String[] args) {
        new Aplicativo().setVisible(true);
    }

    public Aplicativo() {
        setTitle("Sistema de Pessoas");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JMenuBar menuBar = criarMenu();
        setJMenuBar(menuBar);

        JLabel footer = new JLabel("Versão: 12.1.2024  Usuário: denys.silva  Data de acesso: 20/09/2024 10:58");
        add(footer, BorderLayout.SOUTH);

        JPanel panel = new JPanel();
        add(panel, BorderLayout.CENTER);

        setVisible(true);
        abrirTelaLogin();
    }

    private void abrirTelaLogin() {
        JFrame frame = new JFrame("Acesso ao Aplicativo");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);

        JLabel userLabel = new JLabel("Usuário:");
        userLabel.setBounds(10, 20, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        frame.add(userText);

        JLabel passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(10, 50, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        frame.add(passwordText);

        JButton confirmButton = new JButton("Confirmar");
        confirmButton.setBounds(10, 80, 100, 25);
        frame.add(confirmButton);

        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setBounds(120, 80, 100, 25);
        frame.add(cancelButton);

        confirmButton.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passwordText.getPassword());
            if (username.equals("denys.silva") && password.equals("Teste@2024")) {
                JOptionPane.showMessageDialog(frame, "Acesso confirmado!");
                frame.dispose();
            } else {
                JOptionPane.showMessageDialog(frame, "Usuário ou senha inválido!");
            }
        });

        cancelButton.addActionListener(e -> frame.dispose());
        frame.setVisible(true);
    }

    private JMenuBar criarMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu cadastroMenu = new JMenu("Cadastro");
        JMenuItem usuariosItem = new JMenuItem("Usuários");
        JMenuItem pessoasItem = new JMenuItem("Pessoas");
        cadastroMenu.add(usuariosItem);
        cadastroMenu.add(pessoasItem);
        menuBar.add(cadastroMenu);

        JMenu visualizacaoMenu = new JMenu("Visualização");
        JMenuItem listaUsuariosItem = new JMenuItem("Lista de Usuários");
        JMenuItem listaPessoasItem = new JMenuItem("Lista de Pessoas");
        visualizacaoMenu.add(listaUsuariosItem);
        visualizacaoMenu.add(listaPessoasItem);
        menuBar.add(visualizacaoMenu);

        JMenu sairMenu = new JMenu("Sair");
        JMenuItem sairItem = new JMenuItem("Sair");
        sairMenu.add(sairItem);
        menuBar.add(sairMenu);

        sairItem.addActionListener(e -> System.exit(0));
        return menuBar;
    }
}
