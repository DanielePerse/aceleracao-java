package segundoModulo.credito;

// desafio: pegar uma regra de crédito e, através dessa regra de crédito a gente deve acessar os atributos correspondentes na classe pessoa e fazer a comparação com a regra
// para verificar se a regra foi validada.
public class RegraCredito {
	private String nome;
	private String referencia;
	private long valorReferencia;
	private RegraValor regra;
	
	public enum RegraValor {
		MAX, MIN;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public long getValorReferencia() {
		return valorReferencia;
	}

	public void setValorReferencia(long valorReferencia) {
		this.valorReferencia = valorReferencia;
	}

	public RegraValor getRegra() {
		return regra;
	}

	public void setRegra(RegraValor regra) {
		this.regra = regra;
	}
	
	
}
