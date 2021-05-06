package primeiroModulo;

import java.util.ArrayList;

public class ListaTodasTarefas {
	// o arrayList possui vários métodos já carrega várias ações, como add, remover... Não precisa de construtor;
	
	// não precisa dizer o tipo, pois o compilador já entende
	ArrayList<Tarefa> tarefas = new ArrayList<>();
	
	public void adicionar(Tarefa tarefa) {
		// add regra -> tarefas de até 20 caracteres -> usa estrutura condicional.
		if(tarefa != null && tarefa.obterTamanhoTarefa() <= 20) {
			this.tarefas.add(tarefa);
		} else {
			System.out.println("A tarefa é inválida!");
		}
	}
	
	public void adicionar(String descricao) {
		Tarefa tarefa = new Tarefa(descricao);
		adicionar(tarefa);
	}
	
	public void remover(int posicao) {
		if(posicao < this.tarefas.size()) {
			this.tarefas.remove(posicao);
		} else {
			System.out.println("A tarefa não existe.");
		}
	}
	
	// sobrecarga de métodos: todo método possui uma assinatura, composta por nome do método e parametros.
	// posso criar um novo método com mesmo nome, mas com funções diferentes.
	
	public void remover(Tarefa tarefa) {
		this.tarefas.remove(tarefa);
	}
	
	public Tarefa buscar(String descricao) {
		for (Tarefa tarefa: tarefas) {
			if(descricao.equals(tarefa.descricao)) {
				return tarefa;
			}
		}
		System.out.println("Tarefa não encontrada.");
		return null;
	}
	
	public void exibirTarefas() {
		for (Tarefa tarefa: tarefas) {
			tarefa.exibirTarefa();
		}
	}
}
