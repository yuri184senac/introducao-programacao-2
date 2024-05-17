package faculdade;

import classModel.Disciplina;
import classModel.Historico;

public class AlunoPosGraduacaoDTO extends AlunoDTO{

	public AlunoPosGraduacaoDTO(String nome, String cpf, String matricula, String telefone, String email,
			String endereco) {
		super(nome, cpf, matricula, telefone, email, endereco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Historico solicitarHistorico() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Disciplina inscreverDisciplina(Disciplina obj) {
		disciplinas.add(obj);
		return null;
	}

	

}
