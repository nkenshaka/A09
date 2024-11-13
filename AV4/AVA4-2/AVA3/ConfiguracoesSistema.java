public class Configuracoes {
    private String versaoSistema;
    private String nomeUsuario;
    private DateFormat dateFormat;

    // Construtor com parâmetros para configurar os valores
    public Configuracoes(String versaoSistema, String nomeUsuario, DateFormat dateFormat) {
        this.versaoSistema = versaoSistema;
        this.nomeUsuario = nomeUsuario;
        this.dateFormat = dateFormat;
    }

    // Getters
    public String getVersaoSistema() {
        return versaoSistema;
    }

    // ... outros getters

    // Método para carregar configurações a partir de um arquivo ou banco de dados
    public static Configuracoes fromProperties(String propertiesFile) {
        // Lógica para carregar as configurações a partir do arquivo
        // ...
        return new Configuracoes(versaoSistema, nomeUsuario, dateFormat);
    }
}
Configuracoes config = Configuracoes.fromProperties("config.properties");
String versao = config.getVersaoSistema();