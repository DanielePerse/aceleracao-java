package segundoModulo.professor;

import java.util.Arrays;
import java.util.List;

import segundoModulo.UsuarioAutorizavel;
import segundoModulo.alunos.ValidationException;

public class Professor extends UsuarioAutorizavel{
	// repare que os dados necessários aqui são os mesmos da Classe Aluno. Poderia dar um copia e cola e pegar todo o código, mas isso é correto?
	// é aí que entra a Herança, então criamos um novo tipo, genérico, que atenda a necessecidade tanto de professor, quanto de aluno. Evitamos assim repetição de código.
	// criamos então, classe usuário e herdamos ela aqui.
	// herança só pode ser extendida 1x. Já interface, podemos implementar mais de 1.ote

	public Professor(String login, String cpf, String nome) throws ValidationException {
		super(login, cpf, nome);
	}

	@Override
	protected List<String> getAutorizacoes() {
		// TODO Auto-generated method stub
		return Arrays.asList("PROF");
	}

	@Override
	protected boolean verificarAutorizacaoLogin() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
