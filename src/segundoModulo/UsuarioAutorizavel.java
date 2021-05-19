package segundoModulo;

import java.util.List;

import segundoModulo.alunos.ValidationException;

// classes abstratas não podem ser instanciadas - são como modelos que as classes que herdam dela devem seguir
public abstract class UsuarioAutorizavel extends Usuario{

	public UsuarioAutorizavel(String login, String cpf, String nome) throws ValidationException {
		super(login, cpf, nome);
	}
	
	// template method é quando escreve um algoritimo, onde parte dele tem que ser implementada por outra classe
	// hook method: https://pt.stackoverflow.com/questions/114777/o-que-%C3%A9-um-hook-method
	public boolean temAutorizacao() {
		List<String> autorizacoes = getAutorizacoes();
		return autorizacoes.contains("ADMIN") || verificarAutorizacaoLogin();
	}
	
	// protected -> apenas a classe filha e minha própria classe tenham acesso a elas
	// a classe que estender UsuarioAutorizavel terá que implemantar esse método (conceito parecido com interfaces)
	protected abstract List<String> getAutorizacoes();
	
	protected abstract boolean verificarAutorizacaoLogin();
}
