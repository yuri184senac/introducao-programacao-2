package classModel;

import java.util.List;

public class Disciplina {
	private String nome;
	private String nomeProfessor;
	private String nomeAluno;
	private List<Double> notas;
	
	public Disciplina(String nome, String nomeProfessor, String nomeAluno) {
		this.nome = nome;
		this.nomeProfessor = nomeProfessor;
		this.setNomeAluno(nomeAluno);		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public List<Double> getNotas() {
		return this.notas;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	
	public boolean adicionarNota(Double nota) {
		try {
			notas.add(nota);
			return true;
		} catch(Exception e) {
			System.out.println(e);
			return false;
		}
	}


}
