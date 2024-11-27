import java.awt.*;
import javax.swing.*;

public class CadastroPessoa {

    public CadastroPessoa(JFrame principal) {
        this(principal, 600, 300);
    }

    public CadastroPessoa(JFrame principal, int width, int height) {
        this(principal, width, height, new String[]{"Nome", "Endereço", "Cidade", "UF", "Email", "Telefone", "Sexo"});
    }

    public CadastroPessoa(JFrame principal, int width, int height, String[] labels) {
        JDialog cadastroPessoas = new JDialog(principal, "Cadastro de Pessoa", true);
        cadastroPessoas.setSize(width, height);
        cadastroPessoas.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Cadastro de Pessoa", SwingConstants.CENTER);
        cadastroPessoas.add(titulo, BorderLayout.NORTH);

        JPanel painelCampos = new JPanel(new GridLayout(labels.length, 2, 5, 5));
        for (String label : labels) {
            painelCampos.add(new JLabel(label + ":"));
            if (label.equals("Sexo")) {
                JComboBox<String> comboSexo = new JComboBox<>(new String[]{"Masculino", "Feminino"});
                painelCampos.add(comboSexo);
            } else {
                painelCampos.add(new JTextField());
            }
        }

        JPanel painelBotoes = BotoesCrud.criarPainelBotoes(cadastroPessoas);

        cadastroPessoas.add(painelCampos, BorderLayout.CENTER);
        cadastroPessoas.add(painelBotoes, BorderLayout.SOUTH);
        cadastroPessoas.setLocationRelativeTo(principal);
        cadastroPessoas.setVisible(true);
    }
}