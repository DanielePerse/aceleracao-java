package primeiroModulo.exemploExport;

import primeiroModulo.ListaTodasTarefas;
// import primeiroModulo.ArrayTarefas;
import primeiroModulo.Tarefa;

public class ListaTarefas {
	
	public static void main(String[] args) {
		System.out.println("Minhas Tarefas");
		System.out.println("------------------");
		// ArrayTarefas tarefas = new ArrayTarefas(3); -> manual
		ListaTodasTarefas tarefas = new ListaTodasTarefas(); // usamos o arrayList
		Tarefa tarefa1 = new Tarefa("Estudar muitoooooooooooooooooooooooooooooo"); // validação -> tarefa inválida
		Tarefa tarefa2 = new Tarefa("Fazer comida");
		Tarefa tarefa3 = new Tarefa("Trabalhar");
		
		tarefas.adicionar(tarefa1);
		tarefas.adicionar(tarefa2);
		tarefas.adicionar(tarefa3);
		tarefas.exibirTarefas();
		tarefas.remover(3); // validação -> tarefa não existe
		tarefas.remover(tarefa2); // remover -> criamos outro método com outro nome, fazendo outra coisa
		
		System.out.println("------------------");
		System.out.println("------------------");
		System.out.println("Minhas Tarefas");
		System.out.println("------------------");
		tarefas.exibirTarefas();
		
		Tarefa tarefa = tarefas.buscar("Trabalhar");
		tarefa.exibirTarefa();
		
		tarefas.buscar("exemplo");
		tarefa.exibirTarefa();
		
		// tarefa1.exibirTarefa();
		// System.out.println("A tarefa tem " + tarefa1.obterTamanhoTarefa() + " caracteres");
	}

}
