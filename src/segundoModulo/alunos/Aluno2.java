package segundoModulo.alunos;

public class Aluno2 {
	
	// aqui as variáveis apenas foram declarads
	private String login;
	
	private String cpf;
	
	private String nome;
	
	// construtor
	public Aluno2 (String login, String cpf, String nome) {
		// é interessante setar aqui, pois já garanto que esses itens sempre serão setados e validados.
		// e como inseriru um clonstrutor com parametros, tenho que chamar essa classe lá em Main, com os parametros
		setLogin(login);
		setCpf(cpf);
		setNome(nome);
//		this.login = login;
//		this.cpf = cpf;
//		this.nome = nome;
	}
	
	// get e set  são os métodos de acesso aos atributos
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		// e agora, antes de setar, posso passar minha validação
		if (validateLogin(login)) {
			this.login = login;	
		} else {
			System.out.println("Login inválido");
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
	
	// após encapsular, posso criar meu método
	private boolean validateLogin(String login) {
		return login != null && !login.isEmpty() && login.length() >3 && login.length() < 20;
	}
	
	private boolean validateCpf(String cpf) {
		return cpf != null && !cpf.isEmpty() && (cpf.length() == 11 || cpf.length() == 14);
	}
	
	// reescreverndo o método toString para que imprima os dados corretos
	@Override
	public String toString() {
		return "Nome: " + nome + ", CPF: " + cpf + ", Login: " + login;
 	}
	
}
