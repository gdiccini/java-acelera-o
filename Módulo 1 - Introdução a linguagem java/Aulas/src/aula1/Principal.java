package aula1;

import aula1.tarefas.ListaTarefas;
import aula1.tarefas.Tarefa;

public class Principal {
  public static void main(String[] args) {
    ListaTarefas tarefas = new ListaTarefas();

    tarefas.adicionar("tarefa 1");
    tarefas.adicionar("tarefa 2");
    tarefas.adicionar("tarefa 3");

    System.out.println("Minhas Tarefaas");
    System.out.println("----------------");
    tarefas.exibirTarefas();

    tarefas.remover(3);

    System.out.println("Minhas Tarefas após remover");
    System.out.println("----------------");
    tarefas.exibirTarefas();

    System.out.println("Buscar:");
    System.out.println("----------------");
    Tarefa tarefa = tarefas.buscar("tarefa 1");
    tarefa.exibirTarefa();
  }
}
