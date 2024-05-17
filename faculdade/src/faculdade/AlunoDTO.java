package faculdade;

import java.util.List;

import classModel.Boleto;
import classModel.Disciplina;
import classModel.Historico;

public abstract class AlunoDTO extends PessoaDTO {
	protected List<Disciplina> disciplinas;
	protected Boleto boleto;
	protected Historico historico;
	
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
	
	public abstract Historico solicitarHistorico();
	
	public abstract Disciplina inscreverDisciplina();

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		
	}
			
	
}
