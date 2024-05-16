package faculdade;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private String matrícula;
	private String telefone;
	private String email;
	private String endereco;
	
	public abstract void cadastrar();
	public abstract void editar();
	public abstract void excluir();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getMatrícula() {
		return matrícula;
	}
	
	public void setMatrícula(String matrícula) {
		this.matrícula = matrícula;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEnderco() {
		return endereco;
	}
	
	public void setEndereço(String endereco) {
		this.endereco = endereco;
	}
	
	
}
