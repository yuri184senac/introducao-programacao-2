package faculdade;

import java.util.List;

import classModel.Boleto;
import classModel.Disciplina;
import classModel.Historico;

public class AlunoDTO extends PessoaDTO {
	private List<Disciplina> disciplinas;
	private Boleto boleto;
	private Historico historico;
	
	public AlunoDTO (
				String nome,
				String cpf,
				String matricula,
				String telefone,
				String email,
				String endereco										
		    	) 
	{
		super(nome, cpf, matricula, telefone, email, endereco);				
	}
		
	public Boleto verBoleto(Double valor) {
		boleto.gerarBoleto(getNome(), valor);
		return boleto;
	}
	
	public Historico solicitarHistorico() {
		historico.setNomeAluno(getNome());		
		for (int i = 1; i <= disciplinas.size(); i++) {
			Disciplina ojb = this.disciplinas.get(i);
			historico.setDisciplinas(ojb);
		}		
		return  historico;
	}
	
	public void inscreverDisciplina(Disciplina obj) {
		disciplinas.add(obj);
	}

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		
	}
			
	
}
