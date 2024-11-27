import java.awt.*;
import javax.swing.*;

public class MenuPrincipal {

    public MenuPrincipal() {
        this("Sistema Pessoa", 800, 800);
    }

    public MenuPrincipal(String title, int width, int height) {
        this(title, width, height, new String[]{"Cadastro", "Visualização", "Sair"});
    }

    public MenuPrincipal(String title, int width, int height, String[] menuItems) {
        // Criação do frame principal
        JFrame principal = new JFrame(title);
        principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        principal.setSize(width, height);

        // Criação da barra de menu
        JMenuBar menuPrincipal = new JMenuBar();

        // Criação e adição das opções de menu
        for (String item : menuItems) {
            JMenu menu = new JMenu(item);
            if (item.equals("Sair")) {
                menu.addMenuListener(new javax.swing.event.MenuListener() {
                    @Override
                    public void menuSelected(javax.swing.event.MenuEvent e) {
                        System.exit(0); // Sai do sistema
                    }
                    @Override public void menuDeselected(javax.swing.event.MenuEvent e) {}
                    @Override public void menuCanceled(javax.swing.event.MenuEvent e) {}
                });
            }
            menuPrincipal.add(menu);
        }

        // Itens de menu para cadastro
        JMenu menuCadastro = menuPrincipal.getMenu(0);
        JMenuItem itemMenuCadastroUsuarios = new JMenuItem("Usuários");
        JMenuItem itemMenuCadastroPessoas = new JMenuItem("Pessoas");
        menuCadastro.add(itemMenuCadastroUsuarios);
        menuCadastro.add(itemMenuCadastroPessoas);

        // Itens de menu para visualização
        JMenu menuVisualizacao = menuPrincipal.getMenu(1);
        JMenuItem itemMenuVisualizacaoListaUsuarios = new JMenuItem("Lista de usuários");
        JMenuItem itemMenuVisualizacaoListaPessoas = new JMenuItem("Lista de pessoas");
        menuVisualizacao.add(itemMenuVisualizacaoListaUsuarios);
        menuVisualizacao.add(itemMenuVisualizacaoListaPessoas);

        // Área de trabalho no centro
        JTextArea areaTrabalho = new JTextArea();

        // Painel e label do rodapé, utilizando as variáveis globais da classe ConfiguracoesSistema.java
        JPanel painelRodape = new JPanel();
        JLabel labelRodape = new JLabel("Versão: " + ConfiguracoesSistema.VERSAO_SISTEMA +
                " | Usuário: " + ConfiguracoesSistema.NOME_USUARIO +
                " | Data de acesso: " + ConfiguracoesSistema.DATA_ACESSO);
        painelRodape.add(labelRodape);

        // Adiciona componentes ao frame principal
        principal.getContentPane().add(BorderLayout.NORTH, menuPrincipal);
        principal.getContentPane().add(BorderLayout.CENTER, areaTrabalho);
        principal.getContentPane().add(BorderLayout.SOUTH, painelRodape);

        principal.setLocationRelativeTo(null); // Centraliza a janela
        principal.setVisible(true); // Torna a janela visível
    }
}