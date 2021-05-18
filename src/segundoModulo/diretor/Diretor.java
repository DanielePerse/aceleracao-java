package segundoModulo.diretor;

import segundoModulo.Usuario;
import segundoModulo.UsuarioAutorizavel;
import segundoModulo.alunos.ValidationException;

public class Diretor extends Usuario implements UsuarioAutorizavel{

	public Diretor(String login, String cpf, String nome) throws ValidationException {
		super(login, cpf, nome);
	}
	
	// não precisou criar o método 'tem autorização' do contrato (interface), pois já existe por default.
}
