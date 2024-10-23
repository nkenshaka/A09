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

        JPanel panelCadastro = new JPanel();
        panelCadastro.setLayout(new GridLayout(5, 2));

        JLabel rotuloRodape = new JLabel("Versão: 12.1.2024 Usuário: denys.silva Data de acesso: 20/09/2024 10:58");
        frame.add(rotuloRodape, BorderLayout.SOUTH);

        panelCadastro.add(new JLabel("Usuário:"));
        panelCadastro.add(new JTextField(20));

        JPanel panel = new JPanel();
        frame.add(panel, BorderLayout.CENTER);

        JButton btnIncluir = new JButton("Incluir");
        panelCadastro.add(btnIncluir);

        frame.add(panelCadastro, BorderLayout.CENTER);
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
