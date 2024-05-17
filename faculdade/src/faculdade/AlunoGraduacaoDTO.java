package faculdade;

import classModel.Disciplina;
import classModel.Historico;

public class AlunoGraduacaoDTO extends AlunoDTO{

	public AlunoGraduacaoDTO(String nome, String cpf, String matricula, String telefone, String email,
			String endereco) {
		super(nome, cpf, matricula, telefone, email, endereco);		
	}

	@Override
	public Historico solicitarHistorico() {
		// TODO Auto-generated method stub
				historico.setNomeAluno(getNome());		
				for (int i = 1; i <= disciplinas.size(); i++) {
					Disciplina ojb = this.disciplinas.get(i);
					historico.setDisciplinas(ojb);
				}		
				return  historico;
	}

	

	
	
	

}
