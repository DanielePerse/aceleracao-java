package segundoModulo;

import segundoModulo.alunos.ValidationException;
import segundoModulo.relatorios.Coluna;

// aqui uso a annotation para montar meu relatório
public class Usuario {
	
	private String login;
	
	private String cpf;
	
	private String nome;
	
	public Usuario(String login, String cpf, String nome) throws ValidationException {
		setLogin(login);
		setCpf(cpf);
		setNome(nome);
	}
	
	@Coluna(posicao = 1, titulo = "LOGIN")
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) throws ValidationException {
		if (validateLogin(login)) {
			this.login = login;	
		} else {
			throw new ValidationException("Login inválido");
		}
	}
	
	@Coluna(posicao = 2, titulo = "CPF")
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) throws ValidationException {
		if (validateCpf(cpf)) {
			this.cpf = cpf;	
		} else {
			throw new ValidationException("Cpf inválido");
		}
	}
	
	@Coluna(posicao = 3, titulo = "NOME")
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private boolean validateLogin(String login) {
		return login != null && !login.isEmpty() && login.length() >3 && login.length() < 20;
	}
	
	private boolean validateCpf(String cpf) {
		return cpf != null && !cpf.isEmpty() && (cpf.length() == 11 || cpf.length() == 14);
	}
	
}
