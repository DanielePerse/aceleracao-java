package segundoModulo.disciplinas;

import java.util.ArrayList;
import java.util.List;

import segundoModulo.alunos.Aluno;
import segundoModulo.professor.Professor;

public class Disciplina {
	
	private static final byte LIMITE = 10;
	
	private String nome;
	
	private List<Aluno> alunos = new ArrayList<>();
	
	private Professor professor;
	
	//constructor
	public Disciplina(String nome, Professor professor) {
		this.nome = nome;
		this.professor = professor;
	}
	
	public void matricular(Aluno aluno) throws LimiteAlunosAlcancadoException {
		if (this.alunos.size() < LIMITE) {
			this.alunos.add(aluno);
		} else {
			throw new LimiteAlunosAlcancadoException("Limite de aluunos alcançado, o limite é: " + LIMITE);
		}
	}
	
	public void mostrarAlunos() {
		this.alunos.stream().forEach(aluno -> System.out.println(aluno.getNome()));
	}
}
