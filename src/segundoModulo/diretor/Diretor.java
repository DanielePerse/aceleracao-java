package segundoModulo.diretor;

import java.util.Arrays;
import java.util.List;

import segundoModulo.UsuarioAutorizavel;
import segundoModulo.alunos.ValidationException;
import segundoModulo.relatorios.Coluna;

// como usuario autorizável já estende usuário, basta chamar direto ele.
public class Diretor extends UsuarioAutorizavel{
	
	private String dataCargo;

	@Coluna(posicao = 4, titulo = "Data do cargo")
	public String getDataCargo() {
		return dataCargo;
	}

	public void setDataCargo(String dataCargo) {
		this.dataCargo = dataCargo;
	}

	public Diretor(String login, String cpf, String nome) throws ValidationException {
		super(login, cpf, nome);
	}

	@Override
	protected List<String> getAutorizacoes() {
		// TODO Auto-generated method stub
		return Arrays.asList("ADMIN");
	}

	@Override
	protected boolean verificarAutorizacaoLogin() {
		// TODO Auto-generated method stub
		return true;
	}
	
	// não precisou criar o método 'tem autorização' do contrato (interface), pois já existe por default.
}
