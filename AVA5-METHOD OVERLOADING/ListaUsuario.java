import java.awt.*;
import javax.swing.*;

public class ListaUsuario {

    public ListaUsuario(JFrame principal) {
        this(principal, 750, 650);
    }

    public ListaUsuario(JFrame principal, int width, int height) {
        this(principal, width, height, "Lista de Usuários", "Exemplo de lista de usuários...");
    }

    public ListaUsuario(JFrame principal, int width, int height, String title, String textAreaContent) {
        JDialog listaUsuarios = new JDialog(principal, title, true);
        listaUsuarios.setSize(width, height);
        listaUsuarios.setLayout(new BorderLayout());

        listaUsuarios.add(new JLabel(title, SwingConstants.CENTER), BorderLayout.NORTH);
        listaUsuarios.add(new JTextArea(textAreaContent), BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> listaUsuarios.setVisible(false));
        listaUsuarios.add(btnFechar, BorderLayout.SOUTH);

        listaUsuarios.setLocationRelativeTo(principal);
        listaUsuarios.setVisible(true);
    }
}