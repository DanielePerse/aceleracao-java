package segundoModulo.disciplinas;

import segundoModulo.alunos.Aluno2;

public class Main2 {
	
	public static void main(String[] args) {
		// Aluno aluno1 = new Aluno(); -> sem construtor (todos comentados)
		// aluno1.setLogin("123");
		// aluno1.setCpf("123.456.789-00");
		// o cpf pode ser digitado com ponto ou sem pontos, mas minha classe Main não deve se preocupar com isso
		// quem se preocupa com a formatação certa é minha classe aluno, então tenho que jogar minha responsabilidade de formatação lá.
		// System.out.println(aluno1.getLogin());
		// System.out.println(aluno1.getCpf());
		
		// Com construtor
		Aluno2 aluno1 = new Aluno2("meuLogin", "123.456.789-00", "dani");
		System.out.print(aluno1);
	}
}
