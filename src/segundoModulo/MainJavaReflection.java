package segundoModulo;

import segundoModulo.alunos.ValidationException;
import segundoModulo.credito.AnalisadorCredito;
import segundoModulo.credito.externo.Pessoa;

public class MainJavaReflection {

	public static void main(String[] args) throws ValidationException {
		
		Pessoa pessoa = getPessoa();
		AnalisadorCredito analisador = new AnalisadorCredito();
		boolean resultado = analisador.analisarCredito(pessoa);
		
		if (resultado) {
			System.out.println("credito Aprovado");
		} else {
			System.out.println("Credito Reprovado");
		}
	}
	
	public static Pessoa getPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Pessoa Teste");
		pessoa.setCpf("123.456.789-00");
		pessoa.setQtdChequesDevolvidos(0);
		pessoa.setScoreSCPC(500);
		pessoa.setScoreSerasa(500);
		pessoa.setValorDivida(1001);
		return pessoa;
	}
}
