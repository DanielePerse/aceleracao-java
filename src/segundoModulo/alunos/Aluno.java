package segundoModulo.alunos;

public class Aluno {
	
	private String login;
	
	private String cpf;
	
	private String nome;
	
	// construtor
	public Aluno (String login, String cpf, String nome) {
		setLogin(login);
		setCpf(cpf);
		setNome(nome);
	}
	

	public String getLogin() {
		return login;
	}
	
	// tratando erros - exceptions
	public void setLogin(String login) throws Exception {
		if (validateLogin(login)) {
			this.login = login;	
		} else {
			throw new Exception();
		}
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (validateCpf(cpf)) {
			this.cpf = cpf;	
		} else {
			System.out.println("Cpf inválido");
		}
	}
	
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
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", CPF: " + cpf + ", Login: " + login;
 	}
	
}
