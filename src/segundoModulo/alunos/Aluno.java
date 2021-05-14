package segundoModulo.alunos;

import segundoModulo.Usuario;

public class Aluno extends Usuario{
	
	private Integer numeroMatricula;

	// se ususario tem um contrutor com argumentos, preciso escrever um constructor aqui tb, mas se não tivesse argumentos, não precisaria
	public Aluno(String login, String cpf, String nome) throws ValidationException {
		super(login, cpf, nome);
	}
	
	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}
	
	public void setNumeroMatricula(Integer numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
}
