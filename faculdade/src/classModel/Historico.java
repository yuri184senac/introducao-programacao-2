package classModel;

import java.util.List;

public class Historico {
	private String nomeAluno;
	private List<Disciplina> disciplina;
	
	public Historico(String nome) {
		this.setNomeAluno(nome);
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplina;
	}

	public void setDisciplinas(Disciplina dscp) {
		disciplina.add(dscp);
	}
		
}
