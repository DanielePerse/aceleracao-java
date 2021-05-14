package segundoModulo;

import segundoModulo.alunos.Aluno;
import segundoModulo.alunos.ValidationException;
import segundoModulo.disciplinas.Disciplina;
import segundoModulo.disciplinas.LimiteAlunosAlcancadoException;
import segundoModulo.professor.Professor;

public class Main {
	
	public static void main(String[] args) {
		try {
			Professor professor = new Professor("professor", "12345678900", "Teste da silva");	
			Disciplina disciplina = new Disciplina("Matemática", professor);
			
			for (int i = 1; i <= 15; i++) {
				disciplina.matricular(new Aluno("aluno", "12345678901", "Aluno da silva" + i));
			}

			disciplina.mostrarAlunos();

		} catch (ValidationException | LimiteAlunosAlcancadoException e) {
			System.out.println(e.getMessage());
		}
	}
}
