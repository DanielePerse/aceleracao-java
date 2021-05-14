package segundoModulo.disciplinas;

import segundoModulo.alunos.Aluno;
import segundoModulo.alunos.ValidationException;

public class Main {
	
	public static void main(String[] args) {
		Aluno aluno1 = null;
		try {
			aluno1 = new Aluno("12", "123.456.789-00", "Teste da silva");
		} catch (ValidationException e) {
			System.out.println("Message: " + e.getMessage());
			e.printStackTrace(); // é a pilha de execução -> em produção não é uma boa idéia fazer isso, gasta recursos.
		}
		System.out.println(aluno1);
	}
}
