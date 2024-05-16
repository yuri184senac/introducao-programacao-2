package faculdade;

public abstract class PessoaDTO {
	
	private String nome;
	private String cpf;
	private String matricula;
	private String telefone;
	private String email;
	private String endereco;
	
	public PessoaDTO(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		
	}
		
	public abstract void editar();

	
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
		return matricula;
	}
	
	public void setMatrícula(String matricula) {
		this.matricula = matricula;
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
