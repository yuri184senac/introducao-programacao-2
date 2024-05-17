package classModel;

import java.util.List;

public class Disciplina {
	protected String nome;
	protected String nomeProfessor;
	protected String nomeAluno;
	protected List<Double> notas;
	protected int frequencia;
	
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
	
	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
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
