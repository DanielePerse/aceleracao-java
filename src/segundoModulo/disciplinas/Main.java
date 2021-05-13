package segundoModulo.disciplinas;

import segundoModulo.alunos.Aluno;

public class Main {
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("danieleLogin", "117117117-78", "daniele");
		aluno1.imprimirDados();
		
		Aluno aluno2 = new Aluno("daniLogin", "117117117-78", "daniele");
		aluno2.imprimirDados();
	}
}
