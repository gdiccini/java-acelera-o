package aula1;

import aula1.tarefas.Tarefa;

public class Principal {
  public static void main(String[] args) {
    System.out.println("Minhas Tarefaas");
    System.out.println("----------------");
    Tarefa task = new Tarefa("tarefa");
    task.showTask();
    System.out.println(task.taskSize());
  }
}
