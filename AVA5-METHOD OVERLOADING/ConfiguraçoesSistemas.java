import java.awt.*;
import javax.swing.*;

public class ListaPessoa {

    public ListaPessoa(JFrame principal) {
        this(principal, 750, 650);
    }

    public ListaPessoa(JFrame principal, int width, int height) {
        this(principal, width, height, "Lista de Pessoas", "Exemplo de lista de pessoas...");
    }

    public ListaPessoa(JFrame principal, int width, int height, String title, String textAreaContent) {
        JDialog listaPessoas = new JDialog(principal, title, true);
        listaPessoas.setSize(width, height);
        listaPessoas.setLayout(new BorderLayout());

        listaPessoas.add(new JLabel(title, SwingConstants.CENTER), BorderLayout.NORTH);
        listaPessoas.add(new JTextArea(textAreaContent), BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> listaPessoas.setVisible(false));
        listaPessoas.add(btnFechar, BorderLayout.SOUTH);

        listaPessoas.setLocationRelativeTo(principal);
        listaPessoas.setVisible(true);
    }
}
