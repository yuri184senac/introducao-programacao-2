package classModel;

import java.util.Random;

public class Boleto {
	protected Integer numero;
	protected double valor;
	protected String beneficiario;
	 	
	
 public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	 
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}
	
	public void gerarBoleto(String nome, Double valor) {
        Random rand = new Random();        
		this.setNumero(rand.nextInt(18));
		this.setValor(valor);
		this.setBeneficiario(nome);
	}

	
}
