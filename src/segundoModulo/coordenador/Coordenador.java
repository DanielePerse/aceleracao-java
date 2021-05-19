package segundoModulo.coordenador;

import java.util.Arrays;
import java.util.List;

import segundoModulo.UsuarioAutorizavel;
import segundoModulo.alunos.ValidationException;

public class Coordenador extends UsuarioAutorizavel{
	
	private long matricula;
	
	public Coordenador(String login, String cpf, String nome) throws ValidationException {
		super(login, cpf, nome);
	}

	public long getMatricula() { return matricula; }
	
	public void setMatricula(long matricula) { this.matricula = matricula; }

	@Override
	protected List<String> getAutorizacoes() {
		return Arrays.asList("COORD");
	}

	@Override
	protected boolean verificarAutorizacaoLogin() {
		return false;
	}
	
}
