package segundoModulo.professor;

import segundoModulo.Usuario;
import segundoModulo.UsuarioAutorizavel;
import segundoModulo.alunos.ValidationException;

public class Professor extends Usuario implements UsuarioAutorizavel{
	// repare que os dados necessários aqui são os mesmos da Classe Aluno. Poderia dar um copia e cola e pegar todo o código, mas isso é correto?
	// é aí que entra a Herança, então criamos um novo tipo, genérico, que atenda a necessecidade tanto de professor, quanto de aluno. Evitamos assim repetição de código.
	// criamos então, classe usuário e herdamos ela aqui.
	// herança só pode ser extendida 1x. Já interface, podemos implementar mais de 1.

	public Professor(String login, String cpf, String nome) throws ValidationException {
		super(login, cpf, nome);
	}

	@Override
	public boolean temAutorizacao() {
		return true;
	}
	
}
