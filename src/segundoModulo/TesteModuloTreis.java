package segundoModulo;

import segundoModulo.alunos.ValidationException;
import segundoModulo.lancadornotas.LancadorNotas;
import segundoModulo.professor.Professor;

public class TesteModuloTreis {

	public static void main(String[] args) throws ValidationException {
		UsuarioAutorizavel usuario = new Professor("professor", "12345678900", "Teste da silva");
		
		new LancadorNotas().login(usuario);
	}
}
