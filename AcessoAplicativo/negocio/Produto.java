package negocio;

public class Produto {
	// Propriedades da classe
	private String usuario = "";
	private String senha = "";

	
	// Métodos construtores da classe
	public Produto() {
		super();
	}
	
	public Produto(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;

	}
	
	// Métodos de acesso da classe
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String Usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String Senha) {
		this.senha = senha;
	}

}
