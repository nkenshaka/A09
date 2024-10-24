import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;


public class Aplicativo {
    
    public static void main(String[] args) {
        new VisaoProduto().setVisible(true);
    }

    static class ControladorLogin implements ActionListener {
        private JTextField txtUsuario;
        private JPasswordField txtSenha;

        public ControladorLogin(JTextField txtUsuario, JPasswordField txtSenha) {
            this.txtUsuario = txtUsuario;
            this.txtSenha = txtSenha;
        }

        public void actionPerformed(ActionEvent e) {
            if (txtUsuario.getText().equals("") || new String(txtSenha.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Campos obrigatórios!");
                return;
            }
            if (txtUsuario.getText().equals("denys.silva") && new String(txtSenha.getPassword()).equals("Teste@2024")) {
                JOptionPane.showMessageDialog(null, "Sucesso ao fazer o Login!");
                new SistemaPessoa(txtUsuario.getText()).setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor((JButton) e.getSource())).dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Credenciais inválidas!");
            }
        }
    }

    static class ControladorSair implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    static class VisaoProduto extends JFrame {
        private static final long serialVersionUID = 1L;
        
        private JLabel lblUsuario = new JLabel("Usuário: ");
        private JTextField txtUsuario = new JTextField();
        
        private JLabel lblSenha = new JLabel("Senha: ");
        private JPasswordField txtSenha = new JPasswordField();

        private JButton btnLogin = new JButton("Login");
        private JButton btnSair = new JButton("Sair");
        
        public VisaoProduto() {
            setTitle("Acesso ao aplicativo");
            setSize(400, 200);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setLayout(new GridLayout(4, 2, 5));
            
            add(lblUsuario);
            add(txtUsuario);
            add(lblSenha);
            add(txtSenha);
            add(btnLogin);
            add(btnSair);

            btnLogin.addActionListener(new ControladorLogin(txtUsuario, txtSenha));
            btnSair.addActionListener(new ControladorSair());
        }
    }
}

public class SistemaPessoa extends JFrame {

    public SistemaPessoa(String usuario) {
        setTitle("Sistema de Pessoas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = criarMenu();
        setJMenuBar(menuBar);

        JPanel panelCadastro = new JPanel();
        panelCadastro.setLayout(new GridLayout(5, 2));

        JLabel rotuloRodape = new JLabel("Versão: 12.1.2024 Usuário: " + usuario + " Data de acesso: " + java.time.LocalDate.now());
        add(rotuloRodape, BorderLayout.SOUTH);

        panelCadastro.add(new JLabel("Usuário:"));
        panelCadastro.add(new JTextField(20));

        JButton btnIncluir = new JButton("Incluir");
        panelCadastro.add(btnIncluir);

        add(panelCadastro, BorderLayout.CENTER);
        pack();
        setVisible(true);
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
