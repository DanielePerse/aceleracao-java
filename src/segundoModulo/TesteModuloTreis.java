package segundoModulo;

import segundoModulo.alunos.ValidationException;
import segundoModulo.coordenador.Coordenador;
import segundoModulo.diretor.Diretor;
import segundoModulo.lancadornotas.LancadorNotas;
import segundoModulo.professor.Professor;

public class TesteModuloTreis {

	public static void main(String[] args) throws ValidationException {
		UsuarioAutorizavel usuario = new Professor("professor", "12345678900", "Teste da silva");
		new LancadorNotas().login(usuario);
		
		UsuarioAutorizavel usuario2 = new Diretor("diretor", "12345678901", "Teste da silva diretor");
		new LancadorNotas().login(usuario2);
		
		UsuarioAutorizavel usuario3 = new Coordenador("coordenador", "12345678902", "Teste da silva coordenador");
		new LancadorNotas().login(usuario3);
	}
}
