package primeiroModulo;

public class Tarefa {
	// criar um método para criar uma lista de tarefas. Métodos são comportamentos.
	
	String descricao;
	
	// aqui criremos o contrutor, toda classe tem um construtor e nesse caso, queremos que receba a descricao como argumento.
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	// aqui colocaremos as linhas de código que vão montar o comportamento do método
	public void exibirTarefa() {
		System.out.println(descricao);
	}
	
	// foi criado outro método para contar quantas letras tem na frase da nossa tarefa
	public int  obterTamanhoTarefa() {
		return descricao.length();
	}
	
//	modificadores de acesso:
//	public -> não há restrição e posso acessar de qq lugar
//	default (void) -> só pode acessar determinada informação estando no mesmo pacote.
// void -> tipode retorno do seu método, pode retornar nada como acima
//	protected -> só pode ser acessado através de herança (acessar da classe filha um valor que tem na classe pai).
//	private -> só pode ser acessado da mesma classe
}
