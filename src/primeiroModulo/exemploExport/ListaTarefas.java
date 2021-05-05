package primeiroModulo.exemploExport;

import primeiroModulo.Tarefas;

public class ListaTarefas {
	
	public static void main(String[] args) {
		System.out.println("Minhas Tarefas");
		System.out.println("------------------");
		Tarefas tarefa1 = new Tarefas("Estudar");
		tarefa1.exibirTarefa();
		System.out.println("A tarefa tem " + tarefa1.obterTamanhoTarefa() + " caracteres");
	}

}
