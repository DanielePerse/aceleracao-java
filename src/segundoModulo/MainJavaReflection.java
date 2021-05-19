package segundoModulo;

import java.lang.reflect.Field;

import segundoModulo.alunos.ValidationException;
import segundoModulo.credito.AnalisadorCredito;
import segundoModulo.credito.externo.Pessoa;

public class MainJavaReflection {

	public static void main(String[] args) throws ValidationException {
		
//		Pessoa pessoa = getPessoa();
//		AnalisadorCredito analisador = new AnalisadorCredito();
//		boolean resultado = analisador.analisarCredito(pessoa);
//		
//		if (resultado) {
//			System.out.println("credito Aprovado");
//		} else {
//			System.out.println("Credito Reprovado");
//		}
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Pessoa Teste");
		// com o java reflextions, conseguimos alterar em tempo real, até mesmo atributos de origem privada (mas não é aconselhável, isso foi apenas um teste)
		try {
			Field nome = Pessoa.class.getDeclaredField("nome");
			nome.setAccessible(true);
			nome.set(pessoa, "Mudei o valor");
		} catch(NoSuchFieldException e) {
			System.out.println("Atributo não encontrado!");
		} catch (IllegalAccessException e) {
			System.out.println("Não tem acesso!");
		}
		System.out.print(pessoa.getNome());	
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
